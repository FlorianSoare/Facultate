package poo;

public class Rational {
	private int numarator;
	private int numitor;
	
	public int getNumitor() {
		return this.numitor;
	}
	
	public int getNumarator() {
		return this.numarator;
	}
	Rational(int numr,int numi){
		int d = this.cmmdc(numr,numi);
		if(d != 1) {
			numr /= d;
			numi /=d;
		}
		this.numarator = numr;
		this.numitor = numi;
	}
	
	private int cmmdc(int a, int b) {
		if(b!=0) {
			return cmmdc(b,a%b);
		}
		return a;
	}
	
	public void afisareNr() {
		System.out.println(this.numarator+"/"+this.numitor);
	}
	
	public static Rational adunare(Rational a, Rational b) {
		if(a.getNumitor() != b.getNumarator()) {
			return new Rational(a.getNumarator()*b.getNumitor()+ b.getNumarator()* a.getNumitor(),a.getNumitor() * b.getNumitor());
		}
		
		return new Rational(a.getNumarator()+b.getNumarator(),a.getNumitor());
	}
	
	public static Rational scadere(Rational a, Rational b) {
		if(a.getNumitor() != b.getNumarator()) {
			return new Rational(a.getNumarator()*b.getNumitor()- b.getNumarator()* a.getNumitor(),a.getNumitor() * b.getNumitor());
		}
		
		return new Rational(a.getNumarator()-b.getNumarator(),a.getNumitor());
	}
	
	public static Rational inmultire(Rational a, Rational b) {
			return new Rational(a.getNumarator()* b.getNumarator(),a.getNumitor() * b.getNumitor());
	}
	
	public static Rational impartire(Rational a, Rational b) {
		return new Rational(a.getNumarator()* b.getNumitor(),a.getNumitor() * b.getNumarator());
	}
	
}
