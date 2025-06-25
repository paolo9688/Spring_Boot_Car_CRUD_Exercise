package com.example.car_crud_exercise.entity.enums;

public enum CarType {
    UTILITARIA("Macchina utilitaria per tutte le esigenze"),
    SPORTIVA("Macchina bassa sportiva"),
    STATIONWAGON("Macchina adatta alle famiglie"),
    SUV("Macchina grande per il fuoristrada");

    private final String descrizione;

    CarType(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}