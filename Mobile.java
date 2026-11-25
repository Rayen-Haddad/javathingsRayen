package TechStore;

public class Mobile extends AppareilInformatique{
    private double appareilPhotoArriere;
    private double appareilPhotoFrontal;
    private int nbSim;
    private long capaciteBatterie;

    public Mobile(double appareilPhotoArriere, double appareilPhotoFrontal, int nbSim, long capaciteBatterie, double resolutionEcran, String processeur, long ram, SystemeExploitation SystemeExploitatin, String nom, double prix) {
        super(resolutionEcran, processeur, ram, SystemeExploitatin, nom, prix);
        this.appareilPhotoArriere = appareilPhotoArriere;
        this.appareilPhotoFrontal = appareilPhotoFrontal;
        this.nbSim = nbSim;
        this.capaciteBatterie = capaciteBatterie;
    }

    public void setAppareilPhotoArriere(double appareilPhotoArriere) {
        this.appareilPhotoArriere = appareilPhotoArriere;
    }

    public void setAppareilPhotoFrontal(double appareilPhotoFrontal) {
        this.appareilPhotoFrontal = appareilPhotoFrontal;
    }

    public void setNbSim(int nbSim) {
        this.nbSim = nbSim;
    }

    public void setCapaciteBatterie(long capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    public double getAppareilPhotoArriere() {
        return appareilPhotoArriere;
    }

    public double getAppareilPhotoFrontal() {
        return appareilPhotoFrontal;
    }

    public int getNbSim() {
        return nbSim;
    }

    public long getCapaciteBatterie() {
        return capaciteBatterie;
    }
    
    @Override
    public int grantirAppareil(){
        if (this.getPrix() > 1000){
            return 2;
           }
        return 1;
    }

    @Override
    public String toString() {
        return "Mobile{" + "appareilPhotoArriere=" + appareilPhotoArriere + ", appareilPhotoFrontal=" + appareilPhotoFrontal + ", nbSim=" + nbSim + ", capaciteBatterie=" + capaciteBatterie + '}';
    }
}
