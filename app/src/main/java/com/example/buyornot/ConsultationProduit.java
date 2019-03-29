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
        int id = 1;
        Produit unProduit = getProduit(id);
        TextView libelleProduit = (TextView) findViewById(R.id.libelleProduit);
        libelleProduit.setText(unProduit.getLibelle());

        TextView codeBarreProduit = (TextView) findViewById(R.id.codeBarreProduit);
        long codeB = unProduit.getCodeBarre();
        codeBarreProduit.setText(Long.toString(codeB));

        TextView marque = (TextView) findViewById(R.id.marque);
        marque.setText(unProduit.getMarque().getProduit());

        TextView quantite = (TextView) findViewById(R.id.quantite);
        quantite.setText(unProduit.getQuantite());

        TextView conditionnement = (TextView) findViewById(R.id.conditionnement);
        conditionnement.setText(unProduit.getConditionnement().getLibelle());

        TextView categories = (TextView) findViewById(R.id.categories);
        Categorie lesCategories = unProduit.getCategories();
        String libCategories = "";
        //
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
        //
        //boucle pour concatener les libelles des pays d'origine en une variable
        paysDeVente.setText(libPaysVente);

        TextView nova = (TextView) findViewById(R.id.nova);
        nova.setText(unProduit.getNova().getLibelle);

        TextView nutriscore = (TextView) findViewById(R.id.nutriscore);
        nutriscore.setText(unProduit.getNutriscore());

        TextView ingredients = (TextView) findViewById(R.id.ingredients);
        ingredients.setText(unProduit.getIngredients());

        TextView allergenes = (TextView) findViewById(R.id.allergenes);
        ArrayList<Allegene> lesAllergenes = unProduit.getAllergenes();
        String libAllergenes = "";
        //
        //boucle pour concatener les libelles des pays d'origine en une variable
        allergenes.setText(libAllergenes);

        TextView additifs = (TextView) findViewById(R.id.additifs);
        ArrayList<Additif> lesAdditifs = unProduit.getAdditifs();
        String libAdditifs = "";
        //
        //boucle pour concatener les libelles des pays d'origine en une variable
        additifs.setText(libAdditifs);

        TextView tauxFruitsLegum = (TextView) findViewById(R.id.tauxFruitsLegum);
        tauxFruitsLegum.setText(unProduit.getFruitsLegumes());


    }

    //j'ai mis en commentaire pour eviter des problemes de compilation le temps que l'on fasse un merge
    public void ChangeActivity(View view) {
        //Intent intent = new Intent(this, ListeProduit.class);
        //startActivity(intent);
    }
}
