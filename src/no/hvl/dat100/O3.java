package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	
	
	public static void main(String[] args) {
		
		String txt1 = showInputDialog("Skriv inn n");
		
		int n = parseInt(txt1);
		long resultat = 1;
		
		while(n > 0) {
			
			resultat = resultat * n;
			n--;
		}
		
		System.out.println(resultat);
	}

}
