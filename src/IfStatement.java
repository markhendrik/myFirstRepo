
public class IfStatement {

	public static void main(String[] args) {
		boolean onPaarisarv = 7 % 2 == 0;
		if (onPaarisarv) {
			System.out.println("Tegemist on paarisarvuga.");// sysout
		} else {
			System.out.println("Ei ole paarisarv, see on paaritu arv");
		}

		String sona = "abcd";
		if ("abc".equals(sona)) {
			System.out.println("Tegemist on sõnega 'abc'");
		}
		
		System.out.println("_______________");
		
		//Java doc näide. Hea seletus on ka else if struktuuri kohta: http://www.w3schools.com/js/js_if_else.asp
		int testscore = 76;
		char grade;

		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
		System.out.println("_______________");

		// Prinditakse välja "paarisarv", kui tegemist on paarisarvuga ja
		// "paaritu",
		// kui tegemist on paarituga. Prinditakse välja, mis vahemikus ta on:
		// a) 0-10 b)10-100 c) üle saja

		// int testNum = 7; OUT paaritu a
		// int testNum = 56; OUT paarisarv b

		int testNum = 555;
		if (testNum % 2 == 0) {
			System.out.print("paaris; ");
		} else {
			System.out.print("paaritu; ");
		}
		
		if (testNum > 100) {
			System.out.println("a) ehk üle saja");
		} else if(testNum > 10) {
			System.out.println("b) ehk vahemikus 10 - 100");
		} else {
			System.out.println("c) ehk alla 10");
		}
		
	}// end of main
}
