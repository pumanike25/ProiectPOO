package com.mycompany.imobiliareproiect;

//import javax.swing.JFrame;

import javax.swing.JFrame;


public class ProGui extends javax.swing.JFrame {
    
    private Apartament[] ap;

    public ProGui(Apartament[] apartamente) {
        this.ap = apartamente;
        initComponents();
        apartamente.toString();
        
    }
    
    
    
    private ProGuiAp proGuiAp;
    
    
     private TerenConstructii[] vtc;
     private TerenAgricol [] vta;
     private Apartament[] vectorApartamente;
     private Penthouse[] vectorPenthouse;
     private Case[] vectorCase ;
     private CaseDuplex[] vectorCaseDuplex;
     
     
    public ProGui() {
        initComponents();
        initVectorTerenuri();  // Inițializați vectorul aici
        initVectorApartamente();
        initVectorPenthouse();
        initVectorTerenuriAg();
        initVectorCase();
        initVectorCaseDuplex();
    }
 public static void openMainWindow(Apartament[] apartamente) {
        ProGui mainWindow = new ProGui(apartamente);
        mainWindow.setVisible(true); // afișăm fereastra principală
    }
    private void initVectorApartamente() {
        vectorApartamente = new Apartament[10];
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

    }
    
     private void initVectorPenthouse() {
        vectorPenthouse = new Penthouse[10];
        vectorPenthouse[0] = new Penthouse(250000, 150, "București", "București", "Strada Victoriei", 5, 2, 3, 2, 2020, "premium", true, true);
        vectorPenthouse[1] = new Penthouse(300000, 200, "Cluj-Napoca", "Cluj", "Strada Avram Iancu", 7, 1, 4, 3, 2019, "deluxe", true, false);
        vectorPenthouse[2] = new Penthouse(180000, 120, "Timișoara", "Timiș", "Strada Libertății", 9, 3, 2, 1, 2021, "standard", false, true);
        vectorPenthouse[3] = new Penthouse(350000, 180, "Iași", "Iași", "Strada Ștefan cel Mare", 12, 2, 3, 2, 2022, "premium", true, true);
        vectorPenthouse[4] = new Penthouse(280000, 160, "Constanța", "Constanța", "Strada Mihai Viteazu", 4, 2, 2, 1, 2020, "deluxe", true, false);
        vectorPenthouse[5] = new Penthouse(320000, 190, "Oradea", "Bihor", "Strada Republicii", 6, 3, 3, 2, 2018, "premium", true, true);
        vectorPenthouse[6] = new Penthouse(200000, 140, "Sibiu", "Sibiu", "Strada Cetății", 8, 1, 2, 1, 2021, "standard", false, false);
        vectorPenthouse[7] = new Penthouse(270000, 170, "Brașov", "Brașov", "Strada Poarta Schei", 10, 2, 3, 2, 2019, "deluxe", true, true);
        vectorPenthouse[8] = new Penthouse(310000, 200, "Ploiești", "Prahova", "Strada Republicii", 11, 3, 3, 2, 2020, "premium", true, false);
        vectorPenthouse[9] = new Penthouse(290000, 150, "Arad", "Arad", "Strada Mărășești", 3, 2, 2, 1, 2022, "deluxe", false, true);

    }
     private void initVectorCase(){
        vectorCase = new Case[10];
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
           
     }
     
     private void initVectorCaseDuplex(){
        vectorCaseDuplex = new CaseDuplex[10];
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
        
     }
    
    
private void initVectorTerenuri() {
        
        vtc = new TerenConstructii[10];
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
    }

    
    
     private void initVectorTerenuriAg() {
        vta = new TerenAgricol[10];
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
}




    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        celMaiMicPretCase = new javax.swing.JTextField();
        ceaMaiMicaSuprafataCase = new javax.swing.JTextField();
        judetCase = new javax.swing.JTextField();
        adresaCase = new javax.swing.JTextField();
        localitateCase = new javax.swing.JTextField();
        butonAfisareCase = new javax.swing.JButton();
        celMaiMarePretCase = new javax.swing.JTextField();
        ceaMaiMareSuprafataCase = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        mobilareCase = new javax.swing.JTextField();
        izolatieTermicaCase = new javax.swing.JTextField();
        curentCase = new javax.swing.JTextField();
        apaCase = new javax.swing.JTextField();
        gazCase = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        structuraRezistentaCase = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        celMaiMicPretCaseDuplex = new javax.swing.JTextField();
        ceaMaiMicaSuprafataCaseDuplex = new javax.swing.JTextField();
        judetCaseDuplex = new javax.swing.JTextField();
        adresaCaseDuplex = new javax.swing.JTextField();
        localitateCaseDuplex = new javax.swing.JTextField();
        butonAfisareCaseDuplex1 = new javax.swing.JButton();
        celMaiMarePretCaseDuplex = new javax.swing.JTextField();
        ceaMaiMareSuprafataCaseDuplex = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        mobilareCaseDuplex = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        esteImpartitaCaseDuplex = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        camera = new javax.swing.JLabel();
        textCamera = new javax.swing.JTextField();
        butonAfisareAp = new javax.swing.JButton();
        baie = new javax.swing.JLabel();
        textBai = new javax.swing.JTextField();
        anConstr = new javax.swing.JLabel();
        textAn = new javax.swing.JTextField();
        anConstr1 = new javax.swing.JLabel();
        localitate1 = new javax.swing.JTextField();
        anConstr2 = new javax.swing.JLabel();
        judet1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        pretPe = new javax.swing.JTextField();
        nivelLux = new javax.swing.JTextField();
        etajPe = new javax.swing.JTextField();
        centralaPe = new javax.swing.JTextField();
        terasaPe = new javax.swing.JTextField();
        butonAfisarePe = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        celMaiMicPret = new javax.swing.JTextField();
        ceaMaiMicaSuprafata = new javax.swing.JTextField();
        judet = new javax.swing.JTextField();
        localitate = new javax.swing.JTextField();
        scop = new javax.swing.JTextField();
        frontStradal = new javax.swing.JTextField();
        adresa = new javax.swing.JTextField();
        areApa = new javax.swing.JTextField();
        areCurent = new javax.swing.JTextField();
        clasificare = new javax.swing.JTextField();
        butonAfisareTerenConstructii = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        celMaiMarePret = new javax.swing.JTextField();
        ceaMaiMareSuprafata = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        celMaiMicPretAg = new javax.swing.JTextField();
        ceaMaiMicaSuprafataAg = new javax.swing.JTextField();
        judetAg = new javax.swing.JTextField();
        localitateAg = new javax.swing.JTextField();
        tipCultura = new javax.swing.JTextField();
        tipSolicitant = new javax.swing.JTextField();
        adresaAg = new javax.swing.JTextField();
        tipSol = new javax.swing.JTextField();
        irigatii = new javax.swing.JTextField();
        clasificareAg = new javax.swing.JTextField();
        butonAfisareTerenAgricol = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        celMaiMarePretAg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ceaMaiMareSuprafataAg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 22)); // NOI18N
        jLabel1.setText("Imobiliare");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ce tipuri de imobiliare doriti sa cautati?");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Pret vanzare de la");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Localitate");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Suprafata de la");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Judet");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Adresa");

        butonAfisareCase.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butonAfisareCase.setText("Afisare");
        butonAfisareCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareCaseActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel37.setText("la");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel38.setText("la");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel39.setText("Izolatie termica");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel40.setText("Mobilare");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setText("Racordat la apa");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setText("Racordat la curent");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel43.setText("Racordat la gaz");

        mobilareCase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobilareCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilareCaseActionPerformed(evt);
            }
        });

        apaCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apaCaseActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setText("Structura Rezistenta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(ceaMaiMicaSuprafataCase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ceaMaiMareSuprafataCase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(celMaiMicPretCase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(celMaiMarePretCase, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(61, 61, 61)
                            .addComponent(localitateCase, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(79, 79, 79)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adresaCase, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(judetCase, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(butonAfisareCase, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(structuraRezistentaCase, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mobilareCase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gazCase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(izolatieTermicaCase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(curentCase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(apaCase, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celMaiMicPretCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celMaiMarePretCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mobilareCase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ceaMaiMicaSuprafataCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ceaMaiMareSuprafataCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(izolatieTermicaCase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localitateCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curentCase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judetCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apaCase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gazCase, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adresaCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(structuraRezistentaCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(butonAfisareCase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Case", jPanel1);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel45.setText("Pret vanzare de la");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel46.setText("Localitate");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel47.setText("Suprafata de la");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel48.setText("Judet");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel49.setText("Adresa");

        butonAfisareCaseDuplex1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        butonAfisareCaseDuplex1.setText("Afisare");
        butonAfisareCaseDuplex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareCaseDuplex1ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel50.setText("la");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel51.setText("la");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel53.setText("Casa este impartita in 2");

        mobilareCaseDuplex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mobilareCaseDuplex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilareCaseDuplexActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel54.setText("Mobilare");

        esteImpartitaCaseDuplex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        esteImpartitaCaseDuplex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esteImpartitaCaseDuplexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel45)
                                .addComponent(jLabel47))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(ceaMaiMicaSuprafataCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel51)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ceaMaiMareSuprafataCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(celMaiMicPretCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel50)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(celMaiMarePretCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel46)
                            .addGap(61, 61, 61)
                            .addComponent(localitateCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel49)
                            .addGap(79, 79, 79)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adresaCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(judetCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butonAfisareCaseDuplex1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esteImpartitaCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobilareCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(247, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celMaiMicPretCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celMaiMarePretCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilareCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceaMaiMicaSuprafataCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceaMaiMareSuprafataCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localitateCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esteImpartitaCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judetCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresaCaseDuplex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(butonAfisareCaseDuplex1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Case duplex", jPanel2);

        camera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        camera.setText("Camera:");

        butonAfisareAp.setFont(new java.awt.Font("Swis721 Blk BT", 0, 18)); // NOI18N
        butonAfisareAp.setText("Afisare");
        butonAfisareAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareApActionPerformed(evt);
            }
        });

        baie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        baie.setText("Bai:");

        anConstr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anConstr.setText("An constructie:");

        anConstr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anConstr1.setText("Localitate:");

        anConstr2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anConstr2.setText("Judet:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anConstr, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camera, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anConstr1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anConstr2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBai, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(localitate1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 551, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(judet1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butonAfisareAp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBai, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anConstr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localitate1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anConstr1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judet1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anConstr2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonAfisareAp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Apartament", jPanel3);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Pret:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Nivel Lux:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Etaj:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Centrala:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Terasa:");

        pretPe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nivelLux.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        etajPe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        centralaPe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        terasaPe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        butonAfisarePe.setText("Afisare");
        butonAfisarePe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisarePeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nivelLux, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pretPe, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etajPe, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centralaPe, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terasaPe, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(644, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butonAfisarePe, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pretPe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelLux, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etajPe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centralaPe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terasaPe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(butonAfisarePe, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Penthouse", jPanel4);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setText("Pret vanzare de la ");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText("Localitate");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setText("Suprafata de la");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setText("Judet");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setText("Adresa");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel28.setText("Front Stradal");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setText("Are retea de apa");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setText("Are retea de curent");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel31.setText("Clasificare");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel32.setText("Scop");

        butonAfisareTerenConstructii.setFont(new java.awt.Font("Trebuchet MS", 2, 20)); // NOI18N
        butonAfisareTerenConstructii.setText("Afisare");
        butonAfisareTerenConstructii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareTerenConstructiiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("la");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("la");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(judet, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(115, 115, 115))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ceaMaiMicaSuprafata))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(celMaiMicPret, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(celMaiMarePret, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(ceaMaiMareSuprafata))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(localitate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(clasificare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frontStradal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scop, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(areApa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(areCurent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 638, Short.MAX_VALUE)
                .addComponent(butonAfisareTerenConstructii, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(celMaiMarePret, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(celMaiMicPret, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(frontStradal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ceaMaiMicaSuprafata, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ceaMaiMareSuprafata, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(localitate, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(areApa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(areCurent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clasificare, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(butonAfisareTerenConstructii, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Teren Constructii", jPanel7);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Pret vanzare de la");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Localitate");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Suprafata de la");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Judet");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Adresa");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("Tip Solicitant");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText("Tip sol");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("Irigatii");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setText("Clasificare");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setText("Tip cultura");

        butonAfisareTerenAgricol.setText("Afisare");
        butonAfisareTerenAgricol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareTerenAgricolActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("la");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("la");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(localitateAg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adresaAg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judetAg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ceaMaiMicaSuprafataAg))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(celMaiMicPretAg, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(celMaiMarePretAg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ceaMaiMareSuprafataAg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butonAfisareTerenAgricol, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tipSol, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(irigatii, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tipSolicitant, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clasificareAg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipCultura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celMaiMicPretAg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipCultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celMaiMarePretAg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipSolicitant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(ceaMaiMareSuprafataAg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ceaMaiMicaSuprafataAg, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(localitateAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judetAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(irigatii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adresaAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(clasificareAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(butonAfisareTerenAgricol, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Teren Agricol", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonAfisareTerenConstructiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareTerenConstructiiActionPerformed
        //SELECTAM OBIECTELE CARE INDEPLINESC CONDITIILE IMPUSE

        // Obțineți valorile introduse în JTextField-uri
        long pretMinim=0;
        String textCelMaiMicPret = celMaiMicPret.getText();
        if("".equals(textCelMaiMicPret))
        pretMinim = 0;
        else
        if(!"".equals(textCelMaiMicPret))
        pretMinim = Long.parseLong(textCelMaiMicPret);

        long pretMaxim=0;
        String textCelMaiMarePret = celMaiMarePret.getText();
        if("".equals(textCelMaiMarePret))
        pretMaxim = Long.MAX_VALUE;
        else
        if(!"".equals(textCelMaiMarePret))
        pretMaxim = Long.parseLong(textCelMaiMarePret);

        long supMinim=0;
        String textCeaMaiMicaSuprafata = ceaMaiMicaSuprafata.getText();
        if("".equals(textCeaMaiMicaSuprafata))
        supMinim = 0;
        else
        if(!"".equals(textCeaMaiMicaSuprafata))
        supMinim = Long.parseLong(textCeaMaiMicaSuprafata);

        long supMaxim=0;
        String textCeaMaiMareSuprafata = ceaMaiMareSuprafata.getText();
        if("".equals(textCeaMaiMareSuprafata))
        supMaxim = Long.MAX_VALUE ;
        else
        if(!"".equals(textCeaMaiMareSuprafata))
        supMaxim = Long.parseLong(textCeaMaiMareSuprafata);

       String locCautata="";
        if(!"".equals(localitate.getText()))
        locCautata=localitate.getText();

        String judCautat="";
        if(!"".equals(judet.getText()))
        judCautat=judet.getText();

        String adresaCautata="";
        if(!"".equals(adresa.getText()))
        adresaCautata=adresa.getText();

        
        String scopCons="";
        if(!"".equals(scop.getText()))
        scopCons=scop.getText();
        
        int frontCons = 0;
        String textFront = frontStradal.getText();
        if(!"".equals(textFront))
        frontCons=Integer.parseInt(textFront);
        
        boolean apaCons = false ; String apaCons1="ok";
        String textApa=areApa.getText();
        if("da".equals(textApa))
            apaCons=true;
        else
            if("nu".equals(textApa))
                apaCons=false;
        else 
            if("".equals(textApa))
                apaCons1="";
        
        
        boolean curentCons = false ; 
        String textCurent=areCurent.getText();String curentCons1="ok";
        if("da".equals(textCurent))
            curentCons=true;
        else
            if("nu".equals(textCurent))
                curentCons=false;
        else 
            if("".equals(textCurent))
                curentCons1="";
        
        
        
        String clasificareCons = "";
        if(!"".equals(clasificare.getText()))
        clasificareCons=clasificare.getText();

        TerenConstructii[] terenuriSelectate = new TerenConstructii[vtc.length];
        int i = 0;

        // Iterează prin vectorul vtc și adaugă terenurile care îndeplinesc condițiile în vector
        for (TerenConstructii teren : vtc) {
            if (verificaConditiile(teren, pretMinim, pretMaxim, supMinim, supMaxim , locCautata, adresaCautata, judCautat,scopCons,frontCons,apaCons,apaCons1,curentCons,curentCons1,clasificareCons)) {
                terenuriSelectate[i++] = teren;
            }
        }

        // Creează un nou vector de dimensiunea exactă a elementelor selectate
        TerenConstructii[] terenuriFiltrate = new TerenConstructii[i];
        System.arraycopy(terenuriSelectate, 0, terenuriFiltrate, 0, i);

        // DESCHIDE A DOUA FEREASTRA GUI

        ProGui2 f2=new ProGui2(terenuriSelectate);
        f2.setVisible(true);
        f2.setTitle("Fereastra cu lista de imobile selectate");

    }//GEN-LAST:event_butonAfisareTerenConstructiiActionPerformed

    private void butonAfisareApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareApActionPerformed
        // TODO add your handling code here:

        /*int numarCamere = Integer.parseInt(textCamera.getText());
        int numarBai = Integer.parseInt(textBai.getText());
        int anConstructie = Integer.parseInt(textAn.getText());
        String locAp = String.valueOf(localitate1.getText());
        String locJu = String.valueOf(judet1.getText());*/
        
        int numarCamere=0;
        String textNumarCamere=textCamera.getText();
        if(!"".equals(textNumarCamere))
            numarCamere=Integer.parseInt(textNumarCamere);
        
        int numarBai=0;
        String textNumarBai=textBai.getText();
        if(!"".equals(textNumarBai))
            numarBai=Integer.parseInt(textNumarBai);
        
        int anConstructie=0;
        String textAn1=textAn.getText();
        if(!"".equals(textAn1))
            anConstructie=Integer.parseInt(textAn1);
        
        String locAp="";
        if(!"".equals(localitate1.getText()))
            locAp=localitate1.getText();
        
        
        String locJu="";
        if(!"".equals(judet1.getText()))
            locJu=judet1.getText();
        
        

    // Creăm un nou vector de Apartament care să rețină apartamentele care îndeplinesc criteriile
    Apartament[] apartamenteSelectate = new Apartament[vectorApartamente.length];
    int index = 0;

    // Iterăm prin vectorul de apartamente și adăugăm apartamentele care îndeplinesc criteriile în noul vector
    for (Apartament apartament : vectorApartamente) {
        if (verificaConditiileApartament(apartament, numarCamere, numarBai, anConstructie,locAp,locJu)) {
            apartamenteSelectate[index++] = apartament;
        }
    }

    // Creăm un nou vector cu dimensiunea exactă a apartamentelor selectate
    Apartament[] apartamenteFiltrate = new Apartament[index];
    System.arraycopy(apartamenteSelectate, 0, apartamenteFiltrate, 0, index);

    // Deschidem o nouă fereastră GUI pentru afișarea apartamentelor selectate
    ProGuiAp fereastraApartamente = new ProGuiAp(apartamenteFiltrate);
    fereastraApartamente.setVisible(true);
    fereastraApartamente.setTitle("Lista apartamentelor conform criteriilor");
    dispose();
    }//GEN-LAST:event_butonAfisareApActionPerformed

    private void butonAfisareTerenAgricolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareTerenAgricolActionPerformed
        // TODO add your handling code here:
         long pretMinim=0;
        String textCelMaiMicPretAg = celMaiMicPretAg.getText();
        if("".equals(textCelMaiMicPretAg))
        pretMinim = 0;
        else
        if(!"".equals(textCelMaiMicPretAg))
        pretMinim = Long.parseLong(textCelMaiMicPretAg);

        long pretMaxim=0;
        String textCelMaiMarePretAg = celMaiMarePretAg.getText();
        if("".equals(textCelMaiMarePretAg))
        pretMaxim = Long.MAX_VALUE;
        else
        if(!"".equals(textCelMaiMarePretAg))
        pretMaxim = Long.parseLong(textCelMaiMarePretAg);

        long supMinim=0;
        String textCeaMaiMicaSuprafataAg = ceaMaiMicaSuprafataAg.getText();
        if("".equals(textCeaMaiMicaSuprafataAg))
        supMinim = 0;
        else
        if(!"".equals(textCeaMaiMicaSuprafataAg))
        supMinim = Long.parseLong(textCeaMaiMicaSuprafataAg);

        long supMaxim=0;
        String textCeaMaiMareSuprafata = ceaMaiMareSuprafataAg.getText();
        if("".equals(textCeaMaiMareSuprafata))
        supMaxim = Long.MAX_VALUE ;
        else
        if(!"".equals(textCeaMaiMareSuprafata))
        supMaxim = Long.parseLong(textCeaMaiMareSuprafata);

        String locCautata="";
        if(!"".equals(localitateAg.getText()))
        locCautata=localitateAg.getText();

        String judCautat="";
        if(!"".equals(judetAg.getText()))
        judCautat=judet.getText();

        String adresaCautata="";
        if(!"".equals(adresaAg.getText()))
            adresaCautata=adresa.getText();
        
        
        String tipCulturaCautat="";
        if(!"".equals(tipCultura.getText()))
            tipCulturaCautat=tipCultura.getText();
        
        String tipSolicitantCautat="";
        if(!"".equals(tipSolicitant.getText()))
            tipSolicitantCautat=tipSolicitant.getText();
        
        String tipSolCautat="";
        if(!"".equals(tipSol.getText()))
            tipSolCautat=tipSol.getText();
        
        boolean irigatiiCautat = false ; 
        String textIrigatii=irigatii.getText();String irigatiiCautat1="ok";
        if("da".equals(textIrigatii))
            irigatiiCautat=true;
        else
            if("nu".equals(textIrigatii))
                irigatiiCautat=false;
        else 
            if("".equals(textIrigatii))
                irigatiiCautat1="";
        
        String clasificareAgCautat="";
        if(!"".equals(clasificareAg.getText()))
            clasificareAgCautat=clasificareAg.getText();
        

        TerenAgricol[] terenuriAgSelectate = new TerenAgricol[vta.length];
        int i = 0;

        // Iterează prin vectorul vtc și adaugă terenurile care îndeplinesc condițiile în vector
        for (TerenAgricol tc : vta) {
            if (verificaConditiileAg(tc, pretMinim, pretMaxim, supMinim, supMaxim , locCautata, adresaCautata, judCautat, tipCulturaCautat, tipSolicitantCautat, tipSolCautat, irigatiiCautat,irigatiiCautat1, clasificareAgCautat)) {
                terenuriAgSelectate[i++] = tc;
            }
        }

        // Creează un nou vector de dimensiunea exactă a elementelor selectate
        TerenAgricol[] terenuriAgFiltrate = new TerenAgricol[i];
        System.arraycopy(terenuriAgSelectate, 0, terenuriAgFiltrate, 0, i);

        // DESCHIDE A DOUA FEREASTRA GUI

        ProGuiTerenAgricol f3=new ProGuiTerenAgricol(terenuriAgSelectate);
        f3.setVisible(true);
        f3.setTitle("Fereastra cu lista de imobile selectate");
    
    }//GEN-LAST:event_butonAfisareTerenAgricolActionPerformed

    private void butonAfisarePeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisarePeActionPerformed
        // TODO add your handling code here:
        
        String centralaPent1="ok";
        String terasaPent1="ok";
        
        long pretPent=0;
        String textPretPe=pretPe.getText();
        if(!"".equals(textPretPe))
            pretPent=Long.parseLong(textPretPe);
        
        String nivelLux1="";
        if(!"".equals(nivelLux.getText()))
            nivelLux1=nivelLux.getText();
        
        int etajPent=0;
        String textEtajPent=etajPe.getText();
        if(!"".equals(textEtajPent))
            etajPent=Integer.parseInt(textEtajPent);
        
        boolean centralaPent=false;
        String textCentrala=centralaPe.getText();
        if("da".equals(textCentrala))
            centralaPent=true;
        else
            if("nu".equals(textCentrala))
                centralaPent=false;
        else
            if("".equals(textCentrala))
                centralaPent1="";
        
        boolean terasaPent=false;
        String textTerasa=terasaPe.getText();
        if("da".equals(textTerasa))
            terasaPent=true;
        else
            if("nu".equals(textTerasa))
                terasaPent=false;
        else
            if("".equals(textTerasa))
                terasaPent1="";
        
        Penthouse[] penthouseSelectate = new Penthouse[vectorPenthouse.length];
        int j=0;
        
        for(Penthouse penthouse : vectorPenthouse){
            if(verificaConditiilePenthouse(penthouse, pretPent, nivelLux1, etajPent, centralaPent, terasaPent, centralaPent1, terasaPent1))
                penthouseSelectate[j++]=penthouse;
        }
        
        
           // Creează un nou vector de dimensiunea exactă a elementelor selectate
        Penthouse[] penthouseFiltrate = new Penthouse[j];
        System.arraycopy(penthouseSelectate, 0, penthouseFiltrate, 0, j);
        
        ProGuiPenthouse f4=new ProGuiPenthouse(penthouseSelectate);
        f4.setVisible(true);
        f4.setTitle("Fereastra cu lista de imobile selectate");
        
    }//GEN-LAST:event_butonAfisarePeActionPerformed

    private void butonAfisareCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareCaseActionPerformed
        long pretMinimCase=0;
        String textCelMaiMicPretCase = celMaiMicPretCase.getText();
        if("".equals(textCelMaiMicPretCase))
        pretMinimCase = 0;
        else
        if(!"".equals(textCelMaiMicPretCase))
        pretMinimCase = Long.parseLong(textCelMaiMicPretCase);

        long pretMaximCase=0;
        String textCelMaiMarePretCase = celMaiMarePretCase.getText();
        if("".equals(textCelMaiMarePretCase))
        pretMaximCase = Long.MAX_VALUE;
        else
        if(!"".equals(textCelMaiMarePretCase))
        pretMaximCase = Long.parseLong(textCelMaiMarePretCase);

        long supMinimCase=0;
        String textCeaMaiMicaSuprafataCase = ceaMaiMicaSuprafataCase.getText();
        if("".equals(textCeaMaiMicaSuprafataCase))
        supMinimCase = 0;
        else
        if(!"".equals(textCeaMaiMicaSuprafataCase))
        supMinimCase = Long.parseLong(textCeaMaiMicaSuprafataCase);

        long supMaximCase=0;
        String textCeaMaiMareSuprafataCase = ceaMaiMareSuprafataCase.getText();
        if("".equals(textCeaMaiMareSuprafataCase))
        supMaximCase = Long.MAX_VALUE ;
        else
        if(!"".equals(textCeaMaiMareSuprafataCase))
        supMaximCase = Long.parseLong(textCeaMaiMareSuprafataCase);

        String locCautataCase="";
        if(!"".equals(localitateCase.getText()))
        locCautataCase=localitateCase.getText();

        String judCautatCase="";
        if(!"".equals(judetCase.getText()))
        judCautatCase=judetCase.getText();

        String adresaCautataCase="";
        if(!"".equals(adresaCase.getText()))
            adresaCautataCase=adresaCase.getText();
        
        boolean apaCaseCautat = false ; String apaCase1="ok";
        String textApa=apaCase.getText();
        if("da".equals(textApa))
            apaCaseCautat=true;
        else
            if("nu".equals(textApa))
                apaCaseCautat=false;
        else 
            if("".equals(textApa))
                apaCase1="";
        
        boolean curentCaseCautat = false ; String curentCase1="ok";
        String textCurent=curentCase.getText();
        if("da".equals(textCurent))
            curentCaseCautat=true;
        else
            if("nu".equals(textCurent))
                curentCaseCautat=false;
        else 
            if("".equals(textCurent))
                curentCase1="";
        
        boolean gazCaseCautat = false ; String gazCase1="ok";
        String textGaz=gazCase.getText();
        if("da".equals(textGaz))
            gazCaseCautat=true;
        else
            if("nu".equals(textGaz))
                gazCaseCautat=false;
        else 
            if("".equals(textGaz))
                gazCase1="";
        
        boolean mobilareCaseCautat = false ; String mobilareCase1="ok";
        String textMobilare=mobilareCase.getText();
        if("da".equals(textMobilare))
            mobilareCaseCautat=true;
        else
            if("nu".equals(textGaz))
                mobilareCaseCautat=false;
        else 
            if("".equals(textGaz))
                mobilareCase1="";
        
        boolean izolatieTermicaCaseCautat = false ; String izolatieTermicaCase1="ok";
        String textIzolatieTermica=izolatieTermicaCase.getText();
        if("da".equals(textIzolatieTermica))
            izolatieTermicaCaseCautat=true;
        else
            if("nu".equals(textIzolatieTermica))
                izolatieTermicaCaseCautat=false;
        else 
            if("".equals(textIzolatieTermica))
                izolatieTermicaCase1="";
        
        String structuraRezistentaCautataCase="";
        if(!"".equals(structuraRezistentaCase.getText()))
        structuraRezistentaCautataCase=structuraRezistentaCase.getText();
        
     
        
        
        Case[] caseSelectate = new Case[vectorCase.length];
        int i = 0;

        // Iterează prin vectorul vtc și adaugă terenurile care îndeplinesc condițiile în vector
        for (Case c : vectorCase) {
            if (verificaConditiileCase(c, pretMinimCase, pretMaximCase, supMinimCase, supMaximCase , locCautataCase, adresaCautataCase, judCautatCase, apaCaseCautat, apaCase1, curentCaseCautat, curentCase1, gazCaseCautat, gazCase1,mobilareCaseCautat, mobilareCase1, izolatieTermicaCaseCautat ,izolatieTermicaCase1,structuraRezistentaCautataCase)) {
                caseSelectate[i++] = c;
            }
        }

        // Creează un nou vector de dimensiunea exactă a elementelor selectate
        Case[] caseFiltrate = new Case[i];
        System.arraycopy(caseSelectate, 0, caseFiltrate, 0, i);

        // DESCHIDE A DOUA FEREASTRA GUI

        ProGuiCase c1=new ProGuiCase(caseSelectate);
        c1.setVisible(true);
        c1.setTitle("Fereastra cu lista de imobile selectate");
        
        
    }//GEN-LAST:event_butonAfisareCaseActionPerformed

    private void mobilareCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilareCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilareCaseActionPerformed

    private void apaCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apaCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apaCaseActionPerformed

    private void butonAfisareCaseDuplex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareCaseDuplex1ActionPerformed
        long pretMinimCaseDuplex=0;
        String textCelMaiMicPretCaseDuplex = celMaiMicPretCaseDuplex.getText();
        if("".equals(textCelMaiMicPretCaseDuplex))
        pretMinimCaseDuplex = 0;
        else
        if(!"".equals(textCelMaiMicPretCaseDuplex))
        pretMinimCaseDuplex = Long.parseLong(textCelMaiMicPretCaseDuplex);

        long pretMaximCaseDuplex=0;
        String textCelMaiMarePretCaseDuplex = celMaiMarePretCaseDuplex.getText();
        if("".equals(textCelMaiMarePretCaseDuplex))
        pretMaximCaseDuplex = Long.MAX_VALUE;
        else
        if(!"".equals(textCelMaiMarePretCaseDuplex))
        pretMaximCaseDuplex = Long.parseLong(textCelMaiMarePretCaseDuplex);

        long supMinimCaseDuplex=0;
        String textCeaMaiMicaSuprafataCaseDuplex = ceaMaiMicaSuprafataCaseDuplex.getText();
        if("".equals(textCeaMaiMicaSuprafataCaseDuplex))
        supMinimCaseDuplex = 0;
        else
        if(!"".equals(textCeaMaiMicaSuprafataCaseDuplex))
        supMinimCaseDuplex = Long.parseLong(textCeaMaiMicaSuprafataCaseDuplex);

        long supMaximCaseDuplex=0;
        String textCeaMaiMareSuprafataCaseDuplex = ceaMaiMareSuprafataCaseDuplex.getText();
        if("".equals(textCeaMaiMareSuprafataCaseDuplex))
        supMaximCaseDuplex = Long.MAX_VALUE ;
        else
        if(!"".equals(textCeaMaiMareSuprafataCaseDuplex))
        supMaximCaseDuplex = Long.parseLong(textCeaMaiMareSuprafataCaseDuplex);

        String locCautataCaseDuplex="";
        if(!"".equals(localitateCaseDuplex.getText()))
        locCautataCaseDuplex=localitateCaseDuplex.getText();

        String judCautatCaseDuplex="";
        if(!"".equals(judetCaseDuplex.getText()))
        judCautatCaseDuplex=judetCaseDuplex.getText();

        String adresaCautataCaseDuplex="";
        if(!"".equals(adresaCaseDuplex.getText()))
            adresaCautataCaseDuplex=adresaCaseDuplex.getText();
       
        
        boolean mobilareCaseDuplexCautat = false ; String mobilareCaseDuplex1="ok";
        String textMobilare=mobilareCaseDuplex.getText();
        if("da".equals(textMobilare))
            mobilareCaseDuplexCautat=true;
        else
            if("nu".equals(textMobilare))
                mobilareCaseDuplexCautat=false;
        else 
            if("".equals(textMobilare))
                mobilareCaseDuplex1="";
        
        boolean esteImpartitaCaseDuplexCautat = false ; String esteImpartitaCaseDuplex1="ok";
        String textEsteImpartita=esteImpartitaCaseDuplex.getText();
        if("da".equals(textEsteImpartita))
            esteImpartitaCaseDuplexCautat=true;
        else
            if("nu".equals(textEsteImpartita))
                esteImpartitaCaseDuplexCautat=false;
        else 
            if("".equals(textEsteImpartita))
                esteImpartitaCaseDuplex1="";
        
     
        
        
        CaseDuplex[] caseDuplexSelectate = new CaseDuplex[vectorCaseDuplex.length];
        int i = 0;

        // Iterează prin vectorul vtc și adaugă terenurile care îndeplinesc condițiile în vector
        for (CaseDuplex cd : vectorCaseDuplex) {
            if (verificaConditiileCaseDuplex(cd, pretMinimCaseDuplex, pretMaximCaseDuplex, supMinimCaseDuplex, supMaximCaseDuplex , locCautataCaseDuplex, adresaCautataCaseDuplex, judCautatCaseDuplex,mobilareCaseDuplexCautat, mobilareCaseDuplex1,esteImpartitaCaseDuplexCautat,esteImpartitaCaseDuplex1)) {
                caseDuplexSelectate[i++] = cd;
            }
        }

        // Creează un nou vector de dimensiunea exactă a elementelor selectate
        CaseDuplex[] caseDuplexFiltrate = new CaseDuplex[i];
        System.arraycopy(caseDuplexSelectate, 0, caseDuplexFiltrate, 0, i);

        // DESCHIDE A DOUA FEREASTRA GUI

        ProGuiCaseDuplex cd1=new ProGuiCaseDuplex(caseDuplexSelectate);
        cd1.setVisible(true);
        cd1.setTitle("Fereastra cu lista de imobile selectate");
    }//GEN-LAST:event_butonAfisareCaseDuplex1ActionPerformed

    private void mobilareCaseDuplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilareCaseDuplexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilareCaseDuplexActionPerformed

    private void esteImpartitaCaseDuplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esteImpartitaCaseDuplexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esteImpartitaCaseDuplexActionPerformed

    private boolean verificaConditiileApartament(Apartament apartament, int numarCamere, int numarBai, int anConstructie, String locAp, String judAp) {
    // Verificăm criteriile pentru apartament
    int nrC=apartament.getNrCamere();
    int nrB=apartament.getNrBai();
    int anC=apartament.getAnConstructie();
    String localitateA=apartament.getLocalitate();
    String judetA=apartament.getJudet();
    
    boolean conditiiCamere= numarCamere == 0 || nrC == numarCamere;
    boolean conditiiBai= numarBai == 0 || nrB == numarBai;
    boolean conditiiAn= anConstructie == 0 || anC == anConstructie;
    boolean conditiiLocalitate= locAp.isEmpty() || localitateA.equals(locAp);
    boolean conditiiJudet= judAp.isEmpty() || judetA.equals(judAp);
    
    return conditiiCamere && conditiiBai && conditiiAn && conditiiLocalitate && conditiiJudet;
            
}
    
    private boolean verificaConditiile(TerenConstructii teren, long pretMinim, long pretMaxim,long supMinim, long supMaxim, String locCautata, String adresaCautata, String judCautat, String scopCons, int frontCons, boolean apaCons,String apaCons1, boolean curentCons,String curentCons1, String clasificareCons) {
    
    // Condiții
    long pretTeren = teren.getPretVanzare();
    long suprafTeren = teren.getSuprafata();
    String loc = teren.getLocalitate();
    String adr = teren.getAdresa();
    String jud = teren.getJudet();
    String sc = teren.getScop();
    int fr = teren.getFrontStradal();
    boolean apa = teren.getAreApa();
    
    boolean curent = teren.getAreCurent();
    
    String cls = teren.getClasificare();
    
    
    boolean conditiiPret = pretTeren >= pretMinim && pretTeren <= pretMaxim;
    boolean conditiiSuprafata = suprafTeren >= supMinim && suprafTeren <= supMaxim;
    boolean conditiiLoc = locCautata.isEmpty() || loc.equals(locCautata);
    boolean conditiiAdresa = adresaCautata.isEmpty() || adr.equals(adresaCautata);
    boolean conditiiJudet = judCautat.isEmpty() || jud.equals(judCautat);
    boolean conditiiScop = scopCons.isEmpty() || sc.equals(scopCons);
    boolean conditiiFrontStradal = frontCons == 0 || fr == frontCons;
    
    boolean conditiiApa = "".equals(apaCons1) ||apaCons == apa ;

    
    boolean conditiiCurent = "".equals(curentCons1) || curentCons ==curent ;

    boolean conditiiClasificare = clasificareCons.isEmpty() || cls.equals(clasificareCons);
    
    // Returnează rezultatul final
    return conditiiPret && conditiiSuprafata && conditiiLoc && conditiiAdresa && conditiiJudet && conditiiScop && conditiiFrontStradal && conditiiApa && conditiiCurent && conditiiClasificare;
    
}
    
    private boolean verificaConditiileAg(TerenAgricol tc, long pretMinim, long pretMaxim,long supMinim, long supMaxim, String locCautata, String adresaCautata, String judCautat, String tipCulturaCautat, String tipSolicitantCautat, String tipSolCautat, boolean irigatiiCautat,String irigatiiCautat1, String clasificareAgCautat) {
    
    // Condiții
    long pretTeren = tc.getPretVanzare();
    long suprafTeren = tc.getSuprafata();
    String loc = tc.getLocalitate();
    String adr = tc.getAdresa();
    String jud = tc.getJudet();
    
    String cult=tc.getTipCultura();
    String solicitant=tc.getTipSolicitant();
    String sol=tc.getTipSol();
    boolean irig=tc.getIrigatii();
    String clasAg=tc.getClasificare();
    
    
    boolean conditiiPret = pretTeren >= pretMinim && pretTeren <= pretMaxim;
    boolean conditiiSuprafata = suprafTeren >= supMinim && suprafTeren <= supMaxim;
    boolean conditiiLoc = locCautata.isEmpty() || loc.equals(locCautata);
    boolean conditiiAdresa = adresaCautata.isEmpty() || adr.equals(adresaCautata);
    boolean conditiiJudet = judCautat.isEmpty() || jud.equals(judCautat);

    boolean conditiiCultura=tipCulturaCautat.isEmpty() || cult.equals(tipCulturaCautat);
    boolean conditiiSolicitant=tipSolicitantCautat.isEmpty() || solicitant.equals(tipSolicitantCautat);
    boolean conditiiSol=tipSolCautat.isEmpty() || sol.equals(tipSolCautat);
    
    boolean conditiiIrigatii= "".equals(irigatiiCautat1) || irigatiiCautat ==irig;
    
    
    boolean conditiiClasificareAg=clasificareAgCautat.isEmpty() || clasAg.equals(clasificareAgCautat);
    // Returnează rezultatul final
    return conditiiPret && conditiiSuprafata && conditiiLoc && conditiiAdresa && conditiiJudet&& conditiiCultura && conditiiSolicitant && conditiiSol && conditiiIrigatii && conditiiClasificareAg;
    
}
    
    private boolean verificaConditiilePenthouse(Penthouse pt, long pret, String lux, int etaj, boolean centrala, boolean terasa, String cuvCentrala, String cuvTerasa)
    {
        long pretPent=pt.getPretVanzare();
        String luxPent=pt.getLux();
        int etajPent=pt.getEtaj();
        boolean centralaPent=pt.getCentrala();
        boolean terasaPent=pt.getTerasa();
    
        boolean conditiiPretPt= pret == 0 || pretPent == pret;
        boolean conditiiLux= lux.isEmpty() || luxPent.equals(lux);
        boolean conditiiEtaj= etaj == 0 || etajPent == etaj;
        boolean conditiiCentrala= "".equals(cuvCentrala) || centrala ==centralaPent;
        boolean conditiiTerasa= "".equals(cuvTerasa) || terasa ==terasaPent;
        
        
        
        return conditiiPretPt && conditiiLux && conditiiEtaj && conditiiCentrala && conditiiTerasa;
    }
    
    
    private boolean verificaConditiileCase(Case c, long pretMinimCase, long pretMaximCase,long supMinimCase, long supMaximCase, String locCautataCase, String adresaCautataCase, String judCautatCase, boolean apaCaseCautat, String apaCase1 ,boolean curentCaseCautat, String curentCase1,boolean gazCaseCautat, String gazCase1, boolean mobilareCaseCautat, String mobilareCase1,boolean izolatieTermicaCaseCautat, String izolatieTermicaCase1, String structuraRezistentaCautataCase) {
    
    // Condiții
    long pretCasa = c.getPretVanzare();
    long suprafCasa = c.getSuprafata();
    String loc = c.getLocalitate();
    String adr = c.getAdresa();
    String jud = c.getJudet();
    boolean apa = c.isApa();
    boolean curent = c.isCurent();
    boolean gaz = c.isGaz();
    boolean mobilare = c.isMobilare();
    boolean izolatieTermica = c.isIzolatieTermica();
    String structuraRezistenta = c.getStructuraRezistenta();
    
    boolean conditiiPret = pretCasa >= pretMinimCase && pretCasa <= pretMaximCase;
    boolean conditiiSuprafata = suprafCasa >= supMinimCase && suprafCasa <= supMaximCase;
    boolean conditiiLoc = locCautataCase.isEmpty() || loc.equals(locCautataCase);
    boolean conditiiAdresa = adresaCautataCase.isEmpty() || adr.equals(adresaCautataCase);
    boolean conditiiJudet = judCautatCase.isEmpty() || jud.equals(judCautatCase);
    boolean conditiiApa = "".equals(apaCase1) || apaCaseCautat ==apa;
    boolean conditiiCurent = "".equals(curentCase1) || curentCaseCautat ==curent;
    boolean conditiiGaz = "".equals(gazCase1) || gazCaseCautat ==gaz;
    boolean conditiiMobilare = "".equals(mobilareCase1) || mobilareCaseCautat ==mobilare;
    boolean conditiiIzolatieTermica = "".equals(izolatieTermicaCase1) || izolatieTermicaCaseCautat ==izolatieTermica;
    boolean conditiiStructuraRezistenta = structuraRezistentaCautataCase.isEmpty() || structuraRezistenta.equals(structuraRezistentaCautataCase);


    // Returnează rezultatul final
    return conditiiPret && conditiiSuprafata && conditiiLoc && conditiiAdresa && conditiiJudet && conditiiApa && conditiiCurent && conditiiGaz && conditiiMobilare && conditiiIzolatieTermica && conditiiStructuraRezistenta;
    
}
    private boolean verificaConditiileCaseDuplex(CaseDuplex cd, long pretMinimCaseDuplex, long pretMaximCaseDuplex,long supMinimCaseDuplex, long supMaximCaseDuplex, String locCautataCaseDuplex, String adresaCautataCaseDuplex, String judCautatCaseDuplex, boolean mobilareCaseDuplexCautat, String mobilareCaseDuplex1, boolean esteImpartitaCaseDuplexCautat, String esteImpartitaCaseDuplex1) {
    
    // Condiții
    long pretCaseDuplex = cd.getPretVanzare();
    long suprafCaseDuplex = cd.getSuprafata();
    String loc = cd.getLocalitate();
    String adr = cd.getAdresa();
    String jud = cd.getJudet();
    boolean mobilare = cd.isMobilare();
    boolean impartire = cd.isEsteImpartitaInDoua();
    
    boolean conditiiPret = pretCaseDuplex >= pretMinimCaseDuplex && pretCaseDuplex <= pretMaximCaseDuplex;
    boolean conditiiSuprafata = suprafCaseDuplex >= supMinimCaseDuplex && suprafCaseDuplex <= supMaximCaseDuplex;
    boolean conditiiLoc = locCautataCaseDuplex.isEmpty() || loc.equals(locCautataCaseDuplex);
    boolean conditiiAdresa = adresaCautataCaseDuplex.isEmpty() || adr.equals(adresaCautataCaseDuplex);
    boolean conditiiJudet = judCautatCaseDuplex.isEmpty() || jud.equals(judCautatCaseDuplex);
    boolean conditiiMobilare = "".equals(mobilareCaseDuplex1) || mobilareCaseDuplexCautat ==mobilare;
    boolean conditiiImpartire = "".equals(esteImpartitaCaseDuplex1) || esteImpartitaCaseDuplexCautat ==impartire;


    // Returnează rezultatul final
    return conditiiPret && conditiiSuprafata && conditiiLoc && conditiiAdresa && conditiiJudet &&  conditiiMobilare && conditiiImpartire;
    
}
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProGui().setVisible(true);
            }
        });
        
     
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresa;
    private javax.swing.JTextField adresaAg;
    private javax.swing.JTextField adresaCase;
    private javax.swing.JTextField adresaCaseDuplex;
    private javax.swing.JLabel anConstr;
    private javax.swing.JLabel anConstr1;
    private javax.swing.JLabel anConstr2;
    private javax.swing.JTextField apaCase;
    private javax.swing.JTextField areApa;
    private javax.swing.JTextField areCurent;
    private javax.swing.JLabel baie;
    private javax.swing.JButton butonAfisareAp;
    private javax.swing.JButton butonAfisareCase;
    private javax.swing.JButton butonAfisareCaseDuplex1;
    private javax.swing.JButton butonAfisarePe;
    private javax.swing.JButton butonAfisareTerenAgricol;
    private javax.swing.JButton butonAfisareTerenConstructii;
    private javax.swing.JLabel camera;
    private javax.swing.JTextField ceaMaiMareSuprafata;
    private javax.swing.JTextField ceaMaiMareSuprafataAg;
    private javax.swing.JTextField ceaMaiMareSuprafataCase;
    private javax.swing.JTextField ceaMaiMareSuprafataCaseDuplex;
    private javax.swing.JTextField ceaMaiMicaSuprafata;
    private javax.swing.JTextField ceaMaiMicaSuprafataAg;
    private javax.swing.JTextField ceaMaiMicaSuprafataCase;
    private javax.swing.JTextField ceaMaiMicaSuprafataCaseDuplex;
    private javax.swing.JTextField celMaiMarePret;
    private javax.swing.JTextField celMaiMarePretAg;
    private javax.swing.JTextField celMaiMarePretCase;
    private javax.swing.JTextField celMaiMarePretCaseDuplex;
    private javax.swing.JTextField celMaiMicPret;
    private javax.swing.JTextField celMaiMicPretAg;
    private javax.swing.JTextField celMaiMicPretCase;
    private javax.swing.JTextField celMaiMicPretCaseDuplex;
    private javax.swing.JTextField centralaPe;
    private javax.swing.JTextField clasificare;
    private javax.swing.JTextField clasificareAg;
    private javax.swing.JTextField curentCase;
    private javax.swing.JTextField esteImpartitaCaseDuplex;
    private javax.swing.JTextField etajPe;
    private javax.swing.JTextField frontStradal;
    private javax.swing.JTextField gazCase;
    private javax.swing.JTextField irigatii;
    private javax.swing.JTextField izolatieTermicaCase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField judet;
    private javax.swing.JTextField judet1;
    private javax.swing.JTextField judetAg;
    private javax.swing.JTextField judetCase;
    private javax.swing.JTextField judetCaseDuplex;
    private javax.swing.JTextField localitate;
    private javax.swing.JTextField localitate1;
    private javax.swing.JTextField localitateAg;
    private javax.swing.JTextField localitateCase;
    private javax.swing.JTextField localitateCaseDuplex;
    private javax.swing.JTextField mobilareCase;
    private javax.swing.JTextField mobilareCaseDuplex;
    private javax.swing.JTextField nivelLux;
    private javax.swing.JTextField pretPe;
    private javax.swing.JTextField scop;
    private javax.swing.JTextField structuraRezistentaCase;
    private javax.swing.JTextField terasaPe;
    private javax.swing.JTextField textAn;
    private javax.swing.JTextField textBai;
    private javax.swing.JTextField textCamera;
    private javax.swing.JTextField tipCultura;
    private javax.swing.JTextField tipSol;
    private javax.swing.JTextField tipSolicitant;
    // End of variables declaration//GEN-END:variables
}
