
package com.example.preparation_java;

import java.time.LocalDate;
import java.time.Period;

public class Employe {
    String Matricule, Nom, Prenom;
    LocalDate DateNaissance, DateEmbauche;
    Double Salaire;

   public Employe(String Matricule , String Nom ,String Prenom , LocalDate DateNaissance,LocalDate DateEmbauche ,Double Salaire){
       this.Matricule=Matricule;
       this.Nom=Nom;
       this.Prenom=Prenom;
       this.DateNaissance=DateNaissance;
       this.DateEmbauche=DateEmbauche;
       this.Salaire=Salaire;
   }

    public int Age() {
       return (Period.between(DateNaissance,LocalDate.now()).getYears());

    }
    public  int Anciennete(){
       return (Period.between(DateEmbauche,LocalDate.now()).getYears());
    }
    public Double AugmentationDuSaliare(){
       int Anciennete=Anciennete();
       if (Anciennete<5){
            Salaire *= 1.02;
       }else if(Anciennete<10){
            Salaire *= 1.05;
       }
       else {
            Salaire*=1.01;
       }
       return Salaire;
     }
    public void AfficherEmploye(){
        System.out.println("Matricule " + Matricule);
        System.out.println("Nom et Prenom" +Nom.toUpperCase()+Character.toUpperCase(Prenom.charAt(0))+Prenom.substring(1));
        System.out.println("Age"+ Age());
        System.out.println("Anciennete" + Anciennete());
        System.out.println("Salaire "+ AugmentationDuSaliare());
    }

    public static void main(String[] args) {
        LocalDate DateNiassance=LocalDate.of(2003,9,25);
        LocalDate DateEmbauche =LocalDate.of(2006,7,5);
        Employe employe=new Employe("QB12345","felate","suofyane",DateNiassance,DateEmbauche,904573.78);
        employe.AfficherEmploye();
        employe.Anciennete();
        employe.AugmentationDuSaliare();
    }
}

