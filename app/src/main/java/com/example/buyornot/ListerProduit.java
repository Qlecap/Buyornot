package com.example.buyornot;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class ListerProduit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_liste_produit);

        String[] columns = new String[] { "_id", "col1", "col2" };
        MatrixCursor matrixCursor= new MatrixCursor(columns);

        startManagingCursor(matrixCursor);
        ProduitManager produitManager = new ProduitManager(this);
        produitManager.open();

        Cursor c = produitManager.getLesProduits();
        if (c.moveToFirst())
        {
            do {
                matrixCursor.addRow(new Object[] { 1, c.getString(1),  /*a changer */ c.getInt(2)});

            }
            while (c.moveToNext());
        }
        c.close();


        String[] from = new String[] {"col1", "col2"};

        int[] to = new int[] { R.id.proNom, R.id.codNova};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                R.layout.row_produit_lister, matrixCursor, from, to, 0);

        ListView lv = (ListView) findViewById(R.id.proListe);
        lv.setAdapter(adapter);
    }



}
