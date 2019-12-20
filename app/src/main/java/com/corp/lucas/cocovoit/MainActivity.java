package com.corp.lucas.cocovoit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {
    EditText villePersonne ;
    EditText nomPersonne ;
    EditText prenomPersonne ;
    Button envoyer;

    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        villePersonne = (EditText) findViewById(R.id.VillePersonne);
        nomPersonne = (EditText) findViewById(R.id.NomPersonne);
        prenomPersonne = (EditText) findViewById(R.id.PrenomPersonne);
        envoyer = (Button) findViewById(R.id.envoyer);
    }

    public void inscription(View vue) {

        Toast toast = Toast.makeText(this, "Inscription", Toast.LENGTH_LONG);
        toast.show();
    }

    public void connexion(View vue) {

        Toast toast = Toast.makeText(this, "Connexion", Toast.LENGTH_LONG);
        toast.show();
    }

    public void apropos(View vue) {

        Toast toast = Toast.makeText(this, "A propos", Toast.LENGTH_LONG);
        toast.show();
    }

    public void envoyer(View vue) {
        String villePersonneSaisie = villePersonne.getText().toString();
        String nomPersonneSaisie = nomPersonne.getText().toString();
        String prenomPersonneSaisie = prenomPersonne.getText().toString();

        Enseignant enseignant1 = new Enseignant(nomPersonneSaisie, prenomPersonneSaisie, villePersonneSaisie);

        Gson gson = new GsonBuilder().create();
        String jsonCommande = gson.toJson(enseignant1);


        Bundle paquet = new Bundle();
        paquet.putString("enseignant", jsonCommande);
        Intent intentEnvoyer = new Intent(this, InscriptionActivity.class);
        intentEnvoyer.putExtras(paquet);
        startActivity(intentEnvoyer);
    }

}
