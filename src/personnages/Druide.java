package personnages;
import java.util.Random; 


public class Druide {
private String nom;
private int effetPotionMin;
private int effetPotionMax;
private int forcePotion=1;

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " +  effetPotionMax + ".");
}

public String getNom() {
	return nom;
}

public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + "�");
}

private String prendreParole() {
	return "Le druide " + nom + " : ";
}


public int getEffetPotionMin() {
	return effetPotionMin;
}

public void setEffetPotionMin(int effetPotionMin) {
	this.effetPotionMin = effetPotionMin;
}

public int getEffetPotionMax() {
	return effetPotionMax;
}

public void preparerPotion(Druide druide) {
	Random random = new Random();
	while (forcePotion < 5) {
		forcePotion = random.nextInt(effetPotionMax);
	}
	if (forcePotion > 7) { 
		druide.parler("J'ai pr�par� une super potion de force "+forcePotion);
	} else { 
		druide.parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force "+forcePotion);
	}
}

public void booster(Druide druide,Gaulois gaulois) {
	if (gaulois.getNom().equals("Ob�lix")) {
		druide.parler("Non, Ob�lix !... Tu n�auras pas de potion magique ! ");
		gaulois.parler("Par B�l�nos, ce n'est pas juste !");
	} else {
	gaulois.boirePotion(gaulois,forcePotion);
	}
}
public static void main(String[] args) {
	Druide panoramix = new Druide("Panoramix",5,10);
	panoramix.preparerPotion(panoramix);
	System.out.println(panoramix.nom);
}
}
