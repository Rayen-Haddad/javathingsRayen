package TechStore;

import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("========== GESTION DU STOCK TECHSTORE ==========");
        System.out.println("0. Ajouter un article");
        System.out.println("1. Augmenter la quantité d'un article");
        System.out.println("2. Diminuer la quantité d'un article");
        System.out.println("3. Modifier un article");
        System.out.println("4. Supprimer un article");
        System.out.println("5. Consulter le stock");
        System.out.println("6. Quitter");
        System.out.println("Votre choix: ");
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        Adresse adr1 = new Adresse("Ksar Hellal", 5252);
        Adresse adr2 = new Adresse("Lamta", 5151);
        Adresse adr3 = new Adresse("Moknine", 7141);
        System.out.println(adr3);
        Personne pr1 = new Personne("1122", "Ahmed", "Mohammed", adr1);
        Personne pr2 = new Personne("1133", "Hamida", "Hamdi", "Tunis", 51111);

        System.out.println(pr1);
        System.out.println(pr2.toString());

        pr1.setNom("Samir");

        pr1.setPrenom("Sami");

        adr1.setGouvernorat("Sousse");
        adr1.setCodePostal(4000);
        System.out.println("after update");
        System.out.println(pr1.toString());
        int chx = 0;
        Stock stock = new Stock();
        while (chx != 6) {
            menu();
            chx = scan.nextInt();
            scan.nextLine();
                switch (chx) {
                    case 0:
                        System.out.println("Nom Article: ");
                        String nom = scan.nextLine();
                        System.out.println("Prix: ");
                        double prix = scan.nextDouble();
                        System.out.println("Quantité: ");
                        int quantite = scan.nextInt();
                        stock.ajouterArticle(nom, prix, quantite);
                        break;
                    case 1:
                        System.out.println("Ref: ");
                        String ref = scan.nextLine();
                        System.out.println("Quantité: ");
                        quantite = scan.nextInt();
                        stock.incrmenterQuantiteArticle(ref, quantite);
                        break;
                    case 2:
                        System.out.println("Ref: ");
                        ref = scan.nextLine();
                        System.out.println("Quantité: ");
                        quantite = scan.nextInt();
                        stock.decrementerQuantiteArticle(ref, quantite);
                        break;
                    case 3:
                        System.out.println("Ref: ");
                        ref = scan.nextLine();
                        System.out.println("Nom Article: ");
                        nom = scan.nextLine();
                        System.out.println("Prix: ");
                        prix = scan.nextDouble();
                        System.out.println("Quantité: ");
                        quantite = scan.nextInt();
                        stock.modifierArticle(ref, nom, prix, quantite);
                        break;
                    case 4:
                        System.out.println("Ref: ");
                        ref = scan.nextLine();
                        stock.supprimerArticle(ref);
                        break;
                    case 5:
                        System.out.println("Stock:");
                        for (int i = 0; i < stock.getArticleList().size(); i++) {
                            System.out.println(stock.getArticleList().get(i));
                        }
                        break;
                    case 6:
                        System.out.println("Quitter");
                        break;
                    default:
                        System.out.println("Choix invalide");
                }
            }
            for (SystemeExploitation s: SystemeExploitation.values()){
                System.out.println(s);
            }
        }
}