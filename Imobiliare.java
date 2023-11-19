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
    private String localitate;
    private String judet;
    private String adresa;
    
    //constructor implicit
    public Imobiliare(){
    this.pretVanzare=0;
    this.suprafata=0;
    this.localitate=null;
    this.judet=null;
    this.adresa=null;
}
    //constructor explicit
    public Imobiliare(long pretVanzare, int suprafata, String localitate, String judet, String adresa)
    {
        this.pretVanzare=pretVanzare;
        this.suprafata=suprafata;
        this.localitate=localitate;
        this.judet=judet;
        this.adresa=adresa;
    }
    //constructor copiere
    Imobiliare(Imobiliare f)
    {
        this.pretVanzare=f.pretVanzare;
        this.suprafata=f.suprafata;
        this.localitate=f.localitate;
        this.judet=f.judet;
        this.adresa=f.adresa;
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

    public String getLocalitate() {
        return localitate;
    }
    public void setLocalitate(String locatie) {
        this.localitate = localitate;
    }
    
    public String getJudet() {
        return judet;
    }
    public void setJudet(String judet) {
        this.judet = judet;
    }
    
    public String getAdresa() {
        return adresa;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    public String toString(){
        return "Imobilul cu pretul: "+pretVanzare+" cu "+suprafata+" metrii patrati aflat in localitatea "+localitate+", judetul: "+judet+", la adresa: "+adresa+".\n";
    }
}
