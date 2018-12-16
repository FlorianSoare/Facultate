package Gramatica;
import java.util.*;
public class Gramatica {
	private HashSet<Productie> productii = new HashSet <Productie>();
	private HashSet <Character> terminale = new HashSet <Character>();
	private HashSet <Character> neterminale = new HashSet <Character>();
	private char start_cond;
	public Gramatica() {
		
	}
	public Gramatica (char start_cond,HashSet <Character> terminale ,HashSet <Character> neterminale,HashSet <Productie> productii  ) {
		this.start_cond = start_cond;
		this.terminale = terminale;
		this.neterminale = neterminale;
		this.productii = productii;
	}
	
	public void print (){
		Iterator <Character> it = terminale.iterator();
		System.out.print("T={" + (it.hasNext() ? "" : "}\n\n") );
		while(it.hasNext()) {
			System.out.print(it.next()+(it.hasNext() ? "," : "}\n\n"));
		}
		
		it = neterminale.iterator();
		System.out.print("N={" + (it.hasNext() ? "" : "}\n\n") );
		while(it.hasNext()) {
			System.out.print(it.next()+(it.hasNext() ? "," : "}\n\n"));
		}
		
		System.out.println("P={");
		for(Productie p : productii)
			System.out.println(p);
		System.out.print("}");
	}
	
	public Gramatica lema1() {
		char start_cond2 = start_cond;
		HashSet <Character> neterminale2 = new HashSet <Character>();
		HashSet <Productie> productii2 = new HashSet <Productie> ();
		ArrayList <Productie> temp = new ArrayList <Productie>();
		
		//Pas 0 Intializare
		for(Productie p : productii) {
			if(!p.areNeterminale(neterminale)) {
				temp.add(p);
			}
		}
		for(int i=0;i<temp.size();i++) {
			neterminale2.add(temp.get(i).getStg());
		}
		productii2.addAll(temp);
		
		//Pas1 iterativ
		while(true) {
			HashSet <Productie> aux = new HashSet <Productie>();
			temp.clear();
			for(Productie p : productii) {
				if(!productii2.contains(p) && p.apartine(neterminale2, terminale))
					temp.add(p);
			}
		
			productii2.addAll(temp);
			for(int i=0;i<temp.size();i++) {
				neterminale2.add(temp.get(i).getStg());
			}
			
			if(temp.size() == 0)
				break;
			
		}
		
		return new Gramatica(start_cond2,terminale,neterminale2,productii2);
	}
	
	public Gramatica lema2() {
		char start_cond2 = start_cond;
		HashSet <Character> terminale2 = new HashSet <Character>();
		HashSet <Character> neterminale2 = new HashSet <Character>();
		HashSet <Productie> productii2 = new HashSet <Productie> ();
		ArrayList <Productie> temp = new ArrayList <Productie>();
		
		//Pas 0 Intializare
		start_cond2 = start_cond;
		neterminale2.add(start_cond);
		
		//Pas1 iterativ
		while(true) {
			temp.clear();
			for(Productie p : productii) {
				for(Character c : neterminale2) {
					if(p.getStg() == c && !productii2.contains(p))
						temp.add(p);
				}
			}
		
			productii2.addAll(temp);
			for(int i=0;i<temp.size();i++) {
				String m = temp.get(i).getDr();
				for(int j=0;j<m.length();j++) {
					if(m.charAt(j) >= 'a' && m.charAt(j) <= 'z'){
						terminale2.add(m.charAt(j));
					}else if(m.charAt(j) >= 'A' && m.charAt(j) <= 'Z') {
						neterminale2.add(m.charAt(j));
					}
				}
			}
			
			if(temp.size() == 0)
				break;
			
		}
		
		return new Gramatica(start_cond2,terminale2,neterminale2,productii2);
	}
	
	public Gramatica lema3() {
		char start_cond2 = start_cond;
		HashSet <Character> terminale2 = terminale;
		HashSet <Character> neterminale2 = neterminale;
		HashSet <Productie> productii2 = new HashSet <Productie> ();
		ArrayList <Productie> temp = new ArrayList <Productie>();
		
		
		//Pas 0 Intializare
		HashSet <Character> nulabile = new HashSet <Character>();
		while(true) {
			ArrayList <Character> aux = new ArrayList<Character>();
			for(Productie p : productii) {
				if(!nulabile.contains(p.getStg()) && (p.areLanda() || p.areDoarTerminaleNulabile(nulabile)))
					aux.add(p.getStg());
			}
			if(aux.size()==0)
				break;
			nulabile.addAll(aux);
		}
		if(nulabile.size() == 0)
			return this;
		//Pas1 iterativ
		for(Productie p : productii) {
			construireProductii(p,neterminale2,terminale2,nulabile,productii2);
		}
		
		
		// Eliminam terminalele nulabile din dreapta fiecarei comabinatii posibile
		/*for(Productie p : productii2) {
			p.removeTerminaleNulabile(nulabile);
		}*/
		
		return new Gramatica(start_cond2,terminale2,neterminale2,productii2);
	}
	
	public void construireProductii(Productie p,HashSet <Character> neterminale,HashSet <Character> terminale, HashSet <Character> nulabile,HashSet <Productie> prodc) {
		String m = p.getDr();
		for(int i=1;i<((m.length()+1) * (1+m.length()));i++) {
			String nou = generareString(m,m.length(),i);
			if(conditiiIndeplinite(nou,neterminale,terminale,nulabile,m))
				prodc.add(new Productie(p.getStg(),nou));
		}
	}
	
	public String generareString(String m,int length,int nr) {
		StringBuffer n = new StringBuffer();
		while(nr > 0 && length >0) {
			
			if(nr%2  == 1) {
				n.append(m.charAt(m.length()-length));
			}
			nr/=2;
			length--;
		}
		
		return n.toString();
	}
	
	public boolean conditiiIndeplinite(String m,HashSet <Character> neterminale,HashSet <Character> terminale, HashSet <Character> nulabile,String prod) {
		
		int j=1;
		for(int i=0;i<prod.length();i++) {
			if(terminale.contains(prod.charAt(i)) || (neterminale.contains(prod.charAt(i)) && !nulabile.contains(prod.charAt(i))))
				j++;
			else if(nulabile.contains(prod.charAt(i)))
				j++;
		}
		if(j == m.length() )
			return true;
		
		return false;
	} 
}
