package com.example.buyornot;

import java.util.ArrayList;

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
    private int fruitsLegumes;
    private int fibresAlimentaires;
    private ArrayList<Additif> lesAdditifs;
    private ArrayList<Allegene> lesAllergenes;
    private ArrayList<Categorie> lesCategories;
    private CodeEmballage leCodeEmballage;
    private ArrayList<Conditionnement> lesConditionnements;
    private ArrayList<Label> lesLabels;
    private ArrayList<Lien> lesLiens;
    private ArrayList<LieuxDeFabrication> lesLieuxDeFabrications;
    private ArrayList<Magasin> lesMagasins;
    private Marque laMarque;
    private Nova leNova;
    private Nutriscore leNutriscore;
    private ArrayList<Pays> lesPaysDOrigine;
    private ArrayList<Pays> lesPaysDeVente;

    public Produit() {
    }

    public Produit(String libelle, long codeBarre, int quantite, String ingredients, int energie, int matiereGrasse, int acidesGras,
                   int glucides, int sucres, int proteine, int sel, int sodium, int nutriscore, int fruitsLegumes, int fibresAlimentaires) {
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
        this.fruitsLegumes = fruitsLegumes;
        this.fibresAlimentaires = fibresAlimentaires;
    }

    public Produit(int id, String libelle, long codeBarre, int quantite, String ingredients, int energie, int matiereGrasse, int acidesGras,
                   int glucides, int sucres, int proteine, int sel, int sodium, int nutriscore, int fruitsLegumes, int fibresAlimentaires) {
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
        this.fruitsLegumes = fruitsLegumes;
        this.fibresAlimentaires = fibresAlimentaires;
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

    public int getFruitsLegumes() {
        return fruitsLegumes;
    }

    public void setFruitsLegumes(int fruitsLegumes) { this.fruitsLegumes = fruitsLegumes; }

    public int getFibresAlimentaires() {
        return fibresAlimentaires;
    }

    public void setFibresAlimentaires(int fibresAlimentaires) { this.fibresAlimentaires = fibresAlimentaires; }

    public ArrayList<Additif> getLesAdditifs() { return lesAdditifs; }

    public void setLesAdditifs(ArrayList<Additif> lesAdditifs) { this.lesAdditifs = lesAdditifs; }

    public void addUnAdditif (Additif unAdditif) {
        if (lesAdditifs == null){
            lesAdditifs = new ArrayList<Additif>();
        }
        lesAdditifs.add(unAdditif);
    }

    public ArrayList<Allegene> getLesAllergenes() { return lesAllergenes; }

    public void setLesAllergenes(ArrayList<Allegene> lesAllergenes) { this.lesAllergenes = lesAllergenes; }

    public void addUnAllergene (Allegene unAllergene) {
        if (lesAllergenes == null){
            lesAllergenes = new ArrayList<Allegene>();
        }
        lesAllergenes.add(unAllergene);
    }

    public ArrayList<Categorie> getLesCategories() { return lesCategories; }

    public void setLesCategories(ArrayList<Categorie> lesCategories) { this.lesCategories = lesCategories; }

    public void addUneCategorie (Categorie uneCategorie) {
        if (lesCategories == null){
            lesCategories = new ArrayList<Categorie>();
        }
        lesCategories.add(uneCategorie);
    }

    public CodeEmballage getLeCodeEmballage() { return leCodeEmballage; }

    public void setLeCodeEmballage(CodeEmballage leCodeEmballage) { this.leCodeEmballage = leCodeEmballage; }

    public ArrayList<Conditionnement> getLesConditionnements() { return lesConditionnements; }

    public void setLesConditionnements(ArrayList<Conditionnement> lesConditionnements) { this.lesConditionnements = lesConditionnements; }

    public void addUnConditionnement (Conditionnement unConditionnement) {
        if (lesConditionnements == null){
            lesConditionnements = new ArrayList<Conditionnement>();
        }
        lesConditionnements.add(unConditionnement);
    }

    public ArrayList<Label> getLesLabels() { return lesLabels; }

    public void setLesLabels(ArrayList<Label> lesLabels) { this.lesLabels = lesLabels; }

    public void addUnLabel (Label unLabel) {
        if (lesLabels == null){
            lesLabels = new ArrayList<Label>();
        }
        lesLabels.add(unLabel);
    }

    public ArrayList<Lien> getLesLiens() { return lesLiens; }

    public void setLesLiens(ArrayList<Lien> lesLiens) { this.lesLiens = lesLiens; }

    public void addUnLien (Lien unLien) {
        if (lesLiens == null){
            lesLiens = new ArrayList<Lien>();
        }
        lesLiens.add(unLien);
    }

    public ArrayList<LieuxDeFabrication> getLesLieuxDeFabrications() { return lesLieuxDeFabrications; }

    public void setLesLieuxDeFabrications(ArrayList<LieuxDeFabrication> lesLieuxDeFabrications) { this.lesLieuxDeFabrications = lesLieuxDeFabrications; }

    public void addUnLieuDeFabrication (LieuxDeFabrication unLieuDeFabrication) {
        if (lesLieuxDeFabrications == null){
            lesLieuxDeFabrications = new ArrayList<LieuxDeFabrication>();
        }
        lesLieuxDeFabrications.add(unLieuDeFabrication);
    }

    public ArrayList<Magasin> getLesMagasins() { return lesMagasins; }

    public void setLesMagasins(ArrayList<Magasin> lesMagasins) { this.lesMagasins = lesMagasins; }

    public void addUnMagasin (Magasin unMagasin) {
        if (lesMagasins == null){
            lesMagasins = new ArrayList<Magasin>();
        }
        lesMagasins.add(unMagasin);
    }

    public Marque getLaMarque() { return laMarque; }

    public void setLaMarque(Marque laMarque) { this.laMarque = laMarque; }

    public Nova getLeNova() { return leNova; }

    public void setLeNova(Nova leNova) { this.leNova = leNova; }

    public Nutriscore getLeNutriscore() { return leNutriscore; }

    public void setLeNutriscore(Nutriscore leNutriscore) { this.leNutriscore = leNutriscore; }

    public ArrayList<Pays> getLesPaysDOrigine() { return lesPaysDOrigine; }

    public void setLesPaysDOrigine(ArrayList<Pays> lesPaysDOrigine) { this.lesPaysDOrigine = lesPaysDOrigine; }

    public void addUnPays (Pays unPaysDOrigine) {
        if (lesPaysDOrigine == null){
            lesPaysDOrigine = new ArrayList<Pays>();
        }
        lesPaysDOrigine.add(unPaysDOrigine);
    }

    public ArrayList<Pays> getLesPaysDeVente() { return lesPaysDeVente; }

    public void setLesPaysDeVente(ArrayList<Pays> lesPaysDeVente) { this.lesPaysDeVente = lesPaysDeVente; }

    public void addUnPaysDeVente (Pays unPaysDeVente) {
        if (lesPaysDeVente == null){
            lesPaysDeVente = new ArrayList<Pays>();
        }
        lesPaysDeVente.add(unPaysDeVente);
    }
}
