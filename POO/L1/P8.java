package learning;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]= {810,620,332,232};
		
		for(int i=0;i < v.length;i++) {
			System.out.println(v[i] + " => " + test(v[i]));
		}
	}
	
	public static String test (int n) {
		int x=n,s=0,a=0;
		
		while(x>0) {
			s += x%10;
			x /= 10;
		}
		
		for(x=3;x<n-1;x++) {
			if((n%10 == 0) && (s%x == 0))
				a=1;
		}
		
		if(a == 1)
			return "DA";
		return "NU";
	}

}
