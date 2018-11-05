package poo;
import java.util.Scanner;
public class Problema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String nExamen;
		float a,b,c;
		System.out.print("Introduceti numele examenului:");
		nExamen=in.nextLine();
		System.out.print("Introduceti nota partial:");
		a=in.nextFloat();
		System.out.print("Introduceti nota laborator:");
		b=in.nextFloat();
		System.out.print("Introduceti nota examen:");
		c=in.nextFloat();
		if(a == 0) {
			System.out.printf("Nota finala la examenul de "+nExamen+" este %,.2f%n",calculeazaNota(b,c));
		}else {
			System.out.printf("Nota finala la examenul de "+nExamen+" este %,.2f%n",calculeazaNota(a,b,c));
		}
	}
	
	public static float calculeazaNota(float a,float b,float c) {
		return a*(20f/100f)+b*(20f/100f)+c*(60f/100f);
	}
	
	public static float calculeazaNota(float a,float b) {
		return a*(30f/100f)+b*(70f/100f);
	}
	
}
