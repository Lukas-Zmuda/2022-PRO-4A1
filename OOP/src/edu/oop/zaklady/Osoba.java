package edu.oop.zaklady;

public class Osoba {
	
	//instancne premenne
	String meno;
	String priezvisko;
	int vek;
	int[] znamkyZPRO = new int[10];
	
	
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
	
	int pocetZnamok() {
		int pocet = 0;
		for(int i = 0; i < znamkyZPRO.length; i++) {
			if(znamkyZPRO[i] != 0) {
				pocet++;
			}
		}
		return pocet;
	}
	
	void pridajZnamku(int znamka) {
		if(pocetZnamok() > 9) {
			System.out.println("Max kapacita znamok");
		}else {
			znamkyZPRO[pocetZnamok()] = znamka;
		}
	}
	
	void vypisZnamok() {
		for(int znamka: znamkyZPRO) {
			if(znamka == 0) {
				break;
			}else {
				
				System.out.print(znamka + ", ");
			}
		}
	}

	
	
	
	
	
	
	
	
	
}
