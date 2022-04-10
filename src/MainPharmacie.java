// Tokken :  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

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MainPharmacie {

	public static ArrayList<Client> listeClient = new ArrayList<Client>();
	public static ArrayList<Medicament> listeMedoc = new ArrayList<Medicament>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client("Dupond", "Jean", 0);
		Client c2 = new Client("Duprés", "Marie", 0);

		Medicament m1 = new Medicament("Aspirine 500", 3.90, 20);
		Medicament m2 = new Medicament("Doliprane 1000", 5.20, 15);
		listeMedoc.add(m1);
		listeMedoc.add(m2);

		listeClient.add(c1);
		listeClient.add(c2);

		int quit;
		do {
			int key;
			System.out.println("Veuillez sélectionner le programme que vous souhaitez : \n" 
			+ "1. Afficher les Clients ou les Medicaments \n"
			+ "2. Approvisionner les medicaments \n"
			+ "3. Achat \n"
			+ "4. Ajouter un nouveau client\n"
			+ "5. Ajouter un nouveau medicament\n");

			key = sc.nextInt();
			switch (key) {
			case 1: // Afficher le client et/ou medicament
				afficher();
				break;
			case 2:
				Approvisionner();

				break;
			case 3:
				Achat();
				break;

				
			case 4:
				AjoutClient();
				break;
				
			case 5:
				AjoutNouveauMedoc();
				break;
				
			default:
				break;

			}
			System.out.println("Voulez-vous Quitter l'application ? \n" + "1. Oui \n" + "2. Non - revenir au Menu");
			quit = sc.nextInt();

		} while (quit == 2);

		System.out.println("Fin de l'application");

	}

	public static void afficher() {
		System.out.println("Que voulez-vous afficher?\n" + "1. Les medicaments\n" + "2. Les clients \n ");

		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Liste des Clients : \n" + listeMedoc);

			break;

		case 2:
			System.out.println("Liste des Medicaments : \n" + listeClient);

			break;

		default:
			break;
		}

	}

	public static int lireMedoc() {
		int num = -1;// case qui n'exste pas
		System.out.println("Liste des medicaments : " + listeMedoc);
		System.out.print("Choisir le medicament dont vous voulez les informations : ");
		int idMedoc = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeMedoc.size(); i++) {
			if (listeMedoc.get(i).getIdMedoc() == idMedoc) {
				num = i;

				isTrouver = true;
				System.out.println(listeMedoc.get(i));
			}
		}
		if (isTrouver == false) {
			System.out.println("Aucun medicament ne correspondant à cet id.");
		}
		return num;// le programme va retourner le numéro du médicament correspondant

	}

	public static void Approvisionner() {

		int num = lireMedoc();
		if (num != -1) {
			System.out.println("Saisir le nombre d'unité  de medicament que vous souhaitez approvisionner");
			int nbAppro = sc.nextInt();
			int newStock = nbAppro + listeMedoc.get(num).getStock();// on selectionne ici le stock pour 1 medicament+ le
																	// nbAppro
			listeMedoc.get(num).setStock(newStock);
			System.out.println(listeMedoc.get(num).getStock());
		}
	}

	public static int lireClient() {
		int num2 = -1;

		System.out.println("Liste des client : " + listeClient);
		System.out.print("Choisir l'id du client dont vous voulez les informations : ");
		int idClient = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeClient.size(); i++) {
			if (listeClient.get(i).getId() == idClient) {
				num2 = i;
				isTrouver = true;
				System.out.println(listeClient.get(i));
			}
		}
		if (isTrouver == false) {
			System.out.println("Aucun client correspondant à cet id.");
		}
		return num2;
	}

	public static void Achat() {

		int num2, num;
		num2 = lireClient();
		num = lireMedoc();
		int stockPharma = listeMedoc.get(num).getStock();

		if (num2 != -1 && num != -1) {
			System.out.println("saisir le nombre d'article vendu: ");
			int nbAchat = sc.nextInt();
			System.out.println("saisir le montant à payer pour l'achat: ");
			double montant = sc.nextDouble();

			if (stockPharma >= nbAchat) {
				stockPharma -= nbAchat;

				double creditClient = listeClient.get(num2).getCredit();// le credit du client x
				double newCreditClient = creditClient + montant;
				listeClient.get(num2).setCredit(newCreditClient);// modifie le credit du client ayant l'id n° num2
				System.out.println("le nouveau credit du client est de " + listeClient.get(num2).getCredit());// affiche
																												// le
																												// credit
																												// du
																												// client
																												// ayant
																												// l'id
																												// n°
																												// num2

			}

			else {
				System.out.println("Achat Impossible car il n'y a pas assez de medicaments en stock");
			}

		}

		else {
			System.out.println("Ce numero de client et/ou ce medicament n'existe pas");

		}

	}

	public static void AjoutClient() {
		double creditIni;
		System.out.println("Veuillez saisir le nom du client");
		String NomClient = sc.next();
		System.out.println("Veuillez saisir le Prenom du client");
		String PrenomClient = sc.next();
		System.out.println();

		System.out.println("Le client a t'il un credit dans cette pharmacie?\n" + "1.Oui\n" + "2.Non ");
		int testCredit = sc.nextInt();

		if (testCredit == 1) {
			System.out.println("Saisissez le montant du credit : ");
			creditIni = sc.nextDouble();
		} 
		else {
			 creditIni = 0;
		}

		Client c = new Client(NomClient, PrenomClient, creditIni);
		listeClient.add(c);

	}

	
	
	
	
	
	
	
	public static void AjoutNouveauMedoc()
	{
	
		System.out.println("Veuillez saisir le nom du médicament");
		String nomMedic = sc.next();
		System.out.println("Veuillez saisir le Prix de vente de ce medicament");
		String prixMedic = sc.next();
		System.out.println();
		System.out.println("Saisissez le nombre d'unité que vous avez en stock");
		int nbInitialMedic = sc.nextInt();
		Medicament m = new Medicament(nomMedic, nbInitialMedic, nbInitialMedic);
		listeMedoc.add(m);
		

	}
		
}
