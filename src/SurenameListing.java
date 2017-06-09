import java.util.*;

public class SurenameListing {

	public static void main(String[] args) {
		String[] names = {"Vitali Vildikas", "Vello Põld", "Kirju Marju", "Indrek Kaigas"};
		System.out.println(getSurenameList(names)); //{"Vildikas", "Põld", "Marju", "Kaigas"}
	}

	//1. Luua meetod, mis eraldab inimese nimest tema perekonnanime. Nimi on nt. Mari Maasikas – > Maasikas
	public static String seperateSurename(String fullname) {
		return "";
	}
	//2. Luua alammeetod, mis kontrollib, kas perekonnanimi algab suure tähega.
	private boolean isNameUpper(String name) {
		return false;
	}
	//3. Etteantud massiivis olevatest nimedest võtta välja kõikide inimeste perekonnanimed ning lisada need listi.
	public static List<String> getSurenameList(String[] names) {
		return null;
	}
}
