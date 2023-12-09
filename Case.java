/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imobiliareproiect;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author tudor
 */
public class Case extends Imobiliare{
    private int suprafataUtila;
    private int suprafataTeren;
    private int nrCamere;
    private int nrBucatarii;
    private int nrBalcoane;
    private int nrTerase;
    private int nrLocuriParcare;
    private int nrBai;
    private int etaj;
    private boolean mobilare;
    private boolean piscina;
    private boolean beci;
    private boolean izolatieTermica;
    private boolean curent;
    private boolean apa;
    private boolean gaz;
    private boolean garaj;
    private int anConstructie;
    private String structuraRezistenta;
    
    
    //Constructor implicit
    Case(){
        super();
        this.suprafataUtila= 0;
        this.suprafataTeren= 0;
        this.nrCamere=0;
        this.nrBai=0;
        this.etaj=0;
        this.anConstructie=1500;
        this.mobilare=false;
        
}
    //Constructor explicit
    public Case(long pretVanzare, int suprafata, String localitate, String judet, String adresa, int suprafataUtila, int suprafataTeren, int nrCamere, int nrBucatarii,
            int nrBalcoane, int nrTerase, int nrLocuriParcare,int nrBai, int etaj, int anConstructie, boolean piscina, boolean beci, boolean izolatieTermica, boolean curent,
            boolean apa, boolean gaz, boolean garaj,boolean mobilare,String structuraRezistenta)
    {
        super(pretVanzare,suprafata,localitate,judet,adresa);
        this.suprafataUtila= suprafataUtila;
        this.suprafataTeren=suprafataTeren;
        this.nrCamere=nrCamere;
        this.nrBucatarii=nrBucatarii;
        this.nrBalcoane=nrBalcoane;
        this.nrTerase=nrTerase;
        this.nrLocuriParcare=nrLocuriParcare;
        this.nrBai=nrBai;
        this.etaj=etaj;
        this.anConstructie=anConstructie;
        this.piscina=piscina;
        this.beci=beci;
        this.izolatieTermica=izolatieTermica;
        this.curent=curent;
        this.apa=apa;
        this.gaz=gaz;
        this.garaj=garaj;
        this.mobilare=mobilare;
        this.structuraRezistenta=structuraRezistenta;
        
        
    }
    //constructor copiere
    Case(Case f)
    {
        super(f.getPretVanzare(), f.getSuprafata(), f.getLocalitate(), f.getJudet(), f.getAdresa());
        
        this.suprafataTeren=f.suprafataTeren;
        this.suprafataUtila= f.suprafataUtila;
        this.nrCamere=f.nrCamere;
        this.nrBucatarii=f.nrBucatarii;
        this.nrBalcoane=f.nrBalcoane;
        this.nrTerase=f.nrTerase;
        this.nrLocuriParcare=f.nrLocuriParcare;
        this.nrBai=f.nrBai;
        this.etaj=f.etaj;
        this.anConstructie=f.anConstructie;
        this.piscina=f.piscina;
        this.beci=f.beci;
        this.izolatieTermica=f.izolatieTermica;
        this.curent=f.curent;
        this.apa=f.apa;
        this.gaz=f.gaz;
        this.garaj=f.garaj;
        this.mobilare=f.mobilare;
        this.structuraRezistenta=f.structuraRezistenta;
        
    }
    

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
    
    public int getNrBucatarii() {
        return nrBucatarii;
    }
    public void setNrBucatarii(int nrBucatarii) {
        this.nrBucatarii = nrBucatarii;
    }
    
    public int getNrBalcoane() {
        return nrBalcoane;
    }
    public void setNrBalcoane(int nrBalcoane) {
        this.nrBalcoane = nrBalcoane;
    }
    
    public int getNrTerase() {
        return nrTerase;
    }
    public void setNrTerase(int nrTerase) {
        this.nrTerase = nrTerase;
    }
    
    public int getNrLocuriParcare() {
        return nrLocuriParcare;
    }
    public void setNrLocuriParcare(int nrLocuriParcare) {
        this.nrLocuriParcare = nrLocuriParcare;
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
    
    public boolean isMobilare() {
        return mobilare;
    }
    public void setMobilare(boolean mobilare) {
        this.mobilare = mobilare;
    }
    
    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
    public boolean isBeci() {
        return beci;
    }
    public void setBeci(boolean beci) {
        this.beci = beci;
    }
    
    public boolean isIzolatieTermica() {
        return izolatieTermica;
    }
    public void setIzolatieTermica(boolean izolatieTermica) {
        this.izolatieTermica = izolatieTermica;
    }
    
    public boolean isCurent() {
        return curent;
    }
    public void setCurent(boolean curent) {
        this.curent = curent;
    }
    
     public boolean isApa() {
        return apa;
    }
    public void setApa(boolean apa) {
        this.apa = apa;
    }

     public boolean isGaz() {
        return gaz;
    }
    public void setGaz(boolean gaz) {
        this.gaz = gaz;
    }
    
    public boolean isGaraj() {
        return garaj;
    }
    public void setGaraj(boolean garaj) {
        this.garaj = garaj;
    }
    
     public String getStructuraRezistenta() {
        return structuraRezistenta;
    }
    public void setStructuraRezistenta(String structuraRezistenta) {
        this.structuraRezistenta = structuraRezistenta;
    }

    
    public String toString() {
    String etajDescription = (getEtaj() == 0) ? "fara etaj" : ((etaj == 1) ? "cu un etaj" : "cu " + etaj + " etaje");
    String camereDescription = (getNrCamere() == 1) ? "cu o singura camera" : "cu " + nrCamere + " camere";
    String bucatariiDescription = (getNrBucatarii() == 1) ? "cu o singura bucatarie" : "cu " + nrBucatarii + " bucatarii";
    String balcoaneDescription = (getNrBalcoane() == 1) ? "cu un singur balcon" : "cu " + nrBalcoane + " balcoane";
    String teraseDescription = (getNrTerase() == 0) ? "fara terasa " : ((nrTerase == 1) ? "cu o terasa " : "cu " + nrTerase + " terase ");
    String locuriparcareDescription = (getNrLocuriParcare() == 0) ? "fara locuri de parcare " : ((nrLocuriParcare == 1) ? "cu un loc de parcare" : "cu " + nrLocuriParcare + " locuri de parcare ");
    String baiDescription = (getNrBai() == 1) ? "are o singura baie" : "are " + nrBai + " bai";
    String mobilareDescription = (isMobilare() == true) ? "Casa este mobilata" : "Casa nu este mobilata";
    String piscinaDescription = (isPiscina() == true) ? "Casa are piscina" : "Casa nu are piscina";
    String beciDescription = (isBeci() == true) ? "Casa are beci" : "Casa nu are beci";
    String izolatieTermicaDescription = (isIzolatieTermica() == true) ? "Casa este izolata termic" : "Casa nu este izolata termic";
    String curentDescription = (isCurent() == true) ? "Casa este racordata la reteaua de curent" : "Casa nu este racordata la reteaua de curent";
    String apaDescription = (isApa() == true) ? "Casa este racordata la reteaua de apa" : "Casa nu este racordata la reteaua de apa";
    String gazDescription = (isGaz() == true) ? "Casa este racordata la reteaua de gaz" : "Casa nu este racordata la reteaua de gaz";
     String garajDescription = (isGaraj() == true) ? "Casa are garaj" : "Casa nu are garaj";
    return "Casa are suprafata utila " + suprafataUtila + " metri patrati, cu un teren de " +
            suprafataTeren + " metri patrati, construita in anul " + anConstructie + " din " + structuraRezistenta +". Casa este " + etajDescription + ", " + camereDescription + ", "+ 
            bucatariiDescription + ", "+ balcoaneDescription + ", "+ teraseDescription + ", "+ locuriparcareDescription + ", "+ camereDescription + ", " + baiDescription + " " +
            mobilareDescription + "." + piscinaDescription + "." + beciDescription + "." + izolatieTermicaDescription + "." + curentDescription + "." + apaDescription + "." + gazDescription + "."
            + garajDescription + ".\n";
}


        public static void main(String[] args) {
        
            Case[] vectorCase = new Case[10];
            vectorCase[0] = new Case(100000, 135, "Bucuresti","Bucuresti","Regiment 26",140 ,80, 3, 2,2,2,5,1, 5, 2005,true,true,true,true,false,false,false,false,"caramida");
            vectorCase[1] = new Case(900000,200, "Galati","Galati","B-dul  Braila 20",100 ,80, 3, 1,2,0,1,2, 1, 2015,false,false,true,true,true,false,true,true,"bca");
            vectorCase[2] = new Case(69000,193,"Danes","Mures","Dn 14 ",161,4000,3, 2,3,1,0,2, 0, 1995,false,true,true,true,true,true,false,true,"caramida");
            vectorCase[3] = new Case(150000, 120, "Timisoara", "Timis", "Strada Victoriei 10", 120, 70, 2, 2, 1, 3, 1, 3, 1, 2008, true, false, true, false, false, true, false,true, "bca");
            vectorCase[4] = new Case(450000, 180, "Iasi", "Iasi", "B-dul Palas 5", 80, 60, 2, 1, 1, 1, 2, 0, 2, 2010, true, false, false, true, true, true, false,false, "caramida");
            vectorCase[5] = new Case(1200000, 250, "Cluj-Napoca", "Cluj", "Piata Unirii 1", 200, 120, 4, 3, 2, 4, 0, 4, 3, 2019, true, true, true, true, true, false, false,true, "bca");
            vectorCase[6] = new Case(80000, 100, "Sibiu", "Sibiu", "Strada Cetatii 5", 80, 50, 2, 1, 1, 0, 0, 1, 1, 2005, false, false, true, false, false, true,true, false, "caramida");
            vectorCase[7] = new Case(300000, 150, "Brasov", "Brasov", "B-dul Eroilor 25", 120, 80, 3, 2, 2, 2, 1, 2, 2, 2013, true, true, true, true, false, true,false, true, "bca");
            vectorCase[8] = new Case(60000, 110, "Constanta", "Constanta", "Strada Tomis 15", 90, 60, 2, 1, 1, 1, 1, 1, 1, 2000, false, false, true,false, true, true, true, true, "caramida");
            vectorCase[9] = new Case(200000, 130, "Oradea", "Bihor", "Strada Republicii 30", 100, 70, 2, 1, 1, 2, 0, 2, 2, 2017, true, false, false, true, false,false, true, false, "bca");
            
            //Afisarea caracteristicolor caselor din vector
            for (int i = 0; i < vectorCase.length; i++) {
            System.out.println("Detalii casa " + (i + 1) + ":");
            System.out.println(vectorCase[i].toString());
            System.out.println();
        }
            
        /*Case case1 = new Case(100000, 135, "Bucuresti","Bucuresti","Regiment 26",140 ,80, 3, 2,2,2,5,1, 5, 2005,true,true,true,true,false,false,false,false,"caramida");
        Case case2 = new Case(900000,200, "Galati","Galati","B-dul  Braila 20",100 ,80, 3, 1,2,0,1,2, 1, 2015,false,false,true,true,true,false,true,true,"bca");
        Case case3 = new Case(69000,193,"Danes","Mures","Dn 14 ",161,4000,3, 2,3,1,0,2, 0, 1995,false,true,true,true,true,true,false,true,"caramida");
        Case case4 = new Case(case1); // copiere
        
        System.out.println("Detaliile casei 1:");
        System.out.println(case1.toString());
        System.out.println("\nDetaliile casei 2:");
        System.out.println(case2.toString());
        System.out.println("\nDetaliile casei 3:");
        System.out.println(case3.toString());
        System.out.println("\nDetaliile casei 4 (copie a casei 1):");
        System.out.println(case4.toString());
        try {
            FileWriter fileWriter = new FileWriter("test_case.txt");
            fileWriter.write("Detalii casa 1:\n");
            fileWriter.write(case1.toString() + "\n\n");
            fileWriter.write("Detalii casa 2:\n");
            fileWriter.write(case2.toString() + "\n\n");
            fileWriter.write("Detalii casa 3:\n");
            fileWriter.write(case3.toString() + "\n\n");
            fileWriter.close();
            System.out.println("\nDatele au fost scrise în fișierul test_case.txt.");
        } catch (IOException e) {
            System.out.println("A apărut o eroare în timpul scrierii în fișier: " + e.getMessage());
        
    }*/
        String numeFisierCase="test_case.txt";
try (BufferedReader bufferedReader = new BufferedReader(new FileReader(numeFisierCase))) {
    
            String linie;
            System.out.println("Continutul fisierului " + numeFisierCase + ":");
            while ((linie = bufferedReader.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier: " + e.getMessage());
        }
    }}
