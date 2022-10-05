package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	//ancienne methode
	/*
	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion=random.nextInt(effetPotionMax);
		if (this.forcePotion>7)
			System.out.println("J'ai pr�par� une super potion de force "+this.forcePotion);
		else
			System.out.println("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force "+this.forcePotion);		
	}*/
	
	//nouvelle methode
	public void preparerPotion() {
		Random random = new Random();
		int borneSup=effetPotionMax+1;
		this.forcePotion = effetPotionMin + random.nextInt(borneSup - effetPotionMin);
		if (this.forcePotion>7)
			System.out.println("J'ai pr�par� une super potion de force " +this.forcePotion);
		else
			System.out.println("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " +this.forcePotion);		
	}
	public void booster(Gaulois gaul) {
		if(gaul.getNom()=="Ob�lix")
			System.out.println("Non, Ob�lix !... Tu n�auras pas de potion magique !");
		else
			System.out.println("J'ai fait boire ma potion magique � "+gaul.getNom());
		
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		//Tests pour la m�thode preparerPotion
		for(int i=0;i<15;i++) {
			panoramix.preparerPotion();
		}
	}
	
}