package com.example.buyornot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pays {
    private int id;
    private String libelle;

    public Pays(){}
    public Pays(int id, String libelle) {
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
