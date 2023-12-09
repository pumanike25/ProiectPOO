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
public class CaseDuplex extends Case {
    private boolean esteImpartitaInDoua;

    /*public CaseDuplex(){
        super(0,0,null,null,null,0,0,0,0,0,0,0,0,0,0,false,false,false,false,false,false,false,false,null);
        this.esteImpartitaInDoua = false;
    }   
  }*/
    
    public CaseDuplex(){
        super(0,0,null,null,null,0,0,0,0,0,0,0,0,0,0,false,false,false,false,false,false,false,false,null);
        this.esteImpartitaInDoua = false;
    }   
    
    // Constructor explicit
    public CaseDuplex(long pretVanzare, int suprafata, String localitate, String judet, String adresa, int suprafataUtila, int suprafataTeren, int nrCamere, int nrBucatarii,
            int nrBalcoane, int nrTerase, int nrLocuriParcare,int nrBai, int etaj, int anConstructie, boolean piscina, boolean beci, boolean izolatieTermica, boolean curent,
            boolean apa, boolean gaz, boolean garaj,boolean mobilare,String structuraRezistenta, boolean esteImpartitaInDoua) {
        super( pretVanzare,  suprafata,  localitate,  judet,  adresa,  suprafataUtila,  suprafataTeren,  nrCamere,  nrBucatarii,
             nrBalcoane,  nrTerase,  nrLocuriParcare, nrBai,  etaj,  anConstructie,  piscina,  beci,  izolatieTermica,  curent,
             apa,  gaz,  garaj, mobilare, structuraRezistenta);
        this.esteImpartitaInDoua=esteImpartitaInDoua;
       
    }
    CaseDuplex(CaseDuplex f){
        super( f.getPretVanzare(),  f.getSuprafata(),  f.getLocalitate(),  f.getJudet(),  f.getAdresa(),  f.getSuprafataUtila(),  
                f.getSuprafataTeren(),  f.getNrCamere(),  f.getNrBucatarii(), f.getNrBalcoane(),  f.getNrTerase(),  f.getNrLocuriParcare(), 
                f.getNrBai(),f.getEtaj(),  f.getAnConstructie(), f.isPiscina(),  f.isBeci(),  f.isIzolatieTermica(),  f.isCurent(), f.isApa(),
                f.isGaz(),  f.isGaraj(), f.isMobilare(),f.getStructuraRezistenta());
        this.esteImpartitaInDoua=f.esteImpartitaInDoua;
    }
    //Getter si Setter 
    public boolean isEsteImpartitaInDoua() {
        return esteImpartitaInDoua;
    }
    public void setesteImpartitaInDoua(boolean esteImpartitaInDoua) {
        this.esteImpartitaInDoua = esteImpartitaInDoua;
    }
    
     public String toString2() {
         String toString2 = super.toString();
         String impartireDescription = (isEsteImpartitaInDoua() == true) ? "Casa Duplex este impartita" : "Casa Duplex nu este impartita";
         toString2 += impartireDescription;
                return toString2;

    }
    
    
    public static void main(String[] args) {
        //return super(caseDuplex.toString());
        CaseDuplex[] vectorCaseDuplex = new CaseDuplex[10];
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
        String numeFisierCaseDuplex="test_CaseDuplex.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(numeFisierCaseDuplex))) {
    
            String linie;
            System.out.println("Continutul fisierului " + numeFisierCaseDuplex + ":");
            while ((linie = bufferedReader.readLine()) != null) {
                System.out.println(linie);
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea din fisier: " + e.getMessage());
        }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    } 
