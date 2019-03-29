package com.example.buyornot;

public class Produit {
    private int id;
    private String libelle;
    private long codeBarre;
    private int quantite;
    private String ingredients;
    private int energie;
    private int matiereGrasse;
    private int acidesGras;
    private int glucides;
    private int sucres;
    private int proteine;
    private int sel;
    private int sodium;
    private int nutriscore;

    public Produit() {
    }

    public Produit(int id, String libelle, long codeBarre, int quantite, String ingredients, int energie, int matiereGrasse, int acidesGras,
                   int glucides, int sucres, int proteine, int sel, int sodium, int nutriscore) {
        this.id = id;
        this.libelle = libelle;
        this.codeBarre = codeBarre;
        this.quantite = quantite;
        this.ingredients = ingredients;
        this.energie = energie;
        this.matiereGrasse = matiereGrasse;
        this.acidesGras = acidesGras;
        this.glucides = glucides;
        this.sucres = sucres;
        this.proteine = proteine;
        this.sel = sel;
        this.sodium = sodium;
        this.nutriscore = nutriscore;
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

    public long getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(long codeBarre) {
        this.codeBarre = codeBarre;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public int getMatiereGrasse() {
        return matiereGrasse;
    }

    public void setMatiereGrasse(int matiereGrasse) {
        this.matiereGrasse = matiereGrasse;
    }

    public int getAcidesGras() {
        return acidesGras;
    }

    public void setAcidesGras(int acidesGras) {
        this.acidesGras = acidesGras;
    }

    public int getGlucides() {
        return glucides;
    }

    public void setGlucides(int glucides) {
        this.glucides = glucides;
    }

    public int getSucres() {
        return sucres;
    }

    public void setSucres(int sucres) {
        this.sucres = sucres;
    }

    public int getProteine() {
        return proteine;
    }

    public void setProteine(int proteine) {
        this.proteine = proteine;
    }

    public int getSel() {
        return sel;
    }

    public void setSel(int sel) {
        this.sel = sel;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getNutriscore() {
        return nutriscore;
    }

    public void setNutriscore(int nutriscore) {
        this.nutriscore = nutriscore;
    }
}
