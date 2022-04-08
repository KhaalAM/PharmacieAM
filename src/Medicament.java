
public class Medicament {

	
	private static int compteur2 = 0;
	private int idMedoc;
    private String nomMedoc;
    private double prix;
    private int stock;
    
    
    public Medicament() 
	{
    	compteur2++;
		this.idMedoc = compteur2;
	}
    
    
	public Medicament(String nomMedoc, double prix, int stock) {
		super();
		compteur2++;
		this.idMedoc = compteur2;
		this.nomMedoc = nomMedoc;
		this.prix = prix;
		this.stock = stock;
	}




    
    
    
	



	/*public void stockMedoc() {
		
		
		double montant;
		if(montant<0 && credit<0) 
		{credit=+montant;	
		}
		else
		{	credit=credit-montant;
		}
		*/
		
		







	
	
	
	
	
	
	



	@Override
	public String toString() {
		return "Medicament [nomMedoc=" + nomMedoc + ", prix=" + prix + ", stock=" + stock + "]";
	}


	public static int getCompteur2() {
		return compteur2;
	}


	public static void setCompteur2(int compteur2) {
		Medicament.compteur2 = compteur2;
	}


	public int getIdMedoc() {
		return idMedoc;
	}


	public void setIdMedoc(int idMedoc) {
		this.idMedoc = idMedoc;
	}


	public String getNomMedoc() {
		return nomMedoc;
	}


	public void setNomMedoc(String nomMedoc) {
		this.nomMedoc = nomMedoc;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}





	
	
	
	
	
}
