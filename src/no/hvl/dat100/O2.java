package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

    public static void main(String[] args) {
        
        String brutto = showInputDialog("Skriv inn bruttoinntekt");
        
        int bruttoInntekt = parseInt(brutto);
        
       
        int trinn1 = 208050;
        int trinn2 = 292850;
        int trinn3 = 670000;
        int trinn4 = 937900;
        int trinn5 = 1350000;
        
        double skatt = 0;
        
        
        if (bruttoInntekt > trinn5) {
        	
        	skatt += (bruttoInntekt - trinn5)*0.176;
        	bruttoInntekt = trinn5;
        	
        }
        
        if(bruttoInntekt > trinn4) {
        	
        	skatt+= (bruttoInntekt - trinn4)*0.166;
        	bruttoInntekt = trinn4;
        	
        }
        
        if(bruttoInntekt > trinn3) {
        	
        	skatt += (bruttoInntekt - trinn3)*0.136;
        	bruttoInntekt = trinn3;
        	
        }
        
        if(bruttoInntekt > trinn2) {
        	
        	skatt += (bruttoInntekt - trinn2)*0.04;
        	bruttoInntekt = trinn2;
        	
        }
        
        if(bruttoInntekt > trinn1) {
        	
        	skatt += (bruttoInntekt - trinn1)*0.017;
        	bruttoInntekt = trinn1;
        }
        
        

        // Resultat
        System.out.println("Du må betale: " + (int)skatt + " kr i trinnskatt");
    }
}
