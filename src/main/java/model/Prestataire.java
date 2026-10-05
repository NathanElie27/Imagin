package model;

import java.util.ArrayList;

public class Prestataire extends Intervenant {

    private boolean forfait;
    private Float coutJournalier;
    private Societe societe;

    public Prestataire() {
    }

    public Prestataire(boolean forfait, Float coutJournalier, Societe societe) {
        super();
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

    public Float getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(Float coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }
}
