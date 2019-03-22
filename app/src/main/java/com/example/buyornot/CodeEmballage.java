package com.example.buyornot;

public class CodeEmballage {
    private int id;
    private String produit;

    public CodeEmballage() {
    }

    public CodeEmballage(int id, String produit) {
        this.id = id;
        this.produit = produit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }
}
