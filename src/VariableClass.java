
public class VariableClass {

	public static void main(String[] args) {
		// 1. Kahe muutuja korrutamine, jagamine (võib proovida ka liitmist ja
		// lahtutamist.
		// S.t tulemus pange mõnel juhul eraldi muutujasse, teinekord võib
		// väljaprindis olla.
		int a = 6;
		int b = 3;
		int c = a * b;
		int d = a / b;
		System.out.println(c);
		System.out.println(d);		
		
		// 2. Proovida “jäägiga jagamist” %-märgi abil. Kes oskab if-lauset
		// kasutada ja muutuja kohta välja küsida, kas tegemist on paaris-või
		// paarituarvuga.
		int jaak = a % b;
		System.out.println(a + " ja " + b +" jäägiga jagamise tulemus on " + jaak);
		
		if (a % 2 == 0) {
			System.out.println("Muutuja 'a' on paarisarv.");
		}
		// 3. Teha muutuja, mis hoiab endas tõeväärtust arvu kohta, kas tegemist
		// on paarisarvuga.
		boolean isEvenNumber = a % 2 == 0;

		// 4. Kirjutada tingimuslausesse või muutujasse loogika, mis otsustaks,
		// kas arv on suurem kui 10.
		boolean isMoreThan10 = a > 10;
		// 5. Kirjutada tingimuslausesse või muutujasse loogika, mis otsustaks,
		// kas arv on suurem kui 10 ja paaritu arv.
		if (b > 10 && b % 2 == 0) {
			System.out.println(b + " on paaris arv ja üle 10.");
		}
	}
}
