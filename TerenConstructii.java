package com.mycompany.imobiliarepro;

import java.io.FileWriter;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliareproiect;

/**
 *
 * @author User
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class TerenConstructii extends Imobiliare {
    private String scop; // Exemplu: rezidențial, comercial, industrial
    private int frontStradal ;
    private boolean areApa; // Indică dacă terenul are acces la rețeaua de apă
    private boolean areCurent; // Indică dacă terenul are acces la rețeaua de curent electric
    private String clasificare; //intravilan/extravilan
    private long taxa;
    
    
    // Constructor principal
    public TerenConstructii(long pretVanzare, int suprafata, String localitate,String judet, String adresa, String destinatie, int frontStradal, boolean areApa, boolean areCurent, String clasificare) {
        super(pretVanzare,suprafata,localitate,judet,adresa);
        this.scop = destinatie;
        this.frontStradal = frontStradal;
        this.areApa = areApa;
        this.areCurent = areCurent;
        this.clasificare=clasificare;
    }

    // Constructor fără argumente
    public TerenConstructii() {
        this.scop = null;
        this.frontStradal = 0;
        this.areApa = false;
        this.areCurent = false;
        this.clasificare=null;
    }

    //constructor de copiere
    public TerenConstructii(TerenConstructii a)
    {
        super(a.getPretVanzare(), a.getSuprafata(), a.getLocalitate(),a.getJudet(), a.getAdresa());
        this.areApa=a.areApa;
        this.areCurent=a.areCurent;
        this.scop=a.scop;
        this.frontStradal=a.frontStradal;
        this.clasificare=a.clasificare;
    }
    
    
    
    public String toString() {
        return "Teren de constructii cu suprafata de: " + this.getSuprafata() + " metri patrati" +
               ", cu pretul de " + this.getPretVanzare() + " RON" + ", In locatia: " + this.getLocalitate() +
               "\n" + "Scop: " + this.scop +
               ", front stradal: " + this.frontStradal + " metri "+
               ", racordat la reteaua de apa: " + (this.areApa ? "Da" : "Nu") +
               ", racordat la curent electric: " + (this.areCurent ? "Da" : "Nu")+
               ", clasificare: " + this.clasificare+"\n";
    }

    public void CalcTaxa()
    {
    System.out.print("Pentru suprafata de : " + this.getSuprafata()+" metri patrati "); 

    if(this.getSuprafata() < 1000)
        this.taxa = 100;
    else if(this.getSuprafata() >= 1000 && this.getSuprafata() < 5000)
        this.taxa = 1000;
    else if (this.getSuprafata() >= 5000)
        this.taxa = 3000;
    
    
    if (this.clasificare =="intravilan")
        this.taxa=this.taxa+1500;
    else if(this.clasificare=="extravilan")
        this.taxa=this.taxa+500;

    System.out.println("se plateste taxa de : " + this.taxa + " RON"); 
    }
    
    public void CalcPretM2()
    {
        System.out.println("Pretul per metru patrat este: "+(this.getPretVanzare()/this.getSuprafata())+" RON");
    }
    
    
    
    //FUNCTIILE GETTER SI SETTER
    
    public String getScop() {
        return scop;
    }

    public void setScop(String scop) {
        this.scop = scop;
    }

    
    public int getFrontStradal() {
        return frontStradal;
    }

    public void setFrontStradal(int frontStradal) {
        this.frontStradal = frontStradal;
    }

    
    public boolean isAreApa() {
        return areApa;
    }

    public void setAreApa(boolean areApa) {
        this.areApa = areApa;
    }

    
    public boolean isAreCurent() {
        return areCurent;
    }

    public void setAreCurent(boolean areCurent) {
        this.areCurent = areCurent;
    }

    
    public String getClasificare() {
        return clasificare;
    }

    public void setClasificare(String clasificare) {
        this.clasificare = clasificare;
    }

   
    public long getTaxa() {
        return taxa;
    }

    public void setTaxa(long taxa) {
        this.taxa = taxa;
    }
    
    
    
    
   
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class TerenConstructii extends Imobiliare {
    private String scop; // Exemplu: rezidențial, comercial, industrial
    private int frontStradal ;
    private boolean areApa; // Indică dacă terenul are acces la rețeaua de apă
    private boolean areCurent; // Indică dacă terenul are acces la rețeaua de curent electric
    private String clasificare; //intravilan/extravilan
    private long taxa;
    
    
    // Constructor principal
    public TerenConstructii(long pretVanzare, int suprafata, String localitate,String judet, String adresa, String destinatie, int frontStradal, boolean areApa, boolean areCurent, String clasificare) {
        super(pretVanzare,suprafata,localitate,judet,adresa);
        this.scop = destinatie;
        this.frontStradal = frontStradal;
        this.areApa = areApa;
        this.areCurent = areCurent;
        this.clasificare=clasificare;
    }

    // Constructor fără argumente
    public TerenConstructii() {
        this.scop = null;
        this.frontStradal = 0;
        this.areApa = false;
        this.areCurent = false;
        this.clasificare=null;
    }

    //constructor de copiere
    public TerenConstructii(TerenConstructii a)
    {
        super(a.getPretVanzare(), a.getSuprafata(), a.getLocalitate(),a.getJudet(), a.getAdresa());
        this.areApa=a.areApa;
        this.areCurent=a.areCurent;
        this.scop=a.scop;
        this.frontStradal=a.frontStradal;
        this.clasificare=a.clasificare;
    }
    
    
    
    public String toString() {
        return "Teren de constructii cu suprafata de: " + this.getSuprafata() + " metri patrati" +
               ", cu pretul de " + this.getPretVanzare() + " RON" + ", In locatia: " + this.getLocalitate() +
               "\n" + "Scop: " + this.scop +
               ", front stradal: " + this.frontStradal + " metri "+
               ", racordat la reteaua de apa: " + (this.areApa ? "Da" : "Nu") +
               ", racordat la curent electric: " + (this.areCurent ? "Da" : "Nu")+
               ", clasificare: " + this.clasificare;
    }

    public void CalcTaxa()
    {
    System.out.print("Pentru suprafata de : " + this.getSuprafata()+" metri patrati "); 

    if(this.getSuprafata() < 1000)
        this.taxa = 100;
    else if(this.getSuprafata() >= 1000 && this.getSuprafata() < 5000)
        this.taxa = 1000;
    else if (this.getSuprafata() >= 5000)
        this.taxa = 3000;
    
    
    if (this.clasificare =="intravilan")
        this.taxa=this.taxa+1500;
    else if(this.clasificare=="extravilan")
        this.taxa=this.taxa+500;

    System.out.println("se plateste taxa de : " + this.taxa + " RON"); 
    }
    
    public void CalcPretM2()
    {
        System.out.println("Pretul per metru patrat este: "+(this.getPretVanzare()/this.getSuprafata())+" RON");
    }
    
    
    
    //FUNCTIILE GETTER SI SETTER
    
    public String getScop() {
        return scop;
    }

    public void setScop(String scop) {
        this.scop = scop;
    }

    
    public int getFrontStradal() {
        return frontStradal;
    }

    public void setFrontStradal(int frontStradal) {
        this.frontStradal = frontStradal;
    }

    
    public boolean isAreApa() {
        return areApa;
    }

    public void setAreApa(boolean areApa) {
        this.areApa = areApa;
    }

    
    public boolean isAreCurent() {
        return areCurent;
    }

    public void setAreCurent(boolean areCurent) {
        this.areCurent = areCurent;
    }

    
    public String getClasificare() {
        return clasificare;
    }

    public void setClasificare(String clasificare) {
        this.clasificare = clasificare;
    }

   
    public long getTaxa() {
        return taxa;
    }

    public void setTaxa(long taxa) {
        this.taxa = taxa;
    }
    
    
    
    
    public static void main(String[] args) {
        //String numeFisier = "test_teren_agricol.txt";
        
        TerenConstructii[] vtc = new TerenConstructii[10];

        
        // Inițializarea 3 obiecte TerenConstructii distincte
        TerenConstructii tc1,tc2,tc3;
        tc1=new TerenConstructii(213000, 1000, "Galati","Galati","Str Trandafirilor", "rezidential", 16, true, true, "intravilan");
        tc2=new TerenConstructii(142313, 3000,"Braila","Braila", "Str Teilor", "comercial", 32, true, true, "intravilan");
        tc3=new TerenConstructii(100000, 5000, "Galati","Tecuci","Str Veche", "industrial", 44, true, true, "intravilan");
        
        
        // Inițializarea vectorului cu obiecte Apartament distincte
        vtc[0] = new TerenConstructii(213000, 1000,"Galati", "Galati", "Micro 19", "rezidential", 16, true, true, "intravilan");
        vtc[1] = new TerenConstructii(180000, 800,"Beresti" ,"Galati", "Str Principala", "comercial", 12, false, true, "extravilan");
        vtc[2] = new TerenConstructii(250000, 1200, "Tecuci","Galati", "Str Barladului","industrial", 18, true, false, "intravilan");
        vtc[3] = new TerenConstructii(150000, 700, "Cavadinesti","Galati","Str Principala", "rezidential", 14, true, true, "extravilan");
        vtc[4] = new TerenConstructii(300000, 1500, "Galati","Galati","Str Zidarilor", "industrial", 20, true, true, "intravilan");
        vtc[5] = new TerenConstructii(220000, 1100, "Targu Mures", "Mures", "Str Livada", "rezidential", 15, true, false, "intravilan");
        vtc[6] = new TerenConstructii(190000, 900, "Iasi", "Iasi", "Str Unirii", "comercial", 10, false, true, "extravilan");
        vtc[7] = new TerenConstructii(280000, 1300, "Timisoara", "Timis", "Str Victoriei", "industrial", 25, true, true, "intravilan");
        vtc[8] = new TerenConstructii(165000, 750, "Oradea", "Bihor", "Str Avram Iancu", "rezidential", 13, true, false, "extravilan");
        vtc[9] = new TerenConstructii(320000, 1600, "Cluj-Napoca", "Cluj", "Str Memorandumului", "comercial", 22, true, true, "intravilan");
        // Afișarea detaliilor pentru fiecare apartament din vector
        for (int i = 0; i < vtc.length; i++) {
            System.out.println("Detalii Teren Constructii " + (i + 1) + ":");
            System.out.println(vtc[i].toString());
            System.out.println();
            
        }
        
        
       
        
    }
}
