package edu.oop.zaklady;

public class Obdlznik {
	
	int x;
	int y;
	int dlzka;
	int sirka;
	String farba;
	
	
	int obvod() {
		return 2 * (dlzka + sirka);
	}
	
	int obsah() {
		return dlzka * sirka;
	}
	
	void info() {
		System.out.println("Obdlznik na [" + x + ", " + y + "] d = " + dlzka + ", s = " + sirka);
	}
	
	void info(boolean komplet) {
		if(komplet) {
			info();
			System.out.println("Farba: " + farba);
		}else {
			info();
		}
	}
	
	void posun(int novex, int novey) {
		x += novex;
		y += novey;
		System.out.println("Obdlznik sa posunul ...");
	}

}
