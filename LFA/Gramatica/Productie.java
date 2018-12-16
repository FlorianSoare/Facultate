package Gramatica;

import java.util.HashSet;

public class Productie implements Comparable {
	private char stg;
	private String dr;
	
	Productie(char stg,String dr){
		this.stg= stg;
		this.dr = dr;
	}
	
	public char getStg() {
		return this.stg;
	}
	
	public String getDr() {
		return this.dr;
	}
	
	public String toString() {
		return this.stg + "->" + this.dr;
	}
	
	public boolean contains(char m) {
		for(int i=0;i<dr.length();i++) {
			if(dr.charAt(i) == m)
				return true;
		}
		
		return false;
	}
	
	public boolean equals(Object o) {
		Productie p = (Productie) o;
		if(p.getStg() == stg && p.getDr().equals(dr))
			return true;
		
		return false;
	}
	
	public int compareTo(Object o) {
		Productie p = (Productie) o;
		if(p.getStg() == stg && p.getDr().equals(dr))
			return 0;
		if(p.getStg() > stg)
			return 1;
		
		if(p.getStg() < stg)
			return -1;
		
		return 1;
	}
	
	public boolean areNeterminale(HashSet <Character>neterminale) {
		for(int i=0;i<dr.length();i++) {
			if(neterminale.contains(dr.charAt(i)))
				return true;
		}
		return false;
	}
	
	public boolean areDoarTerminaleNulabile(HashSet <Character> nulabile) {
		for(int i=0;i<dr.length();i++) {
			if(!nulabile.contains(dr.charAt(i)))
				return false;
		}
		return true;
	}
	
	public boolean apartine(HashSet <Character>neterminale,HashSet <Character>terminale) {
		for(int i=0;i<dr.length();i++) {
			if(!neterminale.contains(dr.charAt(i)) && !terminale.contains(dr.charAt(i)))
				return false;
		}
		
		return true;
	}
	
	public boolean areLanda() {
		for(int i=0;i<dr.length();i++) {
			if(dr.charAt(i) == ' ')
				return true;
		}
		return false;
	}
	
	public void removeTerminaleNulabile(HashSet <Character> nulabile) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<dr.length();i++) {
			if(!nulabile.contains(dr.charAt(i)))
				sb.append(dr.charAt(i));
		}
		
		dr = sb.toString();
	}
}
