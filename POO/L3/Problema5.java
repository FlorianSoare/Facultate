package poo;
import java.util.Scanner;
public class Problema5 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a=in.nextInt();
		System.out.print("b=");
		b=in.nextInt();
		System.out.println("Cmmdc="+cmmdc(a,b));
	}
	
	public static int cmmdc(int a,int b) {
		if(b!=0) {
			return cmmdc(b,a%b);
		}
		
		return a;
	}
}
