package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement [] equipements = new Equipement[2];
	private int nbEquipement=0;
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
	public void sEquiper(Equipement equip) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat "+ this.nom+" est déjà bien protégé !");
			break;
		case 1:
			if(this.equipements[0].toString()==equip.toString() )
				System.out.println("Le soldat "+this.nom+" possède déjà un "+ this.equipements[0].toString()+ " !");
			else {
				switchPrvivate(equip);
			}
			break;
		case 0:
			switchPrvivate(equip);
			break;
		}
			
			
		
	}
	private void switchPrvivate(Equipement equip) {
		if("casque"==equip.toString())
			System.out.println("Le soldat "+this.nom+" s’équipe avec un casque !");
		else
			System.out.println("Le soldat "+this.nom+" s’équipe avec un bouclier !");
		equipements[nbEquipement]=equip;	
		nbEquipement++;
	}
	
	public static void main(String[] args) {
		Romain rom = new Romain("Brutus",4);
		//on verifie le bon fonctionnement de la méthode prendreParole
		System.out.println(rom.prendreParole());
		//on verifie le bon fonctionnement de la méthode parler
		rom.parler("Longue vie à Rome !");
		//on verifie le bon fonctionnement de la méthode recevoirCoup
		rom.recevoirCoup(2);
		
		//TP2
		Equipement equi = Equipement.CASQUE; 		
	    System.out.println(equi);	 
	    equi = Equipement.BOUCLIER;
	    Romain minus = new Romain("Minus",4);
	    equi = Equipement.CASQUE;
	    minus.sEquiper(equi);
	    minus.sEquiper(equi);
	    equi = Equipement.BOUCLIER;
	    minus.sEquiper(equi);
	    equi = Equipement.CASQUE;
	    minus.sEquiper(equi);
	}
}