package TechStore;

public class OrdinateurPortable extends Ordinateur{
    private String capaciteBatterie;

    public OrdinateurPortable(String capaciteBatterie, long disqueDur, String carteGraphique, double resolutionEcran, String processeur, long ram, SystemeExploitation SystemeExploitatin, String nom, double prix) {
        super(disqueDur, carteGraphique, resolutionEcran, processeur, ram, SystemeExploitatin, nom, prix);
        this.capaciteBatterie = capaciteBatterie;
    }

    public String getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(String capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public String toString() {
        return "OrdinateurPortable{" + "capaciteBatterie=" + capaciteBatterie + '}';
    }
    
    @Override
    public int grantirAppareil(){
        return 2;
    };
}
