/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hsstudies.apps;

/**
 *
 * @author Amine
 */
public class Facture {
    private int id;
    private double totalTTC;
    private Client client;

    public Facture() {
    }

    public Facture(double totalTTC, Client client) {
        this.totalTTC = totalTTC;
        this.client = client;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalTTC() {
        return totalTTC;
    }

    public void setTotalTTC(double totalTTC) {
        this.totalTTC = totalTTC;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    @Override
    public String toString(){
        return "Facture N°: "+id+" Montant: "+totalTTC+" Pour: "+((client!=null)?client.getNom():"___");
    }
}
