package poo;

import java.util.Scanner;

public class Problema6 {

	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("a=");
		a=in.nextInt();
		System.out.print("b=");
		b=in.nextInt();
		System.out.println("Ackerman="+ ackerman(a,b));
	}
	
	public static int ackerman(int a, int b) {
		if(a==0)
			return b+1;
		else if(b==0)
			return ackerman(a-1,b);
		
		return ackerman(a-1,ackerman(a,b-1));
	}
}
