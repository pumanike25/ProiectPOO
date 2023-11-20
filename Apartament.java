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
    public Apartament(long pretVanzare, int suprafata, String localitate, String judet, String adresa, int suprafataU, int nrCamere, int nrBai, int etaj, int anConstructie, boolean mobilare, String tip)
    {
        super(pretVanzare,suprafata,localitate,judet,adresa);
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
        super(f.getPretVanzare(), f.getSuprafata(), f.getLocalitate(), f.getJudet(), f.getAdresa());
        
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
                return super.toString()+"Apartamentul are suprafata utila de "+suprafataU+" metrii patrati, "+nrCamere+" camere, are "+nrBai+" bai, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
            else
                return super.toString()+"Apartamentul are suprafata utila de "+suprafataU+" metrii patrati, "+nrCamere+" camere, are o "+nrBai+" baie, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
        if(getNrCamere()<2 && getNrBai()>=2)
            return super.toString()+"Apartamentul are suprafata utila de "+suprafataU+" metrii patrati, o "+nrCamere+" camera, are "+nrBai+" bai, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
        else
            return super.toString()+"Apartamentul are suprafata utila de "+suprafataU+" metrii patrati, (o) "+nrCamere+" camera, are o "+nrBai+" baie, se afla la etajul "+etaj+". Acesta a fost construit in anul "+anConstructie+" si este "+tip+".\n";
        }
    }
    
    public static void main(String[] args) {
        String numeFisier = "test_apartamente.txt";
        
        Apartament[] vectorApartamente = new Apartament[10];

        // Inițializarea vectorului cu obiecte Apartament distincte
        vectorApartamente[0] = new Apartament(200000, 100, "Bucuresti", "Ilfov", "Strada X", 90, 3, 2, 1, 2005, true, "decomandat");
        vectorApartamente[1] = new Apartament(180000, 85, "Cluj-Napoca", "Cluj", "Strada Y", 80, 2, 1, 2, 2010, false, "semidecomandat");
        vectorApartamente[2] = new Apartament(250000, 120, "Timisoara", "Timis", "Strada Z", 110, 4, 2, 3, 2015, true, "decomandat");
        vectorApartamente[3] = new Apartament(300000, 150, "Iasi", "Iasi", "Strada W", 130, 5, 3, 4, 2018, false, "semidecomandat");
        vectorApartamente[4] = new Apartament(220000, 95, "Brasov", "Brasov", "Strada V", 85, 3, 1, 2, 2012, true, "decomandat");
        vectorApartamente[5] = new Apartament(270000, 130, "Constanta", "Constanta", "Strada U", 120, 4, 2, 3, 2016, false, "semidecomandat");
        vectorApartamente[6] = new Apartament(190000, 75, "Ploiesti", "Prahova", "Strada T", 70, 2, 1, 1, 2008, true, "decomandat");
        vectorApartamente[7] = new Apartament(320000, 170, "Oradea", "Bihor", "Strada S", 150, 6, 3, 5, 2020, false, "semidecomandat");
        vectorApartamente[8] = new Apartament(280000, 140, "Sibiu", "Sibiu", "Strada R", 125, 5, 2, 4, 2017, true, "decomandat");
        vectorApartamente[9] = new Apartament(200000, 90, "Arad", "Arad", "Strada Q", 80, 3, 1, 2, 2011, false, "semidecomandat");

        // Afișarea detaliilor pentru fiecare apartament din vector
        for (int i = 0; i < vectorApartamente.length; i++) {
            System.out.println("Detalii apartament " + (i + 1) + ":");
            System.out.println(vectorApartamente[i].toString());
            System.out.println();
        }
        
        /*Apartament apartament1 = new Apartament(150000, 100, "Bucuresti","Bucuresti","Regiment 20, Bloc C24", 80, 3, 1, 5, 2005,true, "semidecomandat");
        Apartament apartament2 = new Apartament(200000, 120, "Cluj-Napoca","Cluj-Napoca","strada snurului, bloc 2465", 90, 4, 3, 3, 2010,false, "decomandat");
        Apartament apartament3 = new Apartament(apartament1); // copiere

        System.out.println("Detalii apartament 1:");
        System.out.println(apartament1.toString());
        System.out.println("\nDetalii apartament 2:");
        System.out.println(apartament2.toString());
        System.out.println("\nDetalii apartament 3:");
        System.out.println(apartament3.toString());
        
        Scrierea datelor într-un fișier de test
        try {
            FileWriter fileWriter = new FileWriter("test_apartamente.txt");
            fileWriter.write("Detalii apartament 1:\n");
            fileWriter.write(apartament1.toString() + "\n\n");
            fileWriter.write("Detalii apartament 2:\n");
            fileWriter.write(apartament2.toString() + "\n\n");
            fileWriter.write("Detalii apartament 3:\n");
            fileWriter.write(apartament3.toString() + "\n\n");
            fileWriter.close();
            System.out.println("\nDatele au fost scrise în fișierul test_apartamente.txt.");
        } catch (IOException e) {
            System.out.println("A apărut o eroare în timpul scrierii în fișier: " + e.getMessage());
        }*/
       
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(numeFisier))) {
            String linie;
            System.out.println("Continutul fisierului " + numeFisier + ":\n");
            while ((linie = bufferedReader.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier: " + e.getMessage());
        }
    }
}
