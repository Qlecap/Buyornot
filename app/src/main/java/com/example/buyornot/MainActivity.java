package com.example.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Produit unProduit = new Produit("Fromage", 3336590083787L, 100, "lait", 10, 10, 10, 10, 10, 10, 10, 10, 11,10, 10);

        //Produit unProduit2 = new Produit("Riz", 3336592223787L, 100, "Riz", 10, 10, 10, 10, 10, 10, 10, 10, 11,10, 10);

        ProduitManager produitmanager = new ProduitManager(this);
        produitmanager.open();

        //produitmanager.addProduit(unProduit);
        //produitmanager.addProduit(unProduit2);

        //Produit test = produitmanager.getProduit(1);

        //Toast.makeText(getApplicationContext(), test.getLibelle(), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getCodeBarre()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), Integer.toString(test.getQuantite()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), test.getIngredients(), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getEnergie()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getMatiereGrasse()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getAcidesGras()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getGlucides()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getSucres()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getProteine()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getSel()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getSodium()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getNutriscore()), Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), String.valueOf(test.getFruitsLegumes()), Toast.LENGTH_LONG).show();

        produitmanager.close();

    }

    public void ChangeActivity(View view){
        Intent intent = new Intent(this, ListerProduit.class);
        startActivity(intent);
    }

}