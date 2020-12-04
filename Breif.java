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
		
		// Afficher un message d�accueil 
		System.out.println("---- Bienvenue ------ \n\n");
		
		// Inviter l�utilisateur d�introduire le nom est le pr�nom
		System.out.println("entrer votre nom");
		nom = scanner.next();
		
		System.out.println("entrer votre prenom");
		prenom = scanner.next();
		
		// Afficher un message de bienvenue au nom de l�utilisateur
		System.out.println("Bienvenue " + nom + " " + prenom + "\n");
		
		// Inviter l�utilisateur d�introduire le nombre d�heures travaill�es
		System.out.println("entrer le nombre d�heures travaill�es");
		heure = scanner.nextInt();
		
		// Si le nombre d�heures ne d�passe pas 60, inviter l�utilisateur � introduire le tarif par heure
		if(heure <= 60) {
			System.out.println("entrer votre tarif par heure");
			Tarif = scanner.nextDouble();
			
			if(heure > 40) {
				/*
				Si le nombre d�heures travaill� dans une semaine d�passe 40
				heures, le nouveau tarif des heures suppl�mentaires est augment� de 50% par rapport au tarif
				ordinaire.
				Tarif extra = tarif + 0.5*tarif
				*/

				
				nouveauxHeure = heure - 40;
				TarifExtra = (heure * Tarif) + 0.5 *(nouveauxHeure * Tarif);
				System.out.println("votre indemnisation de base est " + 40 * Tarif + " MAD");
				
				System.out.println("votre indemnisation total " + TarifExtra+ " MAD");
				
				System.out.println("les heures que tu as ajout� " + nouveauxHeure+ " heures");
			}
			else {
				// Afficher le message suivant : votre indemnisation est de xxx MAD

				System.out.println("votre indemnisation est " + heure * Tarif + " MAD");
			}
		}
		
		else {
			// Si le nombre d�heures d�passent 60, afficher un message : informations erron�s !
			System.out.println("informations erron�s !");
		}
		
		scanner.close();
	}
}


