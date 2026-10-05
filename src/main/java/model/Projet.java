package model;

public class Projet {

    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private Float budgetPrevu;

    public Projet() {
    }

    public Projet(int id, String nom, int nbJoursHPrevu, Float budgetPrevu) {
        this.id = id;
        this.nom = nom;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.budgetPrevu = budgetPrevu;
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
}
