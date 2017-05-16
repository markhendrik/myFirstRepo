import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Nimekiri nimedest.
		List<String> names = new ArrayList<String>();
		names.add("Malle");
		names.add("Vitali Vildikas");
		names.add("J�rka J�rgen");
		names.add("Merle Liha");
		
		System.out.println("Nimede listis elemente: " + names.size()); //nums.length
		System.out.println("Esimene nimi on: " + names.get(0)); // nums[0]
		System.out.println("Nimekiri nimedest: " + names); 
		System.out.println();
		
		// Listi l�bimine forEach-iga
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// Listi l�bimine for-ts�kliga
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}
