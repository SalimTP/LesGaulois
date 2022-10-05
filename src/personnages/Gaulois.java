package personnages;

public class Gaulois {
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
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
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
