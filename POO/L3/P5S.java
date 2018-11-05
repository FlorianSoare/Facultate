package poo;
import java.util.Scanner;
public class P5S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BT();
	}

	public static void BT() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<21;j++) {
				if(B(i,j) || T(i,j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	public static boolean B(int i,int j) {

		if(i==0 && j<8)
			return true;
		else if(i==8 && j<8)
			return true;
		else if(i==4 && j<9)
			return true;
		else if((j==8 && i>0 && i<8) || j==0 )
			return true;

		

		return false;
	}
	
	public static boolean T(int i,int j) {
		
		if(i<2 && j > 10) 
			return true;
		else if(j>14 && j<17)
			return true;
		
		
		return false;
	}

}
