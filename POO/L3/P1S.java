package poo;

public class P1S {

	public static void main(String[] args) {
		// TODO  Auto-generated method stub
		System.out.println("Numarul cu cei mai multi divizori in intervalu [1,10000] este "+cautaNr());
	}
	
	public static int cautaNr() {
		int nr=0;
		int nrDivizori=0;
		int v[] = new int[10000];
		for(int i=0;i<10000;i++) {
			for(int j=1;j<Math.sqrt(i+1);j++) {
				if((i+1) % j == 0)
					v[i]++;
			}
			if(v[i] > nrDivizori) {
				nrDivizori=v[i];
				nr=i+1;
			}
		}
		return nr;
	}
}
