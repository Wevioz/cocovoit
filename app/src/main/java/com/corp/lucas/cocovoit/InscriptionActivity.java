package com.corp.lucas.cocovoit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class InscriptionActivity extends AppCompatActivity {
    TextView tvnbrPersonnes;
    Button btnRetourner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        tvnbrPersonnes = (TextView) findViewById(R.id.tvnbrPersonnes);


        Bundle paquet = this.getIntent().getExtras();
        String getenseignant = paquet.getString("enseignant");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Enseignant enseignant = gson.fromJson(getenseignant, Enseignant.class);


        tvnbrPersonnes.setText("nom : "+ enseignant.getNom());

    }

    public void retourner(View vue) {
        Intent intentRetourner = new Intent(this,MainActivity.class);
        startActivity(intentRetourner);
    }



}
