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
public class Penthouse extends Imobiliare {
    
    private int etaj;
    private int numarGaraje;
    private int nrCamere;
    private int nrBai;
    private int an;
    private String lux;
    private boolean centrala;
    private boolean terasa;
    
    Penthouse()
    {
        this.etaj = 1;
        this.numarGaraje = 1;
        this.nrCamere = 4;
        this.nrBai=1;
        this.an = 1900;
        this.lux = "premium";
        this.centrala = true;
        this.terasa = true;
    }
    
    public Penthouse(long pretVanzare, int suprafata, String localitate, String judet, String adresa, int etaj,  int numarGaraje, int nrCamere, int nrBai, int an, String lux, boolean centrala, boolean terasa) 
    {
        super(pretVanzare,suprafata,localitate,judet,adresa);
        this.etaj = etaj;
        this.numarGaraje = numarGaraje;
        this.nrCamere = nrCamere;
        this.nrBai=nrBai;
        this.an = an;
        this.lux = lux;
        this.centrala = centrala;
        this.terasa = terasa;
    }

    public int getEtaj() {
        return etaj;
    }
    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }
    
    public int getNrGaraje() {
        return numarGaraje;
    }
    public void setNrGaraje(int numarGaraje) {
        this.numarGaraje = numarGaraje;
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
    
    public int getAn() {
        return an;
    }
    public void setAn(int an) {
        this.an = an;
    }
    
    public String getLux() {
        return lux;
    }
    public void setLux(String lux) {
        this.lux = lux;
    }
    
    public boolean getCentrala() {
        return centrala;
    }
    public void setCentrala(boolean centrala) {
        this.centrala = centrala;
    }
    
     public boolean getTerasa() {
        return terasa;
    }
    public void setTerasa(boolean terasa) {
        this.terasa = terasa;
    }
    
    public Penthouse(Penthouse f)
    {
        super(f.getPretVanzare(), f.getSuprafata(), f.getLocalitate(), f.getJudet(), f.getAdresa());
        this.etaj = f.etaj;
        this.numarGaraje = f.numarGaraje;
        this.nrCamere = f.nrCamere;
        this.an = f.an;
        this.lux = f.lux;
        this.centrala = f.centrala;
        this.terasa = f.terasa;
    }
    
    public String toString() {
        if(getCentrala()==true && getTerasa()==true && (getNrGaraje()>2 || getNrGaraje()==0)) {
            return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +", are centrala, terasa și mai are " + numarGaraje + " garaje.\n";
        } 
        else 
            if(getCentrala()==true && getTerasa()==true && getNrGaraje()==1)
        {
            return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +", are centrala, terasa și mai are " + numarGaraje + " garaj.\n";
        }
            else 
                if(getCentrala()==true && getTerasa()==false && (getNrGaraje()>2 || getNrGaraje()==0))
                {
                    return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +", are centrala, " + numarGaraje + " garaje, dar nu are terasa.\n";
                }
                else
                    if(getCentrala()==true && getTerasa()==false && getNrGaraje()==1)
                    {
                        return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +", are centrala, " + numarGaraje + " garaj, dar nu are terasa.\n";
                    }
                else
                 if(getCentrala()==false && getTerasa()==true && (getNrGaraje()>2 || getNrGaraje()==0))
                {
                    return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +", nu are centrala, dar are terasa si " + numarGaraje + " garaje.\n";
                }
                else
                    if(getCentrala()==false && getTerasa()==true && getNrGaraje()==1)
                    {
                        return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +", nu are centrala, dar are terasa si " + numarGaraje + " garaj.\n";
                    }
                else
                    if(getCentrala()==false && getTerasa()==false && (getNrGaraje()>2 || getNrGaraje()==0))
                    {
                        return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +",nu are centrala sau terasa, dar are" + numarGaraje + " garaje.\n";
                    }
                else
                    return super.toString() + "Apartamentul este un penthouse situat la etajul: " + etaj +", are" + nrCamere +" camere, " + nrBai +"bai si a fost construit in anul " + an +". Nivelul de lux este: " + lux +",nu are centrala sau terasa, dar are" + numarGaraje + " garaj.\n";
 
    }

    public static void main(String[] args) {
        // Crearea unui vector de tip Penthouse
        Penthouse[] penthouseArray = new Penthouse[10];
        String numeFisier = "test_penthouses.txt";
        
        
        // Inițializarea fiecărui element al vectorului cu un obiect Penthouse
        for (int i = 0; i < 10; i++) {
            penthouseArray[i] = new Penthouse((long) 200000.3,600,"Galati","galati","Reg 245 fdsgdfhfhd",1,2,7,3,1987,"premium",true,true);
        }

        // Afișarea detaliilor fiecărui obiect Penthouse din vector
        System.out.println("Detalii pentru fiecare obiect Penthouse din vector:");
        for (int i = 0; i < 10; i++) {
            System.out.println(penthouseArray[i].toString());
            ///System.out.println("\n");
        }
        
        /* Crearea a trei instanțe de tip Penthouse
        Penthouse penthouse1 = new Penthouse(500000, 150, "Bucuresti", "Ilfov", "Strada X", 10, 2, 4, 3, 2010, "de lux", true, true);
        Penthouse penthouse2 = new Penthouse(800000, 200, "Cluj-Napoca", "Cluj", "Strada Y", 15, 3, 5, 4, 2015, "premium", true, true);
        Penthouse penthouse3 = new Penthouse(600000, 180, "Timisoara", "Timis", "Strada Z", 12, 2, 3, 2, 2012, "deosebit", true, false);

        // Afisarea datelor membrilor pentru fiecare instanță de Penthouse
        System.out.println("Detalii penthouse 1:");
        System.out.println(penthouse1.toString());
        System.out.println("\nDetalii penthouse 2:");
        System.out.println(penthouse2.toString());
        System.out.println("\nDetalii penthouse 3:");
        System.out.println(penthouse3.toString());

        // Scrierea datelor într-un fișier de test
        try {
            FileWriter fileWriter = new FileWriter("test_penthouses.txt");
            fileWriter.write("Detalii penthouse 1:\n");
            fileWriter.write(penthouse1.toString() + "\n\n");
            fileWriter.write("Detalii penthouse 2:\n");
            fileWriter.write(penthouse2.toString() + "\n\n");
            fileWriter.write("Detalii penthouse 3:\n");
            fileWriter.write(penthouse3.toString() + "\n\n");
            fileWriter.close();
            System.out.println("\nDatele au fost scrise în fișierul test_penthouses.txt.");
        } catch (IOException e) {
            System.out.println("A apărut o eroare în timpul scrierii în fișier: " + e.getMessage());
        }
    } 
    */
        
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


    

