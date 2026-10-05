package model;

import java.util.ArrayList;

public class Categorie {

    private int id;
    private String nom;
    private ArrayList<Intervenant> lesIntervenants;

    public Categorie() {
    }

    public Categorie(int id, String nom, ArrayList<Intervenant> lesIntervenants) {
        this.id = id;
        this.nom = nom;
        this.lesIntervenants = lesIntervenants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Intervenant> getLesIntervenants() {
        return lesIntervenants;
    }

    public void setLesIntervenants(ArrayList<Intervenant> lesIntervenants) {
        this.lesIntervenants = lesIntervenants;
    }
}
