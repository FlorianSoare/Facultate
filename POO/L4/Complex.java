package poo;

public class Complex {
		private double pReala;
		private double pImaginara;
		
		public double getReala() {
			return this.pReala;
		}
		public double getImaginara() {
			return this.pImaginara;
		}
		Complex(){
			this(0d,0d);
		}
		
		Complex(double r,double i){
			this.pReala=r;
			this.pImaginara=i;
		}
		
		public static Complex adunare(Complex a,Complex b) {
			return new Complex(a.getReala()+b.getReala(),a.getImaginara()+b.getImaginara());
		}
		
		public static Complex scadere(Complex a,Complex b) {
			return new Complex(a.getReala()-b.getReala(),a.getImaginara()-b.getImaginara());
		}
		
		public void afisareNr() {
			System.out.println((int)this.pReala+"+"+(int)this.pImaginara+"i");
		}
}
