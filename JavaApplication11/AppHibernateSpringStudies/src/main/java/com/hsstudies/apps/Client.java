/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hsstudies.apps;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Amine
 */
public class Client {
    private int id;
    private String nom;
    private Adresse adresse;
    
    private Set<Facture> factures = new HashSet<>();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Set<Facture> getFactures() {
        return factures;
    }

    public void setFactures(Set<Facture> facture) {
        this.factures = facture;
    }

    public void addFacture(Facture facture){
        factures.add(facture);
        facture.setClient(this);
    }
}
