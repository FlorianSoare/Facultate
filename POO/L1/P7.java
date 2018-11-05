package learning;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=132,n=16161;
		System.out.println("A");
		a1(132,16161);
		System.out.println();
		
		
		System.out.println("B");
		a1(5,551);
		System.out.println();
	}
	
	public static void a1(int x,int n) {
		while( x>9 ) {
			x=x/10;
		}
		while( n>0 ){
			if(n%10 != x) {
				System.out.print("$$");
			}
			n=n/10;
		}
	}

}
