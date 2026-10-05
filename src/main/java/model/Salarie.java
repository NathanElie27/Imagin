package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salarie extends Intervenant {

    private LocalDate dtEmbauche;
    private int echelon;

    public Salarie() {
    }

    public Salarie(LocalDate dtEmbauche, int echelon) {
        super();
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public LocalDate getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(LocalDate dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }
}
