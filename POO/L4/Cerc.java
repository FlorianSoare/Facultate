package poo;

public class Cerc {
	private double raza;
	
	Cerc(double r){
		this.raza = r;
	}
	
	public double getArie() {
		return Math.PI*Math.pow(this.raza, 2);
	}
	
	public double getCircumferinta() {
		return 2*Math.PI*this.raza;
	}

}
