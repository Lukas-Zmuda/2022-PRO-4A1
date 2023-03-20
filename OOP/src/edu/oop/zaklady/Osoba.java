package edu.oop.zaklady;

public class Osoba {
	
	//instancne premenne
	String meno;
	String priezvisko;
	int vek;
	
	
	//metody
	//bez navratovej hodnoty
	void kompletInfo() {
		System.out.println("Meno: " + meno);
		System.out.println("Priezvisko: " + priezvisko);
		System.out.println("Vek: " + vek);
	}
	
	void info() {
		System.out.println(celeMeno() + ": " + vek);
	}
	
	//s navratovou hodnotou
	String celeMeno() {
		String vypis = "";		
		vypis = meno + " " + priezvisko;
		return vypis;
	}

	
	
	
	
	
	
	
	
	
}
