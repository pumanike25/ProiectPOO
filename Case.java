/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliareproiect;

/**
 *
 * @author tudor
 */
public class Case extends Imobiliare{
    private int suprafataUtila;
    private int suprafataTeren;
    private int nrCamere;
    private int nrBai;
    private int etaj;
    private boolean mobilare;
    private int anConstructie;
    /*Constructor implicit
    Case(){
        this.suprafataUtila= 0;
        this.suprafataTeren= 0;
        this.nrCamere=0;
        this.nrBai=0;
        this.etaj=0;
        this.anConstructie=1500;
        this.mobilare=false;
        
}*/
    //Constructor explicit
    public Case(long pretVanzare, int suprafata, String localitate, String judet, String adresa, int suprafataUtila, int suprafataTeren, int nrCamere, int nrBai, int etaj, int anConstructie, boolean mobilare)
    {
        super(pretVanzare,suprafata,localitate,judet,adresa);
        this.suprafataUtila= suprafataUtila;
        this.suprafataTeren=suprafataTeren;
        this.nrCamere=nrCamere;
        this.nrBai=nrBai;
        this.etaj=etaj;
        this.anConstructie=anConstructie;
        this.mobilare=mobilare;
        //this.mobiliare=mobiliare;
        
    }
    //constructor copiere
    Case(Case f)
    {
        super(f.getPretVanzare(), f.getSuprafata(), f.getLocalitate(), f.getJudet(), f.getAdresa());
        
        this.suprafataTeren=f.suprafataTeren;
        this.suprafataUtila= f.suprafataUtila;
        this.nrCamere=f.nrCamere;
        this.nrBai=f.nrBai;
        this.etaj=f.etaj;
        this.anConstructie=f.anConstructie;
        this.mobilare=f.mobilare;
        
    }
    
    //public String toString(){
       // return super.toString()+"Casa are suprafata terenenului de "+suprafataTeren+" metri patrati utili ai casei "+suprafataUtila+" numarul de camere este de "+nrCamere+", cu  "+nrBai+" bai, "+"cu "+etaj+" etaje "+ "iar anul constructiei este "+anConstructie;
   // }

//Fuctii de getter si setter
    public int getSuprafataUtila() {
        return suprafataUtila;
    }
    public void setSuprafataUtila(int suprafataUtila) {
        this.suprafataUtila = suprafataUtila;
    }
    public int getSuprafataTeren(){
        return suprafataTeren;
    }
    public void setSuprafataTeren(int suprafataTeren){
        this.suprafataTeren = suprafataTeren;
    }
    public int getNrCamere() {
        return nrCamere;
    }
    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }
    public int getNrBai() {
        return nrBai;
    }
    public void setNrBai(int nrBai) {
        this.nrBai = nrBai;
    }
    public int getEtaj() {
        return etaj;
    }
    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }
    public int getAnConstructie() {
        return anConstructie;
    }
    public void setAnConstructie(int anConstructie) {
        this.anConstructie = anConstructie;
    }
    public boolean getMobilare() {
        return mobilare;
    }
    public void setMobilare(boolean mobilare) {
        this.mobilare = mobilare;
    }

public String toString() {
    String etajDescription = (getEtaj() == 0) ? "fara etaj" : ((etaj == 1) ? "cu un etaj" : "cu " + etaj + " etaje");
    String camereDescription = (getNrCamere() == 1) ? "cu o singura camera" : "cu " + nrCamere + " camere";
    String baiDescription = (getNrBai() == 1) ? "are o singura baie" : "are " + nrBai + " bai";
    String mobilareDescription = (getMobilare() == true) ? "Casa este mobilata" : "Casa nu este mobilata";

    return "Casa are suprafata utila " + suprafataUtila + " metri patrati, cu un teren de " +
            suprafataTeren + " metri patrati, construita in anul " + anConstructie + " " +
            camereDescription + ", " + baiDescription + " " + etajDescription + ". " +
            mobilareDescription + ".";
}


        public static void main(String[] args) {
        Case case1 = new Case(100000, 100, "Bucuresti","Bucuresti","Regiment 26",100 ,80, 3, 1, 5, 2005,true);
        Case case2 = new Case(900000,200, "Galati","Galati","B-dul  Braila 20",180 ,120, 8, 4, 5, 2020,false);
        Case case3 = new Case(69000,193,"Danes","Mures","Dn 14 ",161,4000,5,4,1,2023,false);
        Case case4 = new Case(case1); // copiere
        
        System.out.println("Detaliile casei 1:");
        System.out.println(case1.toString());
        System.out.println("\nDetaliile casei 2:");
        System.out.println(case2.toString());
        System.out.println("\nDetaliile casei 3:");
        System.out.println(case3.toString());
        System.out.println("\nDetaliile casei 4 (copie a casei 1):");
        System.out.println(case4.toString());
    }
}
