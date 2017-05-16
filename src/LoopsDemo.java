import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LoopsDemo {

	public static void main(String[] args) {
		// StringTokenizer-i demo
		StringTokenizer tokenizer = new StringTokenizer("Ilm on ilus ja varesed kraaksuvad");

		while (tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();
			// System.out.println(str);
		}
		//System.out.println(getStringsBeginsAorB("See banaanne harjutus sai tehtud arvutis"));
		List<String> longStrings = getLongStrings("See banaanne harjutus sai tehtud arvutis");
		System.out.println(longStrings);
		for (String string : longStrings) {
			System.out.println(string);
		}
		
		//System.out.println(getLongStrings("Ilm on ilus ja varesed kraaksuvad"));
		// 1. StringTokenizeriga leida need s�nad, milles on rohkem kui 4 t�hte.
		// (v�ljaprindiga)
		// 2. StringTokenizeriga leida k�ik a- v�i b-t�hega algavad s�nad.
		// (v�ljaprindiga)
		// 3. Tagastada lause, kus on v�lja v�etud k�ik suure t�hega alavad
		// s�nad. (eraldi meetod)

		/*
		 * // For-ts�kkel for (int i = 1; i < 11; i++) { System.out.println(
		 * "For-loop count:" + i); }
		 * 
		 * System.out.println();
		 * 
		 * // For Each ts�kkel int[] numbers = { 5, 6, 7 }; for (int number :
		 * numbers) { System.out.println("ForEach number: " + number); }
		 * 
		 * // While int count = 1; while (count < 11) { System.out.println(
		 * "Count is: " + count); count++; }
		 */

		// printNums0To10();
		// printNums10To0();
		// printNums5To25();
	}

	private static void printNums0To10() {
		/*
		 * for (int i = 0; i < 11; i++) { System.out.println(i); }
		 */
		int count = 0;
		while (count < 11) {
			System.out.println(count);
			count++;
		}
	}

	private static void printNums10To0() {
		/*
		 * for (int i = 10; i >= 0; i--) { System.out.println(i); }
		 */
		int count = 10;
		while (count >= 0) {
			System.out.println(count);
			count--;
		}
	}

	private static void printNums5To25() {
		/*
		 * for (int i = 5; i<26; i+=5){ System.out.println(i); }
		 */
		int count = 5;
		while (count < 26) {
			System.out.println(count);
			count += 5;
		}
	}
	//TODO 1) 2. ja 3. �l teha ka nii, et tagastatakse list vastavatest s�nade.
	
	 //2) 1. �l teha meetod selliselt �mber, et sisendina saab anda t�htede arvu ette.
	
	// 3) 2. �l. teha meetodi niimoodi ringi, et ette saaks anda vastavaid t�hti.

	// 1. StringTokenizeriga leida need s�nad, milles on rohkem kui 4 t�hte.
	// getLongStrings("Tallinn on Eesti pealinn")
	private static List<String> getLongStrings(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		List<String> result = new ArrayList<>();
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.length() > 4) {
				result.add(token);
			}
		}
		return result;

	}
	// 2. StringTokenizeriga leida k�ik a- v�i b-t�hega algavad s�nad.
	private static String getStringsBeginsAorB(String str){
		StringTokenizer tokenizer = new StringTokenizer(str);
		String result ="";
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.startsWith("a") || token.startsWith("b")) {
				result += token + " ";
				
			}
		}
		return result;
	}
	// 3. Tagastada lause, kus on eemaldatud k�ik suure t�hega alavad s�nad. (eraldi meetod)
	private static String removeAllCaps(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		String result ="";
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			 if (Character.isLowerCase(token.charAt(0))) {
			 result += token+" " ;
			 }			
		}
		return result;
	}
	
}