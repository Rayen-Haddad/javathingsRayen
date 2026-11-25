package TechStore;

public class Peripheriques extends Article{
    private String technologieDeConnexion;
    private String interfaceAvecOrdinateur;

    public Peripheriques(String technologieDeConnexion, String nom, double prix) {
        super(nom, prix);
        this.technologieDeConnexion = technologieDeConnexion;
    }

    public String getTechnologieDeConnexion() {
        return technologieDeConnexion;
    }

    public String getInterfaceAvecOrdinateur() {
        return interfaceAvecOrdinateur;
    }

    public void setTechnologieDeConnexion(String technologieDeConnexion) {
        this.technologieDeConnexion = technologieDeConnexion;
    }

    public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
    }

    @Override
    public String toString() {
        return "Peripheriques{" + "technologieDeConnexion=" + technologieDeConnexion + ", interfaceAvecOrdinateur=" + interfaceAvecOrdinateur + '}';
    }
    
}
