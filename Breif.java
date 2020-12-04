package breif1;

import java.util.Scanner;

public class Breif {

	public static void main(String[] args) {
		// declarer les varibles
		String nom;
		String prenom;
		
		double Tarif;
		
		int heure;
		
		double TarifExtra;
		
		int nouveauxHeure;

		// declarer la function de scanner
		Scanner scanner = new Scanner(System.in);
		
		// Afficher un message d’accueil 
		System.out.println("---- Bienvenue ------ \n\n");
		
		// Inviter l’utilisateur d’introduire le nom est le prénom
		System.out.println("entrer votre nom");
		nom = scanner.next();
		
		System.out.println("entrer votre prenom");
		prenom = scanner.next();
		
		// Afficher un message de bienvenue au nom de l’utilisateur
		System.out.println("Bienvenue " + nom + " " + prenom + "\n");
		
		// Inviter l’utilisateur d’introduire le nombre d’heures travaillées
		System.out.println("entrer le nombre d’heures travaillées");
		heure = scanner.nextInt();
		
		// Si le nombre d’heures ne dépasse pas 60, inviter l’utilisateur à introduire le tarif par heure
		if(heure <= 60) {
			System.out.println("entrer votre tarif par heure");
			Tarif = scanner.nextDouble();
			
			if(heure > 40) {
				/*
				Si le nombre d’heures travaillé dans une semaine dépasse 40
				heures, le nouveau tarif des heures supplémentaires est augmenté de 50% par rapport au tarif
				ordinaire.
				Tarif extra = tarif + 0.5*tarif
				*/

				
				nouveauxHeure = heure - 40;
				TarifExtra = (heure * Tarif) + 0.5 *(nouveauxHeure * Tarif);
				System.out.println("votre indemnisation de base est " + 40 * Tarif + " MAD");
				
				System.out.println("votre indemnisation total " + TarifExtra+ " MAD");
				
				System.out.println("les heures que tu as ajouté " + nouveauxHeure+ " heures");
			}
			else {
				// Afficher le message suivant : votre indemnisation est de xxx MAD

				System.out.println("votre indemnisation est " + heure * Tarif + " MAD");
			}
		}
		
		else {
			// Si le nombre d’heures dépassent 60, afficher un message : informations erronés !
			System.out.println("informations erronés !");
		}
		
		scanner.close();
	}
}


