package personnages;



public class Scenario {

	public static void main(String[] args) {
		Druide Panoramix =new Druide("Panoramix",5,10);
		Panoramix.preparerPotion(Panoramix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Panoramix.booster(Panoramix,obelix);
		Panoramix.booster(Panoramix, Asterix);
		Asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
		minus.parler("Aïe");
		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
		minus.parler("Aïe");
		System.out.println("Astérix envoie un grand coup dans la mâchoire de Minus");
		minus.parler("J'abandonne");
		
	}

}