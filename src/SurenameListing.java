import java.util.*;

public class SurenameListing {

	public static void main(String[] args) {
		String[] names = { "Vitali Vildikas", "Vello P�ld", "Kirju marju", "Indrek Kaigas" };
		System.out.println(getSurnameList(names)); // {"Vildikas", "P�ld",
													// "Marju", "Kaigas"}
		System.out.println(isNameUpper("Vitali Vildikas"));
		System.out.println(seperateSurename("Vello P�ld"));
	}

	// 1. Luua meetod, mis eraldab inimese nimest tema perekonnanime. Nimi on
	// nt. Mari Maasikas � > Maasikas
	public static String seperateSurename(String fullname) {
		return fullname.substring(fullname.indexOf(" ") + 1);
	}

	// 2. Luua alammeetod, mis kontrollib, kas perekonnanimi algab suure t�hega.
	private static boolean isNameUpper(String name) {
		char firstChar = name.charAt(0);
		return Character.isUpperCase(firstChar);
	}

	// 3. Etteantud massiivis olevatest nimedest v�tta v�lja k�ikide inimeste
	// perekonnanimed ning lisada need listi.
	public static List<String> getSurnameList(String[] names) {
		List<String> surnames = new ArrayList<String>();
		for (String name : names) {
			String surname = seperateSurename(name);
			if (isNameUpper(surname)) {
				surnames.add(surname);
			} else {
				String modSurname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
				surnames.add(modSurname);
				
			}
		}
		return surnames;
	}
}
