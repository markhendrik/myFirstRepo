
public class Loops {

	public static void main(String[] args) {

		//1. osa �tleme algseisu.
		//2. osa tingimus ts�kli j�tkumiseks.
		//3. osa ts�kli samm ehk palju me muutujat muudame.
		
		//muutujale 1 liirmine i++ ehk i = i + 1 ehk i += 1
		//muutujast 1 lahutamine i-- ehk i = i - 1 ehk i -=1
		
		//Nt ts�kkel 0, 1, 2 ... 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n�lesanded algavad siit: ");
		
		//1. �l. teha for-ts�kkel, mis prindiks v�lja arvud 0-10.
		System.out.println("�l 1.");
		
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		//2. �l for-ts�kkel, 0-10 paaritud arvud.
		System.out.println("\n�l 2.");
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		//3. �l. for-ts�kkel, 0-100 kolmega jaguvad arvud.
		System.out.println("\n�l 3.");
		
		for (int i = 3; i < 100; i += 3) {
			System.out.println(i);
		}
	}
}
