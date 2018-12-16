package Gramatica;

import lfa.GetMachine;

public class Main {
	public static void main(String args[] ) {
		GetGramatica file = null;
		Gramatica gr =null;
		try {
			 file =  new GetGramatica("Gramatica3");
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			gr=file.constructGramatica();
			gr.print();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Gramatica gr2 =  gr.lema3();
		System.out.println();
		System.out.println("Gramatica finala");
		System.out.println();
		gr2.print();
		
	}
}
