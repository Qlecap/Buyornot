package com.example.buyornot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConsultationProduitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interface_consultation_produit);
    }

    //j'ai mis en commentaire pour eviter des problemes de compilation le temps que l'on fasse un merge
    public void ChangeActivity(View view) {
        //Intent intent = new Intent(this, ListeProduit.class);
        //startActivity(intent);
    }
}
