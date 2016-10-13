
public class EuroCalculator {

	public static void main(String[] args) {
		/*
		System.out.println("Application just started.");
		1. Loome muutuja, mis hoiab endas EUR v‰‰rtusi.
		2. Muutuja hoiab kurssi
		3. Tulemuse v‰ljaprint vıi eraldi muutujana
		*/
		double euros = 10.5;
		double kurss = 8.98;
		double result = euros * kurss;
		System.out.println(result);
		System.out.printf("%.2f", result);
	}
}
