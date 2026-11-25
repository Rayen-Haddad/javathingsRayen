package TechStore;

public abstract class AppareilInformatique extends Article implements Grantissable {
    private double resolutionEcran;
    private String processeur;
    private long ram;
    SystemeExploitation SystemeExploitatin;
    public AppareilInformatique(double resolutionEcran, String processeur, long ram, SystemeExploitation SystemeExploitatin, String nom, double prix) {
        super(nom, prix);
        this.resolutionEcran = resolutionEcran;
        this.processeur = processeur;
        this.ram = ram;
        this.SystemeExploitatin = SystemeExploitatin;
    }
    
    @Override
    public abstract int grantirAppareil();

    public double getResolutionEcran() {
        return resolutionEcran;
    }

    public String getProcesseur() {
        return processeur;
    }

    public long getRam() {
        return ram;
    }

    public SystemeExploitation getSystemeExploitatin() {
        return SystemeExploitatin;
    }

    public void setResolutionEcran(double resolutionEcran) {
        this.resolutionEcran = resolutionEcran;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public void setRam(long ram) {
        this.ram = ram;
    }

    public void setSystemeExploitatin(SystemeExploitation SystemeExploitatin) {
        this.SystemeExploitatin = SystemeExploitatin;
    }
    
    
    
}
