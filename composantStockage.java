package TechStore;

public class composantStockage extends Article implements Grantissable {
    private int capacite;
    public composantStockage(int capacite, String nom, double prix) {
        super(nom, prix);
        this.capacite = capacite; 
    }

    @Override
    public String toString() {
        return "composantStockage{" + "capacite=" + capacite + '}';
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getCapacite() {
        return capacite;
    }
    
    
    @Override
    public int grantirAppareil(){
        if (capacite <= 500){
            return 1;
        }
        return 2;
    };
}
