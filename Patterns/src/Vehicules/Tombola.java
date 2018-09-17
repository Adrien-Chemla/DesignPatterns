package Vehicules;

import java.util.*;

public class Tombola {

	public static void main (String[] args) {

		//création du scanner
		Scanner scanner = new Scanner (System.in);
		
		//Demande de participation
		System.out.println("Souhaitez- vous participer à notre loterie ? Y/N");
		
		//récupération de la réponse
		String reponse = scanner.nextLine();
		
		if(reponse.equals("Y")) {
			
			//initialisation du random
			double rand = Math.random();
			
			//instanciation des objets de Voiture
			if(rand <= 0.1) {
				Voiture voiture = new Suzuki();
				System.out.println("Félicitation vous avez gagné une "+ voiture);
			} if (rand > 0.1 && rand <= 0.2) {
				Voiture voiture = new Tesla();
				System.out.println("Félicitation vous avez gagné une "+ voiture);
			} if (rand > 0.2 && rand <= 0.3) {
				Voiture voiture = new BMW();
				System.out.println("Félicitation vous avez gagné une "+ voiture);
			} if (rand > 0.3) {
				System.out.println("Votre score est de : " + rand);
				System.out.println("Dommage, retentez votre chance une prochaine fois !");
			}
		
		} 
		else if (reponse.equals("N")) {
			System.out.println("Revenez si vous changez d'avis !");
		} else {
			System.out.println("Veuillez entrer une valeur correcte !");
		}
		scanner.close();
	}
}
