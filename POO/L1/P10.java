package learning;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introdu un numar intreg:");
		System.out.println(f(in.nextInt()));
	}
	
	public static String f(int x) {
		int sum =0;
		for(int i = 1 ;i <= x/2 ;i++) {
			if(x % i == 0)
				sum += i;
		}
		if(sum == x)
			return "Numar perfect";
		
		return "Numarul nu este perfect";
	}

}
