package personnages;



public class Scenario {

	public static void main(String[] args) {
		Druide Panoramix =new Druide("Panoramix",5,10);
		Panoramix.preparerPotion(Panoramix);
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Gaulois Asterix = new Gaulois("Ast�rix", 8);
		Panoramix.booster(Panoramix,obelix);
		Panoramix.booster(Panoramix, Asterix);
		Asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		System.out.println("Ast�rix envoie un grand coup dans la m�choire de Minus");
		minus.parler("A�e");
		System.out.println("Ast�rix envoie un grand coup dans la m�choire de Minus");
		minus.parler("A�e");
		System.out.println("Ast�rix envoie un grand coup dans la m�choire de Minus");
		minus.parler("J'abandonne");
		
	}

}