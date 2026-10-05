package model;

import java.util.ArrayList;

public class Affectation {

    private String annee;
    private int semaine;
    private int tempsPasse;
    private ArrayList<Intervenant> lesIntervenants;
    private ArrayList<Projet> lesProjets;

    public Affectation() {
    }

    public Affectation(String annee, int semaine, int tempsPasse, ArrayList<Intervenant> lesIntervenants, ArrayList<Projet> lesProjets) {
        this.annee = annee;
        this.semaine = semaine;
        this.tempsPasse = tempsPasse;
        this.lesIntervenants = lesIntervenants;
        this.lesProjets = lesProjets;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public int getSemaine() {
        return semaine;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    public int getTempsPasse() {
        return tempsPasse;
    }

    public void setTempsPasse(int tempsPasse) {
        this.tempsPasse = tempsPasse;
    }

    public ArrayList<Intervenant> getLesIntervenants() {
        return lesIntervenants;
    }

    public void setLesIntervenants(ArrayList<Intervenant> lesIntervenants) {
        this.lesIntervenants = lesIntervenants;
    }

    public ArrayList<Projet> getLesProjets() {
        return lesProjets;
    }

    public void setLesProjets(ArrayList<Projet> lesProjets) {
        this.lesProjets = lesProjets;
    }
}
