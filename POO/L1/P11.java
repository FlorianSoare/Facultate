package learning;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introdu un numar intreg:");
		System.out.println(f(in.nextInt()));
	}
	
	public static String f(int x) {
		String m= Integer.toString(x), n = "";
		for(int i = m.length() -1 ;i >=0 ;i--) {
			n += m.charAt(i); 
		}
		if(x == Integer.parseInt(n))
			return "Numarul este palindrom";
		
		return "Numarul nu este palindrom";
	}

}
