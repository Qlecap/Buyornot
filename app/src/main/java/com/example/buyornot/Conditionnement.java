package com.example.buyornot;

public class Conditionnement {
    private int id;
    private String libelle;

    public Conditionnement() {
    }

    public Conditionnement(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
