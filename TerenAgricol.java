package com.mycompany.imobiliarepro;



public class TerenAgricol extends Imobiliare{
    private String tipCultura; //tipul culturii, de ex:pasune, arabil, livada, pasune, faneata, helesteu
    private String tipSolicitant;//de ex:
    private String tipSol;//de ex:
    private boolean irigatii;
    private String clasificare; //intravilan/extravilan
    private long taxa;
    
    
    public TerenAgricol()
    {
    super();
    this.tipSolicitant=null;
    this.tipCultura=null;
    this.tipSol=null;
    this.irigatii=false;
    this.clasificare=null;
    }
    
    public TerenAgricol(long pretVanzare, int suprafata, String localitate, String judet, String adresa, String tipSolicitant, String tipCultura, String tipSol, boolean irigatii, String clasificare) 
    {
    super(pretVanzare,suprafata,localitate,judet,adresa);
    this.tipSolicitant = tipSolicitant;
    this.tipCultura = tipCultura;
    this.tipSol=tipSol;
    this.irigatii=irigatii;
    this.clasificare=clasificare;
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

    
    public boolean getIrigatii() {
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
    
   
    
}
