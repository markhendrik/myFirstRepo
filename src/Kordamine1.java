import java.util.Arrays;

public class Kordamine1 {

	public static void main(String[] args) {
		Kordamine1 kt = new Kordamine1();
		// System.out.println(kt.getFirstTwo("peavalu"));
		// System.out.println(kt.repeatFirstChar("naine", 3));
		// System.out.println(kt.repeatLastChar("suvi", 3));
		// System.out.println(kt.getStringFromX("Mister x oli G. Ots"));
		// System.out.println(Arrays.toString(kt.makePi()));
		// System.out.println(kt.count7(new int[] {7, 5, 7, 8, 7}));
		// System.out.println(kt.countNum(new int[] {7, 5, 7, 8, 7}, 7));
		// System.out.println(kt.sum2Elements(new int[] {3,4,9}));
		// System.out.println(kt.getLongestWord(new String[] {"ilus", "päike",
		// "paistab", "ja", "ilm"}));
		//System.out.println(kt.getStrToB("Labidas"));
		System.out.println(kt.isFirstAndLastSame("sass"));
		System.out.println(kt.cutWordInHalf("sass"));
		System.out.println(kt.cutEverySecondChar("peavalu"));
	}

	// Meetod, mis annab sõnast osasõna (substring) kuni esimese b-täheni.

	public String getStrToB(String str) {
		return str.substring(0, str.indexOf("b"));
	}
	// Meetod, mis tagastab boolean väärtuse true, kui sõna esimene ja viimane
	// täht on samad.

	public boolean isFirstAndLastSame(String str) {
		return (str.substring(0, 1).equals(str.substring(str.length() - 1)));
	}

	public String getFirstTwo(String str) {
		return str.substring(0, 2);
	}

	// Tagastada esimese tähe kordus etteantud kordi.
	// Nt repeatFirstChar(„abc“, 4) -> „aaaa"
	public String repeatFirstChar(String str, int n) {
		// char first = str.charAt(0);
		String first = str.substring(0, 1);
		String result = "";
		for (int i = 0; i < n; i++) {
			result += first;
		}
		return result;
	}

	// Tagastada viimase tähe kordus etteantud kordi.
	// Nt repeatLastChar(„abc“, 3) -> „ccc“
	public String repeatLastChar(String str, int n) {
		String last = str.substring(str.length() - 1);
		String result = "";
		for (int i = 0; i < n; i++) {
			result += last;
			// System.out.println("Vahetulem " + i + " : "+ result);
		}
		return result;
	}

	// Meetod, mis tagastab sõna teise poole alates tähest „x“.
	// Kui sõnas puudub täht „x“ tagastada algne sõna.
	// getStringFromX("Mister x oli G. Ots") ->" oli G. Ots"
	public String getStringFromX(String str) {
		int indexX = str.indexOf("x");
		return str.substring(indexX + 1);
		// return str.substring(str.indexOf("x") + 1);
	}

	// [3, 1, 4]
	public int[] makePi() {
		/*
		 * Version 1 int[] piValues = new int[3]; piValues[0] = 3; piValues[1] =
		 * 1; piValues[2] = 4; return piValues;
		 */

		/*
		 * Version 2 int[] piValues = {3, 1, 4}; return piValues;
		 */

		// Version 3
		return new int[] { 3, 1, 4 };
	}

	// Meetod, mis loendab, mitu number 7 on etteantud massiivis.
	public int count7(int[] array) {
		/*
		 * int count = 0; for (int i = 0; i < array.length; i++) { if (array[i]
		 * == 7) { count++; //count = count + 1; count += 1; } } return count;
		 */
		return countNum(array, 7);
	}

	public int countNum(int[] array, int num) {
		int count = 0;
		for (int i : array) {
			if (i == num) {
				count++;
			}
		}
		return count;
	}

	// Meetod, mis tagastab massiivi kahe esimese elemendi summa.
	public int sum2Elements(int[] array) {
		if (array.length == 0) {
			return 0;
		} else if (array.length < 2) {
			return array[0];
		}
		return array[0] + array[1];

		// Nt (a > max) ? a + 1 : max
		// return array.length == 0 ? 0 : array.length < 2 ? array[0] : array[0]
		// + array[1];
	}

	// Massiivist pikima sõna leidmine.
	// getLongestWord(["ilus", "päike", "paistab", "ja", "ilm", ]) -> "paistab"
	public String getLongestWord(String[] words) {
		String longest = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longest.length()) {
				longest = words[i];
				// System.out.println(longest);
			}
		}
		return longest;
	}
	public String cutWordInHalf(String str) {
		return str.substring(str.length()/2);
	}
	public String cutEverySecondChar(String word) {
		String result = "";
		for (int i = 1; i < word.length(); i+=2) {
			System.out.println(result);
			result+=word.charAt(i);
		}
		return result;
	}
}
