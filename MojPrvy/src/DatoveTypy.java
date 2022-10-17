
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne DT
		
		//deklaracia premennej
		int cislo;
		
		//inicializacia premennej
		cislo = 123;
		
		int x = 10, y = 12, z = 13;
		
		System.out.println(x);
		System.out.println("x = " + x);
		
		int bin = 0b10000000;
		System.out.println(bin);
		
		int hex = 0xff;
		System.out.println(hex);
		
		int oct = 0123;
		System.out.println(oct);
		
		
		//desatinne cisla
		float des = 12.54f;
		double dd = 12.47;
		
		//znaky
		char zav = '@';
		zav = 64;
		
		char uni = '\u0123';
		System.out.println(uni);
		
		//log. hodnoty
		boolean prsi = false;
		
		//konverzia
		byte bb = 12;
		int bint = bb;
		
		bb = (byte)bint;
		
		double ddd = 1.78;
		int dint = (int) ddd;
		System.out.println("dint = " + dint);
		
		String meno = "Fero";
		
		

	}

}
