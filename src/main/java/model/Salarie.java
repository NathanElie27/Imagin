package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salarie extends Intervenant {

    private LocalDate dtEmbauche;
    private int echelon;

    public Salarie() {
    }

    public Salarie(LocalDate dtEmbauche, int echelon) {
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public Salarie(int id, String nom, String prenom, Categorie categorie, ArrayList<Projet> lesProjets, ArrayList<Affectation> lesAffectations, LocalDate dtEmbauche, int echelon) {
        super(id, nom, prenom, categorie, lesProjets, lesAffectations);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public LocalDate getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(LocalDate dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public void numEchelon(int echelon){
        System.out.println("employe num : " +echelon);
    }
}
