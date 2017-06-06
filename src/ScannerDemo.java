import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		integerPrintOut();
		namePrint();
	}
	
	public static void integerPrintOut() {
		System.out.println("Sisesta täisarv");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Sisestatud arv on: " + number);
		
		scanner.close();
	}

	public static void namePrint() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.printf("Sisestatud nimi: %s ", name);
		
		scanner.close();
	}
}
