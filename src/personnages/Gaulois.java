package personnages;

public class Gaulois {
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	/*private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}*/
	
	//Code TP3
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	
	/*public void frapper(Romain romain) { //TP2
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}*/
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}
	//Fin code TP3
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		
		System.out.println(prendreParole() + "« " + "Merci Druide, je sens que ma force est "+this.effetPotion+" fois décuplée"+"»");
		
	}
	
	 @Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
	}
	 
	public static void main(String[] args) {

		//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois("Astérix", 8);		
		System.out.println(asterix);
		//nom de l'objet 
		System.out.println(asterix.getNom());
		//on décomente la méthode to string
		System.out.println(asterix);
		//on verifie le bon fonctionnement de la méthode prendreParole
		System.out.println(asterix.prendreParole());
		//on verifie le bon fonctionnement de la méthode parler
		asterix.parler("Vive les Gaulois !");
		//on verifie le bon fonctionnement de la méthode frapper
		Romain rom = new Romain("Brutus",4);
		asterix.frapper(rom);
		//test de la méthode boirePotion
		asterix.boirePotion(3);
		asterix.boirePotion(5);
		
	}
}
