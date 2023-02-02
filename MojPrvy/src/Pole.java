
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia pola
		int[] cisla;
		
		//inicializacia pola
		cisla = new int[7];
		
		cisla[0] = 100;
		cisla[1] = cisla[0] + 45;
		cisla[2] = 2;
		cisla[3] = 44;
		
		System.out.println("Prvy prvok pola ma hodnotu: " + cisla[0]);
		
		
		for(int i = 0; i < 7; i++) {
			System.out.print(cisla[i] + " ");
		}
		System.out.println();
		
		String[] mena4a = {"Adrian", "Daniel", "Daniel", "Stanislav", 
				"Daniel", "Oliver", "Christofer", "Nikita", "Marcel", "Samuel", "Timon"};
		int[] vyska4a = {190, 187, 185, 175, 200, 160, 150, 180, 169, 180, 192};
		
		System.out.println("Pocet ziakov 4A: " + mena4a.length);
		
		for(int i = 0; i < mena4a.length; i++) {
			System.out.println((i + 1) + ". " + mena4a[i] + ": " + vyska4a[i] + " cm");
		}

	}

}
