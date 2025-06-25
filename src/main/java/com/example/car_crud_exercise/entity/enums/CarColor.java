package com.example.car_crud_exercise.entity.enums;

public enum CarColor {
    GRIGIA("Colore grigio metallizzato"),
    BIANCA("Colore bianco panna"),
    ROSSA("Colore rosso fluorescente"),
    BLU("Colore blu perlato");

    private final String descrizione;

    CarColor(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}