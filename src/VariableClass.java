
public class VariableClass {

	public static void main(String[] args) {
		// 1. Kahe muutuja korrutamine, jagamine (v�ib proovida ka liitmist ja
		// lahtutamist.
		// S.t tulemus pange m�nel juhul eraldi muutujasse, teinekord v�ib
		// v�ljaprindis olla.
		int a = 6;
		int b = 3;
		int c = a * b;
		int d = a / b;
		System.out.println(c);
		System.out.println(d);		
		
		// 2. Proovida �j��giga jagamist� %-m�rgi abil. Kes oskab if-lauset
		// kasutada ja muutuja kohta v�lja k�sida, kas tegemist on paaris-v�i
		// paarituarvuga.
		int jaak = a % b;
		System.out.println(a + " ja " + b +" j��giga jagamise tulemus on " + jaak);
		
		if (a % 2 == 0) {
			System.out.println("Muutuja 'a' on paarisarv.");
		}
		// 3. Teha muutuja, mis hoiab endas t�ev��rtust arvu kohta, kas tegemist
		// on paarisarvuga.
		boolean isEvenNumber = a % 2 == 0;

		// 4. Kirjutada tingimuslausesse v�i muutujasse loogika, mis otsustaks,
		// kas arv on suurem kui 10.
		boolean isMoreThan10 = a > 10;
		// 5. Kirjutada tingimuslausesse v�i muutujasse loogika, mis otsustaks,
		// kas arv on suurem kui 10 ja paaritu arv.
		if (b > 10 && b % 2 == 0) {
			System.out.println(b + " on paaris arv ja �le 10.");
		}
	}
}
