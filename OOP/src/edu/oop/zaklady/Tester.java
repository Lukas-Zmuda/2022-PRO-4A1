package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		Osoba o = new Osoba();
		
		o.meno = "Fero";
		o.priezvisko = "Mrkva";
		o.vek = 17;
		
		//System.out.println("Priezvisko: " + o.priezvisko);
		
		Osoba o2 = new Osoba();
		o2.meno = "Jan";
		o2.priezvisko = "Hrasko";
		o2.vek = 52;
		
		
		o.kompletInfo();
		o2.kompletInfo();
		
		System.out.println(o.celeMeno());
		System.out.println(o2.celeMeno());
		System.out.println("--------------");
		o.info();
		o2.info();
		
		

	}

}
