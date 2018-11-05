package poo;

public class Problema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational n1 =  new Rational(2,4);
		Rational n2= new Rational(5,25);
		n1.afisareNr();
		n2.afisareNr();
		
		Rational scadere = Rational.scadere(n1,n2);
		System.out.print("Scadere:");
		scadere.afisareNr();
		
		Rational adunare = Rational.adunare(n1,n2);
		System.out.print("Adunare:");
		adunare.afisareNr();
		
		Rational inmultire = Rational.inmultire(n1,n2);
		System.out.print("Inmultrire:");
		inmultire.afisareNr();
		
		Rational impartire = Rational.impartire(n1,n2);
		System.out.print("Impartire:");
		impartire.afisareNr();
	}

}
