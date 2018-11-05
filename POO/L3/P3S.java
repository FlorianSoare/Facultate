package poo;
import java.util.Scanner;
public class P3S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Introdu un numar:");
		int n=in.nextInt();
		afiseaza(n);
	}
	
	public static void afiseaza(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<i+1)
					System.out.print('*');
			}
			System.out.println();
		}
	}

}
