package poo;
import java.util.Scanner;
public class P4S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s;
		char m;
		System.out.print("Introduceti un sir de caractere:");
		s= in.nextLine();
		System.out.print("Introduceti un caracter:");
		m=in.next().charAt(0);
		
		System.out.println("Caracterul " + m+ " se gaseste de "+countChars(s,m) + " in sirul " + s);

	}
	
	public static int countChars(String s,char m) {
		int nr=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == m)
				nr++;
		}
		return nr;
	}

}
