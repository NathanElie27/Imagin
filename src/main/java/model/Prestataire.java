package model;

import java.util.ArrayList;

public class Prestataire extends Intervenant {

    private boolean forfait;
    private Float coutJournalier;

    public Prestataire() {
    }

    public Prestataire(boolean forfait, Float coutJournalier) {
        super();
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;

    }
}
