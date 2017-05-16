import java.util.Arrays;

public class StringIndexEx {

	public static void main(String[] args) {
		StringIndexEx stringIE = new StringIndexEx();
		//System.out.println(stringIE.first3("Tere maailm"));
//		System.out.println(stringIE.oddChars("maailm"));
		
		
		
	}

	//1. ül first3("Mark-Hendrik") -> "Mar"
	public String first3(String str) {
		return str.substring(0, 3);
	}
	
	//2. firstHalf("maailm") -> "maa"
	public String firstHalf(String str) {
		int halfLength = str.length() / 2;
		return str.substring(0, halfLength);
	}

	//3. aToB("kalambuur") -> "alamb"
	// aToB("tambur") -> "amb"
	public String aToB(String str) {
		int aIndex = str.indexOf('a');
		int bIndex = str.indexOf('b');
		return str.substring(aIndex, bIndex);
	}


	//Ül. 4) Koosta sõna põhjal uus sõna, kus on üle ühe tähed välja võetud.
	
	public String oddChars(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			result += str.charAt(i); 
		}
		return result;
	}
}
