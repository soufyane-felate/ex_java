package com.example.preparation_java;

public class Article {
    String code;
    String designation;
    Double prix;
    String categorie;

    public Article(String code, String designation, Double prix, String categorie) throws CatégorieInvalideException {
        if (!categorie.equals("Informatique") && !categorie.equals("Bureautique")) {
            throw new CatégorieInvalideException("Catégorie invalide");
        }
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.categorie = categorie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article{" +
                "code='" + code + '\'' +
                ", prix=" + prix +
                ", designation='" + designation + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Article)) return false;
        Article article = (Article) obj;
        return Double.compare(article.prix, prix) == 0 &&
                code.equals(article.code) &&
                designation.equals(article.designation) &&
                categorie.equals(article.categorie);
    }
}

class CatégorieInvalideException  extends Exception {
    public CatégorieInvalideException(String message) {
        super(message);
    }
}
class ArticleEnSolde extends Article {
    double remise;

    public ArticleEnSolde(String code, String designation, Double prix, String categorie, double remise) throws CatégorieInvalideException {
        super(code, designation, prix, categorie);
        this.remise = remise;
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }
}
