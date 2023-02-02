
public class Cykly {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj");
		}
		
		int j = 0;
		while(j < 5) {
			System.out.println("Serus");
			j++;
		}
		
		
		j = 10;
		do {
			System.out.println("Cau");
			j++;
		}while(j < 5);
		
		
		System.out.println("Program pokracuje dalej ...");
	}

}
