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

}
