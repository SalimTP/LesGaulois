package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert (force>0);
			this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert (force>0);
		int forceTemp=force-forceCoup;
		force -= forceCoup;
		if (force > 0) {
				parler("Aïe");
		} else {
				parler("J'abandonne...");
		}
		assert(force==forceTemp);
	}
	
	public static void main(String[] args) {
		Romain rom = new Romain("Brutus",6);
		//on verifie le bon fonctionnement de la méthode prendreParole
		System.out.println(rom.prendreParole());
		//on verifie le bon fonctionnement de la méthode parler
		rom.parler("Longue vie à Rome !");
		//on verifie le bon fonctionnement de la méthode recevoirCoup
		rom.recevoirCoup(2);
	}
}