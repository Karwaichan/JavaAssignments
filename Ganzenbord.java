import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welkom bij het spel ganzenborden\n Geef je naam op:");
		String speler1 = scanner.next();
		System.out.println(speler1);
		
		
		int spelerWaarde = 0;
				
		while(true) {
			System.out.println("Wat wilt u nu doen?");
			System.out.println("");
			System.out.println("g is dobbelsteen gooien q stoppen");
			System.out.println("");
			String invoer = scanner.next();
			if(invoer.equals("q")) {
				System.out.println("q werkt");
				break;
			}
			
			if(invoer.equals("g")) {
				Random jojo = new Random();
				int getal = jojo.nextInt(6)+1;
				spelerWaarde = spelerWaarde + getal;
				
				System.out.println("Je hebt "+getal+ " gegooid");
			
				if(spelerWaarde ==10 || spelerWaarde == 20 ||spelerWaarde == 30||spelerWaarde == 40||spelerWaarde == 50||spelerWaarde == 60) {
					System.out.println("Je bent beland op vakje " +spelerWaarde);
					System.out.println("Je krijgt bonus stapjes, je mag met " + getal+" vooruit");
					spelerWaarde+=getal;
				}
				if(spelerWaarde == 63) {
					System.out.println("Je staat op vakje " +spelerWaarde);
					System.out.println("Gefeliciteerd! "+speler1);
					System.out.println("Je hebt het spel gewonnen");
					break;
				}
				if(spelerWaarde > 63) {
				
					spelerWaarde = 63-getal;
					System.out.println("Je hebt teveel gegooid voor de winst, je wordt teruggezet naar vak"+spelerWaarde);
					
				}else {
				System.out.println("Je staat op vakje " +spelerWaarde);
				}
				if(spelerWaarde ==23) {
					System.out.println("Gevangenis! Het spel is over");
					break;
				}
				if(spelerWaarde ==25) {
					System.out.println("Helaas! Terug naar start");
					spelerWaarde = 0;	
				}
				if(spelerWaarde ==45) {
					System.out.println("Helaas! Terug naar start");
					spelerWaarde = 0;	
				}
				
			}
		
		}
		System.out.println("Bedankt voor het spelen");
	}
}
