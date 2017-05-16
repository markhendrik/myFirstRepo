import java.util.HashMap;

public class Methods {

	public static void main(String[] args) {	
		System.out.println("Kas 2 on paarisarv? " + isEvenNum(2));
		System.out.println("Kas 5 on paarisarv? " + isEvenNum(5));
	
		System.out.println("Meetodi add five tulem parameetriga kaks: " + addFive(2));
		System.out.println(firstToUpper("abc dsads"));

	}
	
	public static String comasToSpace(String str) {
		return str.replaceAll(",", " ");
	}
	
	public static String firstToUpper(String str) {
		return str.substring(0,1).toUpperCase() + str.substring(1);
	}
	
	
	
	

	// Tagastustüüp meetodiNimi(sisendid)

	// Meetod, mis otsustab, kas tegemist on paarisarvuga.
	// isEvenNum(2) -> true (boolean)
	public static boolean isEvenNum(int number) {
		boolean isEven = number % 2 == 0;
		return isEven;
	}

	// Meetod, mis liidab etteantud väärtusele 5.
	public static int addFive(int number) {
		return number + 5;
	}
	
	//Meetod, mis liidab etteantud väärtusele, teise etteantud väärtuse.

}
