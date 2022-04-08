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
			System.out.println("Veuillez sélectionner le programme que vous souhaitez : \n" + "1. Afficher \n"
					+ "2. Approvisionner les medicaments \n" + "3. Achat \n");

			key = sc.nextInt();
			switch (key) {
			case 1: // Afficher le client et/ou medicament
				afficher();
				break;
			case 2:
				Approvisionner();

				break;
			case 3:
				
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

	public static void lireClient() {
		System.out.println("Liste des client : " + listeClient);
		System.out.print("Choisir l'id du client dont vous voulez les informations : ");
		int idClient = sc.nextInt();

		boolean isTrouver = false;
		for (int i = 0; i < listeClient.size(); i++) {
			if (listeClient.get(i).getId() == idClient) {
				isTrouver = true;
				System.out.println(listeClient.get(i));
			}
		}
		if (isTrouver == false) {
			System.out.println("Aucun client correspondant à cet id.");
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
		if (num != -1) 
		{
			System.out.println("Saisir le nombre d'unité  de medicament que vous souhaitez approvisionner");
			int nbAppro = sc.nextInt();
			int newStock = nbAppro+listeMedoc.get(num).getStock();
			listeMedoc.get(num).setStock(newStock);
			System.out.println(listeMedoc.get(num).getStock());
		}
	}

	
	
	public void Achat() 
	{
		
	}
	
	
	
	
	
	
	
	
}
