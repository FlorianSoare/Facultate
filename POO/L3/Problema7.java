package poo;

import java.util.Scanner;

public class Problema7 {

	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a=in.nextInt();
		System.out.print("b=");
		b=in.nextInt();
		System.out.println("ab="+ ab(a,b));
	}
	
	public static int ab(int a, int b) {
		if(b==0)
			return 1;
		return a*ab(a,b-1);
	}
}
