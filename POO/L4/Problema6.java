package poo;

public class Problema6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex n1 =  new Complex(5,6);
		Complex n2 =  new Complex(2,3);
		
		Complex scadere = Complex.scadere(n1, n2);
		Complex adunare = Complex.adunare(n1, n2);
		
		n1.afisareNr();
		n2.afisareNr();
		
		System.out.print("Adunarea:" );
		adunare.afisareNr();
		
		System.out.print("Scaderea:" );
		scadere.afisareNr();
		
	}

}
