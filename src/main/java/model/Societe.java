package model;

import java.util.ArrayList;

public class Societe {

    private int id;
    private String raisonSociale;
    private String adresse;
    private String copos;
    private String ville;
    private Float coutJournalier;
    private ArrayList<Prestataire> lesPrestataires;

    public Societe() {
    }

    public Societe(int id, String raisonSociale, String adresse, String copos, String ville, Float coutJournalier, ArrayList<Prestataire> lesPrestataires) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.copos = copos;
        this.ville = ville;
        this.coutJournalier = coutJournalier;
        this.lesPrestataires = lesPrestataires;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCopos() {
        return copos;
    }

    public void setCopos(String copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Float getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(Float coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public ArrayList<Prestataire> getLesPrestataires() {
        return lesPrestataires;
    }

    public void setLesPrestataires(ArrayList<Prestataire> lesPrestataires) {
        this.lesPrestataires = lesPrestataires;
    }
}
