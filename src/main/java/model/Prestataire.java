package model;

public class Prestataire extends Intervenant {

    private boolean forfait;
    private Double coutJournalier;
    private Societe societe;

    public Prestataire() {
        super();
    }

    public Prestataire(int id, String nom, String prenom, boolean forfait, Double coutJournalier, Societe societe) {
        super(id, nom, prenom);
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


    @Override
    public double calculCoutProjet(int nbJours) {
        if (this.forfait && this.societe != null) {
            return nbJours * this.societe.getCoutJournalier();
        }
        return nbJours * this.coutJournalier;
    }

}