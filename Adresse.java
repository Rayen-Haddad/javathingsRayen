package TechStore;

public class Adresse {
    private String gouvernorat;
    private int codePostal;

    public Adresse(String gouvernorat, int codePostal) {
        this.gouvernorat = gouvernorat;
        this.codePostal = codePostal;
    }



    public String getGouvernorat(){
        return gouvernorat;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setGouvernorat(String new_value){
        this.gouvernorat = new_value;
    }

    public void setCodePostal(int new_value){
        this.codePostal = new_value;
    }
    @Override
    public String toString(){
        return "Adresse [gouvernorat=" + this.gouvernorat + ", codePostal=" + this.codePostal+ "]";
    }
}