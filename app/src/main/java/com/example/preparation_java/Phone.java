package com.example.preparation_java;

public class Phone {
    String nom,reference;
    int quantiteStock; int anneeSortie;Double prix;

    public Phone(String nom,String reference,int anneeSortie,int quantiteStock,Double prix){
        this.nom=nom;
        this.reference=reference;
        this.quantiteStock=quantiteStock;
        this.anneeSortie=anneeSortie;
        this.prix=prix;
    }

    @Override
    public String toString(){
        return "Phone{"+
                "nom="+nom+
                ",reference="+reference+
                ",quantiteStock="+quantiteStock+
                ",anneeSortie="+anneeSortie+
                ",prix="+prix+
                '}';

    }


}
