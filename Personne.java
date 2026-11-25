package TechStore;

public class Personne {

    private String cin;
    private String nom;
    private String prenom;
    private Adresse address;



    public Personne(String cin, String nom, String prenom, Adresse address) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
    }

    public Personne(String cin, String nom, String prenom, String gouvernorat, int codePostal) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.address = new Adresse(gouvernorat, codePostal);
    }
    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getAddress() {
        return address;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAddress(Adresse address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", address=" + address + "";
    }
}