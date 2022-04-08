import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MainPharmacie {
	
	public static ArrayList<Client> listeClient = new ArrayList<Client>();
	public static ArrayList<Medicament> listeMedoc = new ArrayList<Medicament>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Client c1 = new Client("Dupond","Jean", 0);
		Client c2 = new Client("Duprés","Marie", 0);
	
		Medicament m1= new Medicament("Aspirine 500", 3.90, 20);
		Medicament m2= new Medicament("Doliprane 1000", 5.20, 15);
		listeMedoc.add(m1);
		listeMedoc.add(m2);
		
		listeClient.add(c1);
		listeClient.add(c2);
		
		int quit;
		do
		{
			int key;
			System.out.println("Veuillez sélectionner le programme que vous souhaitez : \n"
					+ "1. Afficher \n" 
					+ "2. Approvisionner les medicaments \n"
					+ "3. Achat \n" );
				
			
			key = sc.nextInt();
			switch (key)
			{
			case 1: // Afficher le client et/ou medicament
				afficher();
				break;
			
	
			default:
				break;
	
			}
			System.out.println("Voulez-vous Quitter l'application ? \n" 
			+ "1. Oui \n"
			+ "2. Non - revenir au Menu");
			quit = sc.nextInt();
			
		} while (quit == 2);
		
		System.out.println("Fin de l'application");
	
		
	}	
		
		
		
		
		
		public static void afficher()
		{
			System.out.println("Que voulez-vous afficher?\n"
		 + "1. Les medicaments\n"
		 + "2. Les clients \n ");

			int key = sc.nextInt();
			switch (key)
			{
			case 1:
				System.out.println("Liste des Clients : \n" + listeMedoc);
				main(null);
				break;

			case 2:
				System.out.println("Liste des Medicaments : \n" + listeClient);
				main(null);

			default:
				break;
			}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


