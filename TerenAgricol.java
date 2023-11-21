package com.mycompany.imobiliarepro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class TerenAgricol extends Imobiliare{
    private String tipCultura; //tipul culturii, de ex:pasune, arabil, livada, pasune, faneata, helesteu
    private String tipSolicitant;//de ex:
    private String tipSol;//de ex:
    private boolean irigatii;
    private String clasificare; //intravilan/extravilan
    private long taxa;
    
    
    public TerenAgricol(long pretVanzare, int suprafata, String localitate, String judet, String adresa, String tipSolicitant, String tipCultura, String tipSol, boolean irigatii, String clasificare) 
    {
    super(pretVanzare,suprafata,localitate,judet,adresa);
    this.tipSolicitant = tipSolicitant;
    this.tipCultura = tipCultura;
    this.tipSol=tipSol;
    this.irigatii=irigatii;
    this.clasificare=clasificare;
    }
    
    public TerenAgricol()
    {
    this.tipSolicitant=null;
    this.tipCultura=null;
    this.tipSol=null;
    this.irigatii=false;
    this.clasificare=null;
    }

    public TerenAgricol(TerenAgricol a)
    {
        super(a.getPretVanzare(), a.getSuprafata(),a.getLocalitate() ,a.getJudet(), a.getAdresa());
        this.tipCultura=a.tipCultura;
        this.tipSol=a.tipSol;
        this.tipSolicitant=a.tipSolicitant;
        this.irigatii=a.irigatii;
        this.clasificare=a.clasificare;
    }
    
    public float m2ha() 
    {
        float x;
        x=(float)this.getSuprafata() / 10000;
    return  x;
    }
    
    public void CalcPretHa()
    {
        System.out.println("Pretul per hectar este: "+(this.getPretVanzare()/this.m2ha())+" RON");
    }
    
    
    
    public String toString() {
        return "Terenul agricol cu suprafata de: " + this.getSuprafata() +" metri patrati" +"("+this.m2ha()+" ha"+")"+", cu pretul de: "+this.getPretVanzare() 
                +" RON" + "; In judetul: " + this.getJudet()+" ,localitatea: "+this.getLocalitate()+" ,adresa: "+this.getAdresa()+"\n"+"Cu tipul de cultura: "+this.tipCultura
                +",  tipul solicitantului: "+this.tipSolicitant+", tipul solului: "+this.tipSol+", are irigatii: " + (this.irigatii ? "Da" : "Nu")+"\n"+"Clasificare: "+this.clasificare;
    }
    
    
    
    public void CalcTaxa()
    {
    System.out.print("Pentru suprafata de : " + this.getSuprafata()+"("+this.m2ha()+" ha"+")"+" metri patrati "); 

    if(this.getSuprafata() < 10000)
        this.taxa = 100;
    else if(this.getSuprafata() >= 10000 && this.getSuprafata() < 100000)
        this.taxa = 1000;
    else if (this.getSuprafata() >= 100000)
        this.taxa = 3000;

    if (this.clasificare == "intravilan")
        this.taxa=this.taxa + 1000;
    else if(this.clasificare=="extravilan")
        this.taxa=this.taxa + 500;
    
    System.out.println("se plateste taxa de : " + this.taxa + " RON"); 
    }
    
   
    //FUNCTIILE GETTER SI SETTER
    
    public String getTipCultura() {
        return tipCultura;
    }

    public void setTipCultura(String tipCultura) {
        this.tipCultura = tipCultura;
    }

   
    public String getTipSolicitant() {
        return tipSolicitant;
    }

    public void setTipSolicitant(String tipSolicitant) {
        this.tipSolicitant = tipSolicitant;
    }

   
    public String getTipSol() {
        return tipSol;
    }

    public void setTipSol(String tipSol) {
        this.tipSol = tipSol;
    }

    
    public boolean isIrigatii() {
        return irigatii;
    }

    public void setIrigatii(boolean irigatii) {
        this.irigatii = irigatii;
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
        //String numeFisier = "test_teren_constructii.txt";
        
        
        
        // Inițializarea 3 obiecte TerenAgricol distincte
        TerenAgricol tr1,tr2,tr3;
        tr1=new TerenAgricol(50000,57500,"Cavadinesti","Galati","Drum Agricol 1","fermier", "teren arabil","cernoziom",true,"extravilan");
        tr2=new TerenAgricol(50000,57500,"Onesti","Galati","Drum Forestier 5","investitor", "pasune","cernoziom",true,"extravilan");
        tr3=new TerenAgricol(50000,57500,"Cavadinesti","Galati","Drum Agricol 7","cooperativa agricola", "helesteu","luciu de apa",true,"extravilan");
        
        
         // Scriere în fișier
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("teren_agricol.txt"))) 
        {
            writer.write("Informații despre terenul 1:\n");
            writer.write(tr1.toString());
            writer.write("\n\nInformații despre terenul 2:\n");
            writer.write(tr2.toString());
            writer.write("\n\nInformații despre terenul 3:\n");
            writer.write(tr3.toString());
            System.out.println("Informațiile despre terenurile agricole au fost scrise în fișierul terenuri_agricole.txt.");
        } 
        catch (IOException e) 
        {
            System.out.println("Eroare la scrierea în fișier: " + e.getMessage());
        }
        
        
        
        TerenAgricol[] vta = new TerenAgricol[10];

        // Inițializarea vectorului cu obiecte TerenAgricol distincte
        vta[0]= new TerenAgricol(50000,57500,"Cavadinesti","Galati","Drum Agricol 1","fermier", "teren arabil","cernoziom",true,"extravilan");
        vta[1]= new TerenAgricol(180000,407500,"Cavadinesti","Galati","Drum forestier 1","autoritate locala", "helesteu","luciu apa",true,"extravilan");
        vta[2]= new TerenAgricol(180000,407500,"Cavadinesti","Galati","Drum Agricol 1","investitor", "teren arabil","argilos",true,"extravilan");
        vta[3]= new TerenAgricol(150000, 80000, "Braila", "Braila", "Drum forestier 2", "fermier", "livada", "argilos", false, "intravilan");
        vta[4]= new TerenAgricol(200000, 95000, "Bacau", "Bacau", "Drum Agricol 3", "cooperativa agricola", "teren arabil", "sandy", true, "extravilan");
        vta[5]= new TerenAgricol(120000, 60000, "Sibiu", "Sibiu", "Drum Agricol 4", "fermier", "pasune", "argilos", false, "intravilan");
        vta[6]= new TerenAgricol(250000, 120000, "Constanta", "Constanta", "Drum Agricol 5", "cooperativa agricola", "teren arabil", "cernoziom", true, "extravilan");
        vta[7]= new TerenAgricol(180000, 85000, "Pitesti", "Arges", "Drum forestier 6", "fermier", "teren arabil", "sandy", false, "intravilan");
        vta[8]= new TerenAgricol(300000, 150000, "Craiova", "Dolj", "Drum forestier 7", "investitor", "livada", "argilos", true, "extravilan");
        vta[9]= new TerenAgricol(200000, 100000, "Targu Jiu", "Gorj", "Drum  8", "autoritate locala", "teren arabil", "cernoziom", false, "intravilan");

        
        // Afișarea detaliilor pentru fiecare teren agricol din vector
        for (int i = 0; i < vta.length; i++) {
            System.out.println("Detalii Teren Agricol " + (i + 1) + ":");
            System.out.println(vta[i].toString());
            System.out.println();
        }
        
        
       
       
    }
    
    
}
