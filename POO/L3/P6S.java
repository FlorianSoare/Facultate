package poo;

public class P6S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = {10,5,67,8,9,0,5,5,6,8,8,9,9,9,7,7,7,7,7,7,5,6,5,65,65,65,65,634,4,53,34,5,52,34,2,324,432};
		
		StatCalc calc =  new StatCalc(v);
		
		
		System.out.println("Numarul de elemente este "+calc.getCount());
		System.out.println("Suma elementelor este "+calc.getSum());
		System.out.println("Media elementelor este "+calc.getMean());
		System.out.println("Maximul dintre elemente  este "+calc.getMax());
		System.out.println("Minimul dintre elemente este "+calc.getMin());
		System.out.println("Deviatia este "+calc.getStandardDeviation());
		
	}

}
