package com.mycompany.imobiliarepro;

public class TerenConstructii extends Imobiliare {
    private String scop; // Exemplu: rezidențial, comercial, industrial
    private int frontStradal ;
    private boolean areApa; // Indică dacă terenul are acces la rețeaua de apă
    private boolean areCurent; // Indică dacă terenul are acces la rețeaua de curent electric
    private String clasificare; //intravilan/extravilan
    private long taxa;
    
    
    // Constructor principal
    public TerenConstructii(long pretVanzare, long suprafata, String locatie, String destinatie, int frontStradal, boolean areApa, boolean areCurent, String clasificare) {
        super(pretVanzare, suprafata, locatie);
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
        super(a.getPretVanzare(), a.getSuprafata(), a.getLocatie());
        this.areApa=a.areApa;
        this.areCurent=a.areCurent;
        this.scop=a.scop;
        this.frontStradal=a.frontStradal;
        this.clasificare=a.clasificare;
    }
    
    
    
    public String toString() {
        return "Teren de constructii cu suprafata de: " + this.getSuprafata() + " metri patrati" +
               ", cu pretul de " + this.getPretVanzare() + " RON" + ", In locatia: " + this.getLocatie() +
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
    
}
