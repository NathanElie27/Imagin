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


}
