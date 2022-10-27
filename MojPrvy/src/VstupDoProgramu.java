import java.util.Scanner;

public class VstupDoProgramu {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);

		String meno = "";
		int rokNarodenia = 0;
		
		System.out.println("Ako sa volas?");
		meno = sc.nextLine();
		System.out.println("Ahoj " + meno + ". V ktorom roku si sa narodil?");

		rokNarodenia = sc.nextInt();
		System.out.println("Mas " + (2022 - rokNarodenia) + " rokov.");

	}

}
