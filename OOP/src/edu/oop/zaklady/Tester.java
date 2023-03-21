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
		
		Obdlznik obd = new Obdlznik();
		obd.x = 10;
		obd.y = 10;
		obd.dlzka = 100;
		obd.sirka = 200;
		obd.farba = "cervena";
		
		obd.info();
		obd.posun(1, 1);
		obd.info();
		System.out.println("----------");
		obd.info(true);
		
		
		o.pridajZnamku(4);
		o.pridajZnamku(2);
		o.vypisZnamok();

	}

}
