package Histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		//Sc�nario 1
		/*
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);*/
		
		//Sc�nario 2
		
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller pr�parer une petite potion..");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix",15);
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		Gaulois asterix = new Gaulois("Ast�rix",8);
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}