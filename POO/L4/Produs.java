package poo;

public class Produs {
		private String name;
		private double pretUnitar;
		
		Produs(String n, double p){
			this.name=n;
			this.pretUnitar = p;
		}
		
		public void afiseazaProdus() {
			System.out.println(this.name+"="+this.pretUnitar+" lei");
		}
		
		public double getPret() {
			return this.pretUnitar;
		}
		
		public void setPret(double p) {
			this.pretUnitar=p;
		}
		
		public void aplicaReducere(double r) {
			if(r>100) {
				System.out.println("Nu se poate aplica o reducere mai mare de 100%");
				return;
			}
			this.pretUnitar -= (this.pretUnitar*(r/100));
		}
}
