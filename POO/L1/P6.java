package learning; 

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int s = 0; 
			for (int i = 1; i <= 4; i++ ) {
				for (int j = i + 1; j <= 5; j++ ) {
					s += i * j; 
				}
			}

			System.out.println(s); 
	}

}
