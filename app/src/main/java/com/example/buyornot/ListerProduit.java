package com.example.buyornot;

import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class ListerProduit extends AppCompatActivity {

    private ArrayList<Integer> idProduits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_liste_produit);

        String[] columns = new String[] { "_id", "col1", "col2" };
        MatrixCursor matrixCursor= new MatrixCursor(columns);

        startManagingCursor(matrixCursor);
        ProduitManager produitManager = new ProduitManager(this);
        produitManager.open();

        idProduits = new ArrayList<>();
        Cursor c = produitManager.getLesProduits();
        if (c.moveToFirst())
        {
            do {
                matrixCursor.addRow(new Object[] { 1, c.getString(1),  /*a changer */ c.getInt(2)});
                idProduits.add(c.getInt(0));
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
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChangeActivity(idProduits.get(position));
            }
        });
    }

    public void ChangeActivity(int idProduit){
        Intent intent = new Intent(this, ConsultationProduit.class);
        //Bundle bundle = new Bundle(idProduit);
        intent.putExtra("id",idProduit);
        startActivity(intent);
    }

}
