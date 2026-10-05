package model;

import java.util.ArrayList;

public class Projet {

    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private Float budgetPrevu;
    private Intervenant intervenant;
    private ArrayList<Affectation> lesAffectations;

    public Projet() {
    }

    public Projet(int id, String nom, int nbJoursHPrevu, Float budgetPrevu, Intervenant intervenant, ArrayList<Affectation> lesAffectations) {
        this.id = id;
        this.nom = nom;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.budgetPrevu = budgetPrevu;
        this.intervenant = intervenant;
        this.lesAffectations = lesAffectations;
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

    public int getNbJoursHPrevu() {
        return nbJoursHPrevu;
    }

    public void setNbJoursHPrevu(int nbJoursHPrevu) {
        this.nbJoursHPrevu = nbJoursHPrevu;
    }

    public Float getBudgetPrevu() {
        return budgetPrevu;
    }

    public void setBudgetPrevu(Float budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public ArrayList<Affectation> getLesAffectations() {
        return lesAffectations;
    }

    public void setLesAffectations(ArrayList<Affectation> lesAffectations) {
        this.lesAffectations = lesAffectations;
    }
}
