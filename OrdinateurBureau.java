package TechStore;

public class OrdinateurBureau extends Ordinateur {
    private String alimentation;

    public OrdinateurBureau(String alimentation, long disqueDur, String carteGraphique, double resolutionEcran, String processeur, long ram, SystemeExploitation SystemeExploitatin, String nom, double prix) {
        super(disqueDur, carteGraphique, resolutionEcran, processeur, ram, SystemeExploitatin, nom, prix);
        this.alimentation = alimentation;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }
    
    @Override
    public int grantirAppareil(){
        return 1;
    };

    @Override
    public String toString() {
        return "OrdinateurBureau{" + "alimentation=" + alimentation + '}';
    }
}
