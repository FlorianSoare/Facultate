package poo;

public class ContBancar {
		private long numarCont;
		private double sumaCont;
		
		ContBancar(long n, double s){
			this.numarCont=n;
			this.sumaCont=s;
		}
		
		public void adaugaSuma(double s) {
			this.sumaCont += s;
			this.afisareCont();
		}
		
		public void retrageSuma(double s) {
			if(s>this.sumaCont) {
				System.out.println("Nu poti extrage o suma mai mare din cont decat soldul curent.");
			}else {
				this.sumaCont -= s;
			}
			
			this.afisareCont();
		}
		
		private void afisareCont() {
			System.out.println("Numarul contului este " + this.numarCont + " cu soldul curent de " + this.sumaCont + " lei");
			System.out.println();
		}
		
}
