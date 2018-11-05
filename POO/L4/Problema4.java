package poo;

public class Problema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produs p1 = new Produs("Cicoloata",5);
		Produs p2 = new Produs("Portocala",3);
		p1.afiseazaProdus();
		p2.afiseazaProdus();
		
		p1.aplicaReducere(10);
		p2.aplicaReducere(10);
		
		p1.afiseazaProdus();
		p2.afiseazaProdus();
	}

}
