package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	//private Gaulois[] villageois = new Gaulois[nbVillageois];
	private Gaulois[] villageois;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;		
		this.villageois=new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		
		
		
		this.villageois[nbVillageois]=gaulois;
		nbVillageois++;
		
	}
	public Gaulois trouverHabitant(int numeroVillageois) {
		if (numeroVillageois<=nbVillageois) {		
			return villageois[numeroVillageois];			
		}
	//Cas d'erreur si on cherche le villageois numero 18 alors qu'il n'y a que 14 villageois dans le village
	//On return un mec random
	return new Gaulois("Erreur", 5);
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+this.chef.getNom()+" vivent les légendaires gaulois :");
		for(int i=0;i<this.nbVillageois;i++)		
			System.out.println("- "+this.villageois[i].getNom());			
		
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		/*On aura comme erreur :
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			*village cannot be resolved

			*at LesGaulois/personnages.Village.main(Village.java:34)
		 */
		//On obtient cette erreur car on crée un objet de type Gaulois et on essaye d'accéder à une fonction
		//qui appartient à la classe Village. Ce qui est impossible.
		Chef chef = new Chef("Abraracourcix",6,10,village);
		village.setChef(chef);
		Gaulois asterix= new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//On obtient comme resultat : 
		//null
		//Le chef ne fait pas partie du village, donc on a que l'élément d'indice 0 qui existe et on essaye d'accéder à l'ément
		//d'indice 1 qui n'existe pas soit null
		Gaulois obelix= new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
	
}
