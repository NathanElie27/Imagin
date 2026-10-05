package model;

import java.util.ArrayList;

public class Intervenant {

    private int id;
    private String nom;
    private String prenom;
    private Categorie categorie;
    private ArrayList<Projet> lesProjets;
    private ArrayList<Affectation> lesAffectations;

    public Intervenant() {
        super();
    }

    public Intervenant(int id, String nom, String prenom, Categorie categorie, ArrayList<Projet> lesProjets, ArrayList<Affectation> lesAffectations) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.categorie = categorie;
        this.lesProjets = lesProjets;
        this.lesAffectations = lesAffectations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public ArrayList<Projet> getLesProjets() {
        return lesProjets;
    }

    public void setLesProjets(ArrayList<Projet> lesProjets) {
        this.lesProjets = lesProjets;
    }

    public ArrayList<Affectation> getLesAffectations() {
        return lesAffectations;
    }

    public void setLesAffectations(ArrayList<Affectation> lesAffectations) {
        this.lesAffectations = lesAffectations;
    }
}
