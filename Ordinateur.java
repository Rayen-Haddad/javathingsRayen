package TechStore;

public abstract class Ordinateur extends AppareilInformatique {
    private long disqueDur;
    private String carteGraphique;

    public Ordinateur(long disqueDur, String carteGraphique, double resolutionEcran, String processeur, long ram, SystemeExploitation SystemeExploitatin, String nom, double prix) {
        super(resolutionEcran, processeur, ram, SystemeExploitatin, nom, prix);
        this.disqueDur = disqueDur;
        this.carteGraphique = carteGraphique;
    }

    public long getDisqueDur() {
        return disqueDur;
    }

    public String getCarteGraphique() {
        return carteGraphique;
    }


    public void setDisqueDur(long disqueDur) {
        this.disqueDur = disqueDur;
    }

    public void setCarteGraphique(String carteGraphique) {
        this.carteGraphique = carteGraphique;
    }

    @Override
    public abstract int grantirAppareil();

    @Override
    public String toString() {
        return "Ordinateur{" + "disqueDur=" + disqueDur + ", carteGraphique=" + carteGraphique + '}';
    }
    
}
