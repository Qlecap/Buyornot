package com.example.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class ConsultationProduit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_consultation_produit);
        Intent intent = getIntent();

        // vérifie qu'une valeur est associée à la clé “id”
        int id = intent.getIntExtra("id",-1);

        // nouveau produit
        Produit unProduit = new Produit();
        //preparation de la connexion a la base
        ProduitManager produitmanager = new ProduitManager(this);

        produitmanager.open();
        unProduit = produitmanager.getProduit(id);
        produitmanager.close();

        TextView libelleProduit = (TextView) findViewById(R.id.libelleProduit);
        libelleProduit.setText(unProduit.getLibelle());

        TextView codeBarreProduit = (TextView) findViewById(R.id.codeBarreProduit);
        long codeB = unProduit.getCodeBarre();
        codeBarreProduit.setText(Long.toString(codeB));
        /*
        TextView marque = (TextView) findViewById(R.id.marque);
        marque.setText(unProduit.getMarque().getProduit());
*/
        TextView quantite = (TextView) findViewById(R.id.quantite);
        quantite.setText(Integer.toString(unProduit.getQuantite()));
/*
        TextView conditionnement = (TextView) findViewById(R.id.conditionnement);
        conditionnement.setText(unProduit.getConditionnement().getLibelle());

        TextView categories = (TextView) findViewById(R.id.categories);
        Categorie lesCategories = unProduit.getCategories();
        String libCategories = "";

        //boucle pour concatener les libelles des categories en une variable
        categories.setText(libCategories);

        TextView origineIngredients = (TextView) findViewById(R.id.origineIngredients);
        ArrayList<LieuxDeFabrication> lesPaysOrigine = unProduit.getLieuxDeFabrication();
        String libPaysOrigine = "";
        //
        //boucle pour concatener les libelles des pays d'origine en une variable
        origineIngredients.setText(libPaysOrigine);

        TextView paysDeVente = (TextView) findViewById(R.id.paysDeVente);
        ArrayList<Pays> lesPaysVente = unProduit.getPaysVente();
        String libPaysVente = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        paysDeVente.setText(libPaysVente);

        TextView nova = (TextView) findViewById(R.id.nova);
        nova.setText(unProduit.getNova().getLibelle);
*/
        TextView nutriscore = (TextView) findViewById(R.id.nutriscore);
        nutriscore.setText(Integer.toString(unProduit.getNutriscore()));

        TextView ingredients = (TextView) findViewById(R.id.ingredients);
        ingredients.setText(unProduit.getIngredients());
/*
        TextView allergenes = (TextView) findViewById(R.id.allergenes);
        ArrayList<Allegene> lesAllergenes = unProduit.getAllergenes();
        String libAllergenes = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        allergenes.setText(libAllergenes);

        TextView additifs = (TextView) findViewById(R.id.additifs);
        ArrayList<Additif> lesAdditifs = unProduit.getAdditifs();
        String libAdditifs = "";

        //boucle pour concatener les libelles des pays d'origine en une variable
        additifs.setText(libAdditifs);
*/
        TextView tauxFruitsLegum = (TextView) findViewById(R.id.tauxFruitsLegum);
        tauxFruitsLegum.setText(Integer.toString(unProduit.getFruitsLegumes()));

        //Reperes nutritionnels

        TextView energie = (TextView) findViewById(R.id.energie);
        energie.setText(Integer.toString(unProduit.getEnergie()));

        TextView matatiereGrass = (TextView) findViewById(R.id.matGrass);
        matatiereGrass.setText(Integer.toString(unProduit.getMatiereGrasse()));

        TextView acidesGrasStatures = (TextView) findViewById(R.id.acidesGrasStatures);
        acidesGrasStatures.setText(Integer.toString(unProduit.getAcidesGras()));

        TextView glucides = (TextView) findViewById(R.id.glucides);
        glucides.setText(Integer.toString(unProduit.getGlucides()));

        TextView sucres = (TextView) findViewById(R.id.sucres);
        sucres.setText(Integer.toString(unProduit.getSucres()));

        TextView fibres = (TextView) findViewById(R.id.fibres);
        fibres.setText(Integer.toString(unProduit.getFibresAlimentaires()));

        TextView proteines = (TextView) findViewById(R.id.proteines);
        proteines.setText(Integer.toString(unProduit.getProteine()));

        TextView sodium = (TextView) findViewById(R.id.sodium);
        sodium.setText(Integer.toString(unProduit.getSodium()));
        
    }

    public void RetourLister(View view) {
        Intent intent = new Intent(this, ListerProduit.class);
        startActivity(intent);
    }
}
