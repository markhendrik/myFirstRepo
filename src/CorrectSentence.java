public class CorrectSentence {

	public static void main(String[] args) {
		/* Demo logical operators
		int a = 5;
		int b = 2;
		
		//AND "ja" &&
		boolean biggerThan4 = a > 4 && b > 4;
		System.out.println("Mõlemad suuremad kui 4 : " + biggerThan4 + " (a > 4 " + (a > 4) + " b > 4 " + (b > 4) + ")");
		
		//OR "või" ||
		boolean oneBiggerThan4 = a > 4 || b > 4;
		System.out.println("Vähemalt üks on suurem kui 4 : " + oneBiggerThan4 + " (a > 4 " + (a > 4) + " b > 4 " + (b > 4) + ")");
		
		//NOT "ei" !  eitav võrdlus !=
		boolean aNotSmallerThan10 = !(a < 10);
		System.out.println("a ei ole väiksem kui 10 : " + aNotSmallerThan10);
		
		boolean aNotEquals4 = a != 4;
		System.out.println("a ei ole võrdne 4-ga: " + aNotEquals4);
		end of demo */
		
		CorrectSentence cs= new CorrectSentence();
		String str1 = "maja On ilUs";
		String str1Upper = str1.toUpperCase();
//		System.out.println(str1Upper);
		
		String str1Lower = str1.toLowerCase();
//		System.out.println(str1Lower);
//      System.out.println(cs.toUpperFirstChar(str1));
//		System.out.println(cs.addMark(str1, "?" ));//NB kui saadakse erind, siis programmi edasine täitmine katkestatakse.
//		System.out.println(cs.sentenceToLower(str1));
		System.out.println(cs.correctSentence(str1));
	}
	
	//correctSentence("iLm oN ilus") -> "Ilm on ilus."
	public String correctSentence(String sentence) {
		return addMark(toUpperFirstChar(sentenceToLower(sentence)), ".");
	}
	
//	Abimeetodid
//	1. eemaldada suured tähed sõnade keskelt.
//	2. lisada suur algustäht
//	3. lisada lauselõpu märk.
	
	//nt toUpperFirstChar("kaunis ilm") -> "Kaunis ilm" 
	private String toUpperFirstChar(String sentence) { //sentence = "kaunis ilm"
		String firstChar = sentence.substring(0, 1); // "k"
		String firstCharUpper = firstChar.toUpperCase();  //"K"
		String allTheRest = sentence.substring(1) ; // "aunis ilm"
		return firstCharUpper + allTheRest; // Liita suur algus täht "K" + "aunis ilm" = "Kaunis ilm"
	}
	
	//nt addMark("Ilm on ilus", ".") -> "Ilm on ilus."
	//nt addMark("Maja on ka ilus", "!") -> "Maja on ka ilus!"
	private String addMark(String sentence, String mark){
		if (!(mark.equals(".") || mark.equals("!") || mark.equals("?"))) {//kui ei ole . ja kui ei ole ! ja kui ei ole ?
			throw new IllegalArgumentException("Mark must be . or ! or ? Invalid mark was: " + mark);
		}
		return sentence + mark;
	}
	
	//eemaldada suured tähed sõnade keskelt.
	// sentenceToLower("ILm oN ilus") -> "Ilm on ilus"
	private String sentenceToLower (String sentence) {
		return sentence.substring(0, 1) + sentence.substring(1).toLowerCase();
	}

}