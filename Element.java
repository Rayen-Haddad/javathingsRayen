package TechStore;

public class Element {
    private Article article;
    private long quantite;

    public Element(Article article, long quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public Element(String nom, double prix,long quantite) {
        this.article = new Article(nom, prix);
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public long getQuantite() {
        return quantite;
    }

    public String getReferenceArticle(){
        return this.article.getRefrence();
    }

    public String getNomArticle(){
        return this.article.getNom();
    }

    public double getPrixArticle(){
        return this.article.getPrix();
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQuantite(long quantite) {
        if (quantite > 0 && quantite <= this.quantite){
            this.quantite = quantite;
        }
    }

    public void incrementQunatite(long n){
        this.quantite += n;
    }

    public void decrementQunatite(long n){
        if (n > 0 && n <= this.quantite) {
            this.quantite -= n;
        }
    }

    public void modifier(String x, double prix , long q){
        this.article.modifier(x, prix);
        this.quantite = q;
    }

    public boolean equals(String ref){
        if (this.article.getRefrence().equals(ref)){
            return true;
        } return false;
    }

    public boolean equals(Article art){
        if (this.article.getRefrence().equals(art.getRefrence())){
            return true;
        } return false;
    }

    @Override
    public String toString() {
        return "article:" + article + ", quantite=" + quantite + "";
    }
}