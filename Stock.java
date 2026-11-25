package TechStore;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<>();
    }

    public Stock (ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public Stock(ArrayList<String> noms, ArrayList<Double> prix, ArrayList<Long> quantites) {
        this.articleList = new ArrayList<Element>();
        for (int i = 0; i < noms.size(); i++) {
            Element element = new Element(noms.get(i), prix.get(i), quantites.get(i));
            this.articleList.add(element);
        }
    }

    public ArrayList<Element> getArticleList() {
        return articleList;
    }

    public int getArticleNbDistinct() {
        ArrayList<String> distinctArticles = new ArrayList<>();
        for (int i = 0; i < articleList.size(); i++){
            if (distinctArticles.indexOf(articleList.get(i).getReferenceArticle()) == -1){
                distinctArticles.add(articleList.get(i).getReferenceArticle());
            }
        }
        return distinctArticles.size();
    }

    public void setArticleList(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public void ajouterArticle(Article article, long quantite) {
        Element element = new Element(article, quantite);
        this.articleList.add(element);
    }

    public void ajouterArticle(String nom, double prix, long quantite) {
        Element element = new Element(nom, prix, quantite);
        this.articleList.add(element);
    }

    public Element trouverArticle(String reference) {
        for (Element element : articleList) {
            if (element.getReferenceArticle().equals(reference)) {
                return element;
            }
        }
        return null;
    }

    public void modifierArticle(String reference, String newNom, double newPrix, long newQuantite) {
        Element element = trouverArticle(reference);
        if (element != null) {
            element.modifier(newNom, newPrix, newQuantite);
        } else {
            System.out.println("Article with reference " + reference + " not found.");
        }
    }

    public void supprimerArticle(String reference) {
        Element element = trouverArticle(reference);
        if (element != null) {
            articleList.remove(element);
        } else {
            System.out.println("Article with reference " + reference + " not found.");
        }
    }

    public void incrmenterQuantiteArticle(String reference, long quantite) {
        Element element = trouverArticle(reference);
        if (element != null) {
            element.incrementQunatite(quantite);
        } else {
            System.out.println("Article with reference " + reference + " not found.");
        }
    }

    public void decrementerQuantiteArticle(String reference, long quantite) {
        Element element = trouverArticle(reference);
        if (element != null) {
            element.decrementQunatite(quantite);
        } else {
            System.out.println("Article with reference " + reference + " not found.");
        }
    }

    @Override
    public String toString() {
        return "Stock [articleList=" + articleList + "]";
    }
}