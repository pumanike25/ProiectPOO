/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliareproiect;

/**
 *
 * @author User
 */
public class Imobiliare {
    private long pretVanzare;
    private int suprafata;
    private String locatie;
    
    //constructor implicit
    public Imobiliare(){
    this.pretVanzare=pretVanzare;
    this.suprafata=suprafata;
    this.locatie=locatie;
}
    //constructor explicit
    public Imobiliare(long pretVanzare, int suprafata, String locatie)
    {
        this.pretVanzare=pretVanzare;
        this.suprafata=suprafata;
        this.locatie=locatie;
    }
    //constructor copiere
    Imobiliare(Imobiliare f)
    {
        this.pretVanzare=f.pretVanzare;
        this.suprafata=f.suprafata;
        this.locatie=f.locatie;
    }
    
    //FUNCTIILE GETTER SI SETTER
     public long getPretVanzare() {
        return pretVanzare;
    }
    public void setPretVanzare(long pretVanzare) {
        this.pretVanzare = pretVanzare;
    }

    public int getSuprafata() {
        return suprafata;
    }
    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public String getLocatie() {
        return locatie;
    }
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
    
    public String toString(){
        return "Imobilul cu pretul: "+pretVanzare+" cu "+suprafata+" metrii patrati aflat in locatia: "+locatie+".\n";
    }
}
