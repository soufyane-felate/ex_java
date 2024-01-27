package com.example.preparation_java.article2;

public class article2 {
    int code;
    double prix;
    String  designation,categorie;
    public article2(int code ,double prix,String designation,String categorie) throws CategoriInvalidExeption{
        if (!categorie.equals("informatique")||!categorie.equals("Bureutique")){
            throw new CategoriInvalidExeption("categorie Invalid");
        }
    }
    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        this.prix=prix;
    }
    public String toString(){
        return "article {"+
                "code ="+code+'\''+
                ",prix= "+prix+
                ",designation="+designation+'\''+
                ",categorie="+categorie;
    }
     class CategoriInvalidExeption extends Exception  {
        public CategoriInvalidExeption (String message ){super(message);}

    }
    public boolean equals(Object obj){
        if (this==obj)return true;
        return false;
    }


}
