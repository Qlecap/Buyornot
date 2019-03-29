package com.example.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Produit unProduit = new Produit(1, "Huile",
                3336590083787L, 100, "olive", 10, 10,
                10, 10, 10, 10, 10, 10, 11);

        Produit unProduit2 = new Produit(1, "Pate",
                3336590113787L, 100, "blé", 10, 10,
                10, 10, 10, 10, 10, 10, 11);

        ProduitManager produitManager = new ProduitManager(this);
        produitManager.open();
        produitManager.addProduit(unProduit);
        produitManager.addProduit(unProduit2);

        Produit test =  produitManager.getProduit(1);

        //Toast.makeText(getApplicationContext(), test.getLibelle(), Toast.LENGTH_LONG).show();

        produitManager.close();
    }

    public void ChangeActivity(View view){
        Intent intent = new Intent(this, ListerProduit.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

}