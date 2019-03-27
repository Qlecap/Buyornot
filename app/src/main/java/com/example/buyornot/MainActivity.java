package com.example.buyornot;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Produit unProduit = new Produit(1, "Huile",
                3336590083787L, 100, "olive", 10, 10,
                10, 10, 10, 10, 10, 10, 11);
        //Produit unProduit = new Produit(1,"huile");
        //unProduit.setId(1);
        //unProduit.setLibelle("coucou");

        ProduitManager produitManager = new ProduitManager(this);
        produitManager.open();
        produitManager.addProduit(unProduit);

        Produit test =  produitManager.getProduit(1);

        Toast.makeText(getApplicationContext(), test.getLibelle(), Toast.LENGTH_LONG).show();

        /*Cursor c = produitManager.getLesProduits();
        if (c.moveToFirst())
        {
            do {
                Log.d("test",
                       c.getString(c.getColumnIndex(produitManager.KEY_LIBELLE_PRODUIT))
                );
                Toast.makeText(this,  c.getString(c.getColumnIndex(produitManager.KEY_LIBELLE_PRODUIT)), Toast.LENGTH_LONG).show();

            }
            while (c.moveToNext());
        }*/
/*

        if (test != null) {
            TextView textView = (TextView) findViewById(R.id.test);
            //SET
            textView.setText(test.getLibelle());
            //Toast.makeText(this, test.getLibelle(), Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "Au revoir", Toast.LENGTH_LONG).show();
        }*/
        produitManager.close();
    }
}