import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {

	public static void main (String [] args) {
		ArrayList<String> namen = new ArrayList<String>();
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Welkom bij het spel ganzenbord.\nGeef het aantal spelers?");
		int spelers = Integer.parseInt(reader.nextLine());
		
		int x = 0;
		while(x<spelers) {
			System.out.println("wat is de naam van speler" +(x+1));
			String naam = reader.next();
			namen.add(naam);
			x++;
		}
		System.out.println("welkom:");
		for(String i: namen) {
			System.out.println(i);
		}
		
		int spelerWaarde = 0;
		
		while(true) {
			System.out.println("Wat wilt u nu doen?");
			System.out.println("");
			System.out.println("g is dobbelsteen gooien q stoppen");
			System.out.println("");
			String invoer = reader.next();
			if(invoer.equals("q")) {
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
					System.out.println("Gefeliciteerd! "+namen.get(0));
					System.out.println("Je hebt het spel gewonnen");
					break;
				}
				if(spelerWaarde > 63) {
				
					spelerWaarde = 63-getal;
					System.out.println("Je hebt teveel gegooid voor de winst, je wordt teruggezet naar vak "+spelerWaarde);
					
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
