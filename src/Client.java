import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Client 
{	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.##");

	
	
	private static int compteur = 0;
	private int id;
    private String nom;
    private String prenom;
    private double credit;



    public Client() 
    {
    	compteur++;
		this.id = compteur;

    }


	public Client(String nom,String prenom, double credit) {
		super();
		compteur++;
		this.id = compteur;
		this.nom = nom;
		this.prenom = prenom;
		this.credit = credit;
		//creditClient();
	}


	
	
	

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", credit=" + credit + "]";
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getCredit() {
		return credit;
	}



	public void setCredit(double credit) {
		this.credit = credit;
	}
    
  
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	
	
	
	
	
}
