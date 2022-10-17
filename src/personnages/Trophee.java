package personnages;

public class Trophee {
    private Gaulois gaulois;
    private Equipement [] equipements;
    
    public Trophee(Gaulois gaulois, Equipement[] equipements) {
        super();
        this.gaulois = gaulois;
        this.equipements = equipements;
    }


    public void setGaulois(Gaulois gaulois) {
        this.gaulois = gaulois;
    }


    public void setEquipements(Equipement[] equipements) {
        this.equipements = equipements;
    }

     public String getNom() {
         return this.gaulois.getNom();
     }

}