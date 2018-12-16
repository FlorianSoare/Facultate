package Gramatica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import lfa.GetMachine;
import lfa.ListTransitions;
import lfa.Machine;
import lfa.Transition;

public class GetGramatica {
	private File file;
	boolean is_set;
	public GetGramatica() {
		
	}
	public GetGramatica(String fileName) throws Exception{
		String packageName = new GetGramatica().getClass().getPackage().getName();
		String path = System.getProperty("java.class.path") + "/"+packageName+"/"+fileName + ".txt";
		this.file = new File(path);
		this.is_set= file.exists();
		if(!this.is_set)
			throw new IllegalArgumentException("Fisierul specificat nu exista! \nFisierul trebuie sa se afle in directorul curent si sa fie cu extensia .txt");
		
	}
	
	public Gramatica constructGramatica() throws IOException {
		int stop=0;
		if(!this.is_set || !this.file.canRead()) {
			return new Gramatica();
		}
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String row ;
		char start_cond='#';
		HashSet <Productie> productii =  new HashSet <Productie>();
		HashSet <Character> terminale = new HashSet <Character>();
		HashSet <Character> neterminale = new HashSet <Character>();
		row = br.readLine();
		
		start_cond = row.charAt(0);

		
		//Maxim 3000 de tranzitii acceptate
		while(stop < 3001 && ((row = br.readLine())!=null)) {
			String b[] = row.split("->");
			productii.add(new Productie(b[0].charAt(0),b[1]));
			neterminale.add(b[0].charAt(0));
			
			for(int i=0;i<b[1].length();i++) {
				if(b[1].charAt(i) >= 'a' && b[1].charAt(i) <= 'z' )
					terminale.add(b[1].charAt(i));
			}
			stop++;
		}

		br.close();
		return new Gramatica(start_cond,terminale,neterminale,productii);
	}
}
