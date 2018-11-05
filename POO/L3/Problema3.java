package poo;
import java.util.Scanner;
public class Problema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1,l2;
		Scanner in = new Scanner(System.in);
		System.out.println("Intrdocuti lungimea laturii1:");
		l1= in.nextInt();
		System.out.println("Intrdocuti lungimea laturii2:");
		l2= in.nextInt();
		
		System.out.println("Aria dreptunghiului = "+ariaDreptunghi(l1,l2));
		System.out.println("Aria dreptunghiului = "+ariaDreptunghi((float)l1,(float)l2));
	}
	
	public static int ariaDreptunghi(int a,int b) {
		return a*b;
	}
	
	public static int ariaDreptunghi(float a,float b) {
		System.out.println("Metoda supra incarcata:");
		return (int) a * (int) b; 
	}

}
