/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imobiliareproiect;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;


/**
 *
 * @author User
 */
public class ImobiliareProiect {

    public static void main(String[] args) {
        String numeFisier = "test_apartamente.txt";
        Apartament[] vectorApartamente = new Apartament[10];
        
        Penthouse[] penthouseArray = new Penthouse[10];
        //String numeFisier1 = "test_penthouses.txt";
        
        Case[] vectorCase = new Case[10];
        //String numeFisierCase="test_case.txt";
        
        CaseDuplex[] vectorCaseDuplex = new CaseDuplex[10];
        //String numeFisierCaseDuplex="test_CaseDuplex.txt";
        
        TerenConstructii[] vtc = new TerenConstructii[10];
        //TerenAgricol[] vectorTerenAgricol= new TerenAgricol[10];
        
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
        vectorApartamente[9] = new Apartament(200000, 90, "Arad", "Arad", "Strada Q", 80, 3, 1, 2, 1999, false, "semidecomandat");

        // Afișarea detaliilor pentru fiecare apartament din vector
        for (int i = 0; i < vectorApartamente.length; i++) {
            if (vectorApartamente[i].getNrCamere() >= 2 && vectorApartamente[i].getAnConstructie() > 2000) {
            System.out.println("Detalii apartament " + (i + 1) + ":");
            System.out.println(vectorApartamente[i].toString());
            System.out.println();
        }}
        
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
    
    
    // Inițializarea fiecărui element al vectorului cu un obiect Penthouse
        penthouseArray[0] = new Penthouse(250000, 150, "București", "București", "Strada Victoriei", 5, 2, 3, 2, 2020, "premium", true, true);
        penthouseArray[1] = new Penthouse(300000, 200, "Cluj-Napoca", "Cluj", "Strada Avram Iancu", 7, 1, 4, 3, 2019, "deluxe", true, false);
        penthouseArray[2] = new Penthouse(180000, 120, "Timișoara", "Timiș", "Strada Libertății", 9, 3, 2, 1, 2021, "standard", false, true);
        penthouseArray[3] = new Penthouse(350000, 180, "Iași", "Iași", "Strada Ștefan cel Mare", 12, 2, 3, 2, 2022, "premium", true, true);
        penthouseArray[4] = new Penthouse(280000, 160, "Constanța", "Constanța", "Strada Mihai Viteazu", 4, 2, 2, 1, 2020, "deluxe", true, false);
        penthouseArray[5] = new Penthouse(320000, 190, "Oradea", "Bihor", "Strada Republicii", 6, 3, 3, 2, 2018, "premium", true, true);
        penthouseArray[6] = new Penthouse(200000, 140, "Sibiu", "Sibiu", "Strada Cetății", 8, 1, 2, 1, 2021, "standard", false, false);
        penthouseArray[7] = new Penthouse(270000, 170, "Brașov", "Brașov", "Strada Poarta Schei", 10, 2, 3, 2, 2019, "deluxe", true, true);
        penthouseArray[8] = new Penthouse(310000, 200, "Ploiești", "Prahova", "Strada Republicii", 11, 3, 3, 2, 2020, "premium", true, false);
        penthouseArray[9] = new Penthouse(290000, 150, "Arad", "Arad", "Strada Mărășești", 3, 2, 2, 1, 2022, "deluxe", false, true);


        // Afișarea detaliilor fiecărui obiect Penthouse din vector
        System.out.println("Detalii pentru fiecare obiect Penthouse din vector:");//penthouseArray[i].getLux()=="premium"
        for (int i = 0; i < 10; i++) {
             if (penthouseArray[i].getLux()=="premium" && (penthouseArray[i].getNrCamere() >= 3 ||penthouseArray[i].getAn() <2020)) {
            System.out.println(penthouseArray[i].toString());}
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
        
        /*try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(numeFisier1))) {
            String linie;
            System.out.println("Continutul fisierului " + numeFisier1+ ":\n");
            while ((linie = bufferedReader1.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier: " + e.getMessage());
        }*/
        
        
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
        //Afisarea caselor din vector dupa caracteristicile
             System.out.println("      -Casa cu pretul sub 100000 si cu stuctura de rezistenata de caramadica");
        int ok=0;
        for (int i = 0; i < vectorCase.length; i++) {
            if (vectorCase[i].getPretVanzare() <= 100000 && vectorCase[i].getStructuraRezistenta() == "caramida") {
            System.out.println("Detalii casa " + (i + 1) + ":");
            System.out.println(vectorCase[i].toString());
            System.out.println();
            ok++;
        }}
              if(ok==0)
                System.out.println("      -Nu au fost gasite case cu filtrele aplicate cerute");
            
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
    
    /*try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(numeFisierCase))) {
    
            String linie;
            System.out.println("Continutul fisierului " + numeFisierCase + ":");
            while ((linie = bufferedReader2.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier: " + e.getMessage());
        }*/

    
        vectorCaseDuplex[0] = new CaseDuplex(100000, 135, "Bucuresti","Bucuresti","Regiment 26",140 ,80, 3, 2,2,2,5,1, 5, 2005,true,true,true,true,false,false,false,false,"caramida",true);
        vectorCaseDuplex[1] = new CaseDuplex(900000,200, "Galati","Galati","B-dul  Braila 20",100 ,80, 3, 1,2,0,1,2, 1, 2015,false,false,true,true,true,false,true,true,"bca",true);
        vectorCaseDuplex[2] = new CaseDuplex(69000,193,"Danes","Mures","Dn 14 ",161,4000,3, 2,3,1,0,2, 0, 1995,false,true,true,true,true,true,false,true,"caramida",false);
        vectorCaseDuplex[3] = new CaseDuplex(150000, 120, "Timisoara", "Timis", "Strada Victoriei 10", 120, 70, 2, 2, 1, 3, 1, 3, 1, 2008, true, false, true, false, false, true, false,true, "bca",false);
        vectorCaseDuplex[4] = new CaseDuplex(450000, 180, "Iasi", "Iasi", "B-dul Palas 5", 80, 60, 2, 1, 1, 1, 2, 0, 2, 2010, true, false, false, true, true, true, false,false, "caramida",true);
        vectorCaseDuplex[5] = new CaseDuplex(1200000, 250, "Cluj-Napoca", "Cluj", "Piata Unirii 1", 200, 120, 4, 3, 2, 4, 0, 4, 3, 2019, true, true, true, true, true, false, false,true, "bca",false);
        vectorCaseDuplex[6] = new CaseDuplex(80000, 100, "Sibiu", "Sibiu", "Strada Cetatii 5", 80, 50, 2, 1, 1, 0, 0, 1, 1, 2005, false, false, true, false, false, true,true, false, "caramida",true);
        vectorCaseDuplex[7] = new CaseDuplex(300000, 150, "Brasov", "Brasov", "B-dul Eroilor 25", 120, 80, 3, 2, 2, 2, 1, 2, 2, 2013, true, true, true, true, false, true,false, true, "bca",false);
        vectorCaseDuplex[8] = new CaseDuplex(60000, 110, "Constanta", "Constanta", "Strada Tomis 15", 90, 60, 2, 1, 1, 1, 1, 1, 1, 2000, false, false, true,false, true, true, true, true, "caramida",true);
        vectorCaseDuplex[9] = new CaseDuplex(200000, 130, "Oradea", "Bihor", "Strada Republicii 30", 100, 70, 2, 1, 1, 2, 0, 2, 2, 2017, true, false, false, true, false,false, true, false, "bca",false);
        //Afisarea caracteristicolor caselor din vector
            for (int i = 0; i < vectorCaseDuplex.length; i++) {
            System.out.println("Detalii casa duplex " + (i + 1) + ":");
            System.out.println(vectorCaseDuplex[i].toString());
            System.out.println();
        }
        //Afisarea caselor duplex din vector dupa caracteristicile
        System.out.println("      -Casa duplex cu pretul peste 100000 cu cel putin 2 camere");
        ok=0;
        for (int i = 0; i < vectorCaseDuplex.length; i++) {
            if (vectorCaseDuplex[i].getPretVanzare() > 100000 && vectorCaseDuplex[i].getNrCamere() > 2) {
            System.out.println("Detalii casa duplex " + (i + 1) + ":");
            System.out.println(vectorCaseDuplex[i].toString2());
            System.out.println();
            ok++;
        }}
              if(ok==0)
                System.out.println("      -Nu au fost gasite case cu filtrele aplicate cerute");
        
        
        /*   
        CaseDuplex caseDuplex1 = new CaseDuplex(100000, 135, "Bucuresti","Bucuresti","Regiment 26",140 ,80, 3, 2,2,2,5,1, 5, 2005,true,true,true,true,false,false,false,false,"caramida",true);
        CaseDuplex caseDuplex2 = new CaseDuplex(900000,200, "Galati","Galati","B-dul  Braila 20",100 ,80, 3, 1,2,0,1,2, 1, 2015,false,false,true,true,true,false,true,true,"bca",false);
        CaseDuplex caseDuplex3 = new CaseDuplex(69000,193,"Danes","Mures","Dn 14 ",161,4000,3, 2,3,1,0,2, 0, 1995,false,true,true,true,true,true,false,true,"caramida",true);
        CaseDuplex caseDuplex4 = new CaseDuplex(caseDuplex1); // copiere
        */
        
           /*  try {
            FileWriter fileWriter = new FileWriter("test_CaseDuplex.txt");
            fileWriter.write("Detalii Casa Duplex 1:\n");
            fileWriter.write(caseDuplex1.toString2() + "\n\n");
            fileWriter.write("Detalii Casa Duplex 2:\n");
            fileWriter.write(caseDuplex2.toString2() + "\n\n");
            fileWriter.write("Detalii Casa Duplex 3:\n");
            fileWriter.write(caseDuplex3.toString2() + "\n\n");
            fileWriter.close();
            System.out.println("\nDatele au fost scrise în fișierul test_CaseDuplex.txt.");
        } catch (IOException e) {
            System.out.println("A apărut o eroare în timpul scrierii în fișier: " + e.getMessage());*/
            /*try (BufferedReader bufferedReader3 = new BufferedReader(new FileReader(numeFisierCaseDuplex))) 
            {
    
            String linie;
            System.out.println("Continutul fisierului " + numeFisierCaseDuplex + ":");
            while ((linie = bufferedReader3.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier: " + e.getMessage());
        }*/

       /*TerenAgricol[] vectorTerenAgricol= new TerenAgricol[10];
        vectorTerenAgricol[0] = new TerenAgricol(120000, 800, "Brasov", "Brasov", "Str. Florilor 1", "Agricultor1", "Pasune", "Sol argilos", true, "extravilan");
        vectorTerenAgricol[1] = new TerenAgricol(175000, 1200, "Cluj-Napoca", "Cluj", "Str. Padurii 12", "Agricultor2", "Arabil", "Sol nisipos", false, "intravilan");
        vectorTerenAgricol[2] = new TerenAgricol(220000, 1000, "Timisoara", "Timis", "Str. Mihai Viteazu 7", "Agricultor3", "Livada", "Sol fertil", true, "extravilan");
        vectorTerenAgricol[3] = new TerenAgricol(300000, 1500, "Iasi", "Iasi", "Str. Principala 21", "Agricultor4", "Faneata", "Sol umed", false, "intravilan");
        vectorTerenAgricol[4] = new TerenAgricol(250000, 1800, "Bucuresti", "Bucuresti", "Str. Centrala 5", "Agricultor5", "Arabil", "Sol argilos", true, "extravilan");
        vectorTerenAgricol[5] = new TerenAgricol(190000, 900, "Constanta", "Constanta", "Str. Mare 10", "Agricultor6", "Pasune", "Sol nisipos", false, "intravilan");
        vectorTerenAgricol[6] = new TerenAgricol(280000, 1100, "Sibiu", "Sibiu", "Str. Plopilor 3", "Agricultor7", "Arabil", "Sol fertil", true, "extravilan");
        vectorTerenAgricol[7] = new TerenAgricol(200000, 950, "Ploiesti", "Prahova", "Str. Libertatii 8", "Agricultor8", "Faneata", "Sol umed", false, "intravilan");
        vectorTerenAgricol[8] = new TerenAgricol(240000, 1300, "Oradea", "Bihor", "Str. Victoriei 15", "Agricultor9", "Arabil", "Sol argilos", true, "extravilan");
        vectorTerenAgricol[9] = new TerenAgricol(170000, 700, "Arad", "Arad", "Str. Independentei 2", "Agricultor10", "Livada", "Sol nisipos", false, "intravilan");

        // Afișarea detaliilor pentru fiecare teren agricol din vector
        for (int i = 0; i < vectorTerenAgricol.length; i++) {
            System.out.println("Detalii teren agricol " + (i + 1) + ":");
            System.out.println(vectorTerenAgricol[i].toString());
            System.out.println();
        }
        
       TerenAgricol teren1 = new TerenAgricol(120000, 800, "Brasov", "Brasov", "Str. Florilor 1", "Agricultor1", "Pasune", "Sol argilos", true, "extravilan");
        TerenAgricol teren2 = new TerenAgricol(175000, 1200, "Cluj-Napoca", "Cluj", "Str. Padurii 12", "Agricultor2", "Arabil", "Sol nisipos", false, "intravilan");
        TerenAgricol teren3 = new TerenAgricol(220000, 1000, "Timisoara", "Timis", "Str. Mihai Viteazu 7", "Agricultor3", "Livada", "Sol fertil", true, "extravilan");

        // Scriere în fișier
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("teren_agricol.txt"))) 
        {
            writer.write("Informații despre terenul 1:\n");
            writer.write(teren1.toString());
            writer.write("\n\nInformații despre terenul 2:\n");
            writer.write(teren2.toString());
            writer.write("\n\nInformații despre terenul 3:\n");
            writer.write(teren3.toString());
            System.out.println("Informațiile despre terenurile agricole au fost scrise în fișierul terenuri_agricole.txt.");
        } 
        catch (IOException e) 
        {
            System.out.println("Eroare la scrierea în fișier: " + e.getMessage());
        }*/
       
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
        
        // Afișarea detaliilor pentru fiecare apartament din vector
        for (int i = 0; i < vta.length; i++) {
            System.out.println("Detalii Teren Agricol " + (i + 1) + ":");
            System.out.println(vta[i].toString());
            System.out.println();
        }

        System.out.println("\n      ----------Terenuri agricole fara irigatii si cu tipul de teren: arabil----------");
        int ok=0;
        for (TerenAgricol ta : vta) {
            if (ta.isIrigatii()==false && ta.tipCultura=="teren arabil" ) 
            {
                System.out.println(ta.toString()+"\n");
                ok++;
            }
        }
            
            if(ok==0)
                System.out.println("      ----------Nu au fost gasite terenuri cu detaliile cerute---------");
        
        
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

        System.out.println("      --------Terenuri de constructii cu suprafata mai mare de 1000 metri patrati si cu apa curenta--------");
        int ok=0;
        for (TerenConstructii tc : vtc) 
            {
              if (tc.getSuprafata() > 1000 && tc.areApa == true) 
                {
                    System.out.println(tc.toString()+"\n");
                    ok++;
                }
            }    
        if(ok==0)
                System.out.println("      ----------Nu au fost gasite terenuri cu detaliile cerute---------");
        
    }
}


