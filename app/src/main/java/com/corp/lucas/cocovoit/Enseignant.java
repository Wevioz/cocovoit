package com.corp.lucas.cocovoit;

import java.io.Serializable;

/**
 * Created by etudiant on 08/10/2019.
 */

public class Enseignant implements Serializable {
    String nom;
    String prenom;
    String ville;

    public Enseignant(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    public String getNom() {
        return this.nom;
    }
}
