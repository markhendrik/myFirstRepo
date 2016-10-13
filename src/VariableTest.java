
public class VariableTest {

	public static void main(String[] args) {
		// Kommentaaride lisamine Ctrl + 7
		// Kood korda Ctrl + Shift + f
		// System.out.println() saab sysout + Ctrl+Space
		// tüüp -> muutuja_nimi -> väärtus
		int a = 5;
		a = 77;
		int c = a + 5;
		double b = 3.5;
		String str = "1";
		System.out.println(a);
		char ch = 'a';
		long l = 1000L;
		boolean isYoung = true;//false
		

		// String ->int
		int one = Integer.parseInt(str);
		System.out.println(one + a);
		System.out.println(myFirstMethod(one));
		// int -> String
		// int ->double

	}//end of main

	public static int myFirstMethod(int param1) {
		return param1+1;
	}

}
