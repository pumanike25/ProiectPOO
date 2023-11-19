package DemoImobiliare;
import com.mycompany.imobiliarepro.Imobiliare;
import com.mycompany.imobiliarepro.TerenAgricol;
import com.mycompany.imobiliarepro.TerenConstructii;

public class Demo {
    public static void main (String args[]) {
         
        System.out.println("----------------TERENURI AGRICOLE---------------- ");
        
        TerenAgricol tr1,tr2,tr3;
        tr1=new TerenAgricol(50000,57500,"Galati, comuna Cavadinesti","fermier", "teren arabil","cernoziom",true,"extravilan");
        tr2=new TerenAgricol(180000,407500,"Braila, comuna Dudesti","cooperativa agricola", "teren arabil","argilos",true,"extravilan");
        tr3=new TerenAgricol(1700,7500,"Galati, Cavadinesti","companie agricola", "pasune","aluvional",true,"extravilan");
        
        
        System.out.println("PRIMUL TEREN"+"\n"+tr1); tr1.CalcPretHa(); tr1.CalcTaxa(); System.out.println("\n");
        System.out.println("AL DOILEA TEREN"+"\n"+tr2); tr2.CalcPretHa(); tr2.CalcTaxa(); System.out.println("\n");
        System.out.println("AL TREILEA TEREN"+"\n"+tr3); tr3.CalcPretHa(); tr3.CalcTaxa(); System.out.println("\n");
        
        
        System.out.println("----------------TERENURI CONSTRUCTII---------------- ");
        
        TerenConstructii tc1,tc2,tc3;
        tc1=new TerenConstructii(213000, 1000, "Micro 19", "rezidential", 16, true, true, "intravilan");
        tc2=new TerenConstructii(142313, 3000, "Tiglina", "comercial", 32, true, true, "intravilan");
        tc3=new TerenConstructii(100000, 5000, "Micro 20", "industrial", 44, true, true, "intravilan");
        
        System.out.println("PRIMUL TEREN"+"\n"+tc1); tc1.CalcPretM2(); tc1.CalcTaxa(); System.out.println("\n");
        System.out.println("AL DOILEA TEREN"+"\n"+tc2); tc2.CalcPretM2(); tc2.CalcTaxa(); System.out.println("\n");
        System.out.println("AL TREILEA TEREN"+"\n"+tc3); tc3.CalcPretM2(); tc3.CalcTaxa(); System.out.println("\n");
    }
}
