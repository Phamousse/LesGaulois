package personnages;


public class Village {
	
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		villageois = new Gaulois[nbVillageoisMaximum];
	this.nom = nom;
	
	}
	
	public void ajouterHabitant(Gaulois nom) {
		Gaulois astronomix = new Gaulois("Astronomix", 3);
		nbVillageois +=1;
		villageois[nbVillageois] = nom;
	}
	
	public void trouverHabitant(int num) {
		System.out.println("Voici le gaulois que vous rechercher il se nomme " + villageois[num] + ".");		
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}
	public String getNom() {
	return nom;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible",30);
//		Gaulois gaulois = village.trouverHabitant(30);
		
	}
	
	
}	
