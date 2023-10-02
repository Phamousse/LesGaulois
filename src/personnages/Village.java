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
		villageois[nbVillageois] = nom;
		nbVillageois +=1;
	}
	
	public Gaulois trouverHabitant(int num) {
		System.out.println("Voici le gaulois que vous rechercher il se nomme " + villageois[num] + ".");
		return null;		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village de Abraracourcix vivent les légendaire gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println("-"+ villageois[i].getNom());
		}
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
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
//		village.ajouterHabitant(abraracourcix);
//		marchera lors de l'héritage
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1); duplication gaulois
//		System.out.println(gaulois);  rien ne se passe
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

		
	}
	
	
}	
