/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliareproiect;

/**
 *
 * @author User
 */
public class Apartament extends Imobiliare {
    private int suprafataU;
    private int nrCamere;
    private int nrBai;
    private int etaj;
    private int anConstructie;
    private boolean mobilare;
    private String tip;//semidecomandat
    
    //constructor implicit
    Apartament()
    {
        this.suprafataU= 0;
        this.nrCamere=0;
        this.nrBai=0;
        this.etaj=0;
        this.anConstructie=1500;
        this.mobilare=false;
        this.tip=null;
    }
    
    //constructor explicit
    public Apartament(long pretVanzare, int suprafata, String locatie, int suprafataU, int nrCamere, int nrBai, int etaj, int anConstructie, boolean mobilare, String tip)
    {
        super(pretVanzare,suprafata,locatie);
        this.suprafataU= suprafataU;
        this.nrCamere=nrCamere;
        this.nrBai=nrBai;
        this.etaj=etaj;
        this.anConstructie=anConstructie;
        this.mobilare=mobilare;
        this.tip=tip;
    }
    //constructor copiere
    public Apartament(Apartament f)
    {
        /*this.pretVanzare=f.pretVanzare;
        this.suprafata=f.suprafata;
        this.locatie=f.locatie;*/
        super(f.getPretVanzare(), f.getSuprafata(), f.getLocatie());
        
        this.suprafataU= f.suprafataU;
        this.nrCamere=f.nrCamere;
        this.nrBai=f.nrBai;
        this.etaj=f.etaj;
        this.anConstructie=f.anConstructie;
        this.mobilare=f.mobilare;
        this.tip=f.tip;
    }

    //FUNCTIILE GETTER SI SETTER
    public int getSuprafataU() {
        return suprafataU;
    }
    public void setSuprafataU(int suprafataU) {
        this.suprafataU = suprafataU;
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
    
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String toString()
    {
        if(getMobilare()==true)
        {if(getNrCamere()>=2)
            if(getNrBai()>=2)  
                return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, "+nrCamere+" camere, are "+nrBai+" bai, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+", este mobilat si este "+tip+".\n";
            else
                return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, "+nrCamere+" camere, are o "+nrBai+" baie, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+", este mobilat si este "+tip+".\n";
        if(getNrCamere()<2 && getNrBai()>=2)
            return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, o "+nrCamere+" camera, are "+nrBai+" bai, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+", este mobilat si este "+tip+".\n";
        else
            return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, (o) "+nrCamere+" camera, are o "+nrBai+" baie, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+", este mobilat si este "+tip+".\n";
        }
        else
            {if(getNrCamere()>=2)
            if(getNrBai()>=2)  
                return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, "+nrCamere+" camere, are "+nrBai+" bai, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
            else
                return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, "+nrCamere+" camere, are o "+nrBai+" baie, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
        if(getNrCamere()<2 && getNrBai()>=2)
            return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, o "+nrCamere+" camera, are "+nrBai+" bai, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
        else
            return super.toString()+"Apartamentul are "+suprafataU+" metrii patrati, (o) "+nrCamere+" camera, are o "+nrBai+" baie, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
        }
    }
    
    public static void main(String[] args) {
        Apartament apartament1 = new Apartament(150000, 100, "Bucuresti", 80, 3, 1, 5, 2005,true, "semidecomandat");
        Apartament apartament2 = new Apartament(200000, 120, "Cluj-Napoca", 90, 4, 3, 3, 2010,false, "decomandat");
        Apartament apartament3 = new Apartament(apartament1); // copiere

        System.out.println("Detalii apartament 1:");
        System.out.println(apartament1.toString());
        System.out.println("\nDetalii apartament 2:");
        System.out.println(apartament2.toString());
        System.out.println("\nDetalii apartament 3:");
        System.out.println(apartament3.toString());
    }
}
