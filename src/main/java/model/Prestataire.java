package model;

import java.util.ArrayList;

public class Prestataire extends Intervenant {

    private boolean forfait;
    private Double coutJournalier = 550.0;
    private Societe societe;

    public Prestataire() {
    }

    public Prestataire(boolean forfait, Double coutJournalier, Societe societe) {
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
        this.societe = societe;
    }

    public Prestataire(int id, String nom, String prenom, Categorie categorie, ArrayList<Projet> lesProjets, ArrayList<Affectation> lesAffectations, boolean forfait, Double coutJournalier, Societe societe) {
        super(id, nom, prenom, categorie, lesProjets, lesAffectations);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
        this.societe = societe;
    }

    public boolean isForfait() {
        return forfait;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public Double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(Double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }


}
