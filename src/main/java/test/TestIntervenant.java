package test;

import java.time.LocalDate;
import model.Prestataire;
import model.Salarie;
import model.Societe;

public class TestIntervenant {

    public static void main(String[] args) {

        Societe uneSociete = new Societe(1, "Aidec", "12 rue de Paris", "75000", "Paris", 700.0);

        Salarie unSalarie = new Salarie(1, "ELIE", "Nathan", LocalDate.now(), 2);

        Prestataire unPrestaForfait = new Prestataire(2, "Bob", "Greg", true, 500.0, uneSociete);
        Prestataire unPrestaNonForfait = new Prestataire(3, "Martin", "Masson", false, 450.0, uneSociete);

        System.out.println(unSalarie.getNom() +" "+ unSalarie.getPrenom() +" : "+ unSalarie.calculCoutProjet(100) +" euros");
        System.out.println(unPrestaForfait.getNom() +" "+ unPrestaForfait.getPrenom() +" : "+ unPrestaForfait.calculCoutProjet(100) +" euros");
        System.out.println(unPrestaNonForfait.getNom() +" "+ unPrestaNonForfait.getPrenom() +" : "+ unPrestaNonForfait.calculCoutProjet(100) +" euros");

    }

}