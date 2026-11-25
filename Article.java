package TechStore;

public class Article {
    private static int id = -1;
    private String nom;
    private String refrence;
    private double prix;

    public Article(String nom, double prix) {
        this.id = ++id;
        this.nom = nom;
        this.refrence = genRef(nom);
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getRefrence() {
        return refrence;
    }

    public double getPrix() {
        return prix;
    }

    public String genRef(String nom){
        String res = "";
        for (int i =0; i < nom.length(); i++){
            if (nom.charAt(i) == ' '){
                continue;
            }
            if ( i % 5 == 0){
                res += nom.charAt(i);
            }
        }
        return "" + res + this.id;
    }

    public void setNom(String nom) {
        this.nom = nom;
        this.refrence = genRef(nom);
    }

    public void setRefrence(String refrence) {
        this.refrence = refrence;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }



    public void modifier(String nom){
        this.nom = nom;
        this.refrence = genRef(nom);
    }
    public void modifier(String nom, double prix){
        this.nom = nom;
        this.refrence = genRef(nom);
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", refrence=" + refrence + ", prix=" + prix + "";
    }
}