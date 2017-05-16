package codingBat;

public class Warmup1 {

	public static void main(String[] args) {
		String str = "abcd";
		int index1 = 2;
		System.out.println(str.substring(2));
		
		
		
		
		
		Warmup1 w = new Warmup1();
		System.out.println("Method sleepIn: " + w.sleepIn(true, true));
		System.out.println("Method frontBack: " + w.frontBack("mingi"));
		
		//AND  &&
		
		//OR   ||
		
		//NOT  !
//		String str = "abcdef";
//		String subString = str.substring(0, 2);
//		System.out.println(subString);
//		System.out.println(str.substring(2));
//		System.out.println(str.length());
//		System.out.println(str.substring(str.length()-1));
		
		boolean isSameString = "abc".equals("abcdef".substring(0, 3));
		System.out.println(isSameString);
		
	}
	


	public boolean sleepIn(boolean weekday, boolean vacation) {
		/*
		boolean sleeping = !weekday || vacation;
		return sleeping;
		*/
		return !weekday || vacation;
	}//end of sleepIn
	
	//1. Etteantud sõnast vahetada ära esimene ja viimane täht
	public String frontBack(String str) {
		if (str.length() < 2) {
			return str;
		}
		return lastLetter(str) + str.substring(1, str.length() - 1) + firstLetter(str);
	}
	
	private String firstLetter(String string) {
		return string.substring(0, 1);
	}
	
	private String lastLetter(String string) {
		return string.substring(string.length()-1);
	}
}
