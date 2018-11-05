package learning;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introdu un numar intreg:");
		System.out.println(f(in.nextInt()));
	}
	
	public static int f(int x) {
		
		if(x <= -3) {
			return x*x +1;
		}else if(x > -3 &&  x <3) {
			return x-2;
		}else {
			return x*x - 4*x +5 ;
		}
	}

}
