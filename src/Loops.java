
public class Loops {

	public static void main(String[] args) {

		//1. osa ütleme algseisu.
		//2. osa tingimus tsükli jätkumiseks.
		//3. osa tsükli samm ehk palju me muutujat muudame.
		
		//muutujale 1 liirmine i++ ehk i = i + 1 ehk i += 1
		//muutujast 1 lahutamine i-- ehk i = i - 1 ehk i -=1
		
		//Nt tsükkel 0, 1, 2 ... 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\nÜlesanded algavad siit: ");
		
		//1. ül. teha for-tsükkel, mis prindiks välja arvud 0-10.
		System.out.println("Ül 1.");
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		//2. ül for-tsükkel, 0-10 paaritud arvud.
		System.out.println("\nÜl 2.");
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		//3. ül. for-tsükkel, 0-100 kolmega jaguvad arvud.
		System.out.println("\nÜl 3.");
		
		for (int i = 3; i < 100; i += 3) {
			System.out.println(i);
		}
	}
}
