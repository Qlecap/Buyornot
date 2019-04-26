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


        Produit unProduit = new Produit(1, "Huile", 3336590083787L, 100, "olive", 10, 10, 10, 10, 10, 10, 10, 10, 11,10);


        Produit unProduit2 = new Produit(2, "Pâte", 3336592223787L, 100, "blé", 10, 10, 10, 10, 10, 10, 10, 10, 11,10);


        ProduitManager produitmanager = new ProduitManager(this);
        produitmanager.open();
        produitmanager.addProduit(unProduit);
        produitmanager.addProduit(unProduit2);

        //Produit test =  produitManager.getProduit(1);

        //Toast.makeText(getApplicationContext(), test.getLibelle(), Toast.LENGTH_LONG).show();

        produitmanager.close();
    }

    public void ChangeActivity(View view){
        Intent intent = new Intent(this, ListerProduit.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

}