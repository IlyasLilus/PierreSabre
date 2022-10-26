package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "kombucha", 54);
		humain.direBonjour();
		humain.acheter(" une boisson", 12);
		humain.boire();
		humain.acheter(" un jeu", 2);
		humain.acheter("une villa au bord la mer avec la montagne et des zèbres à 15min de marche", 125);
		Commercant commercant  = new Commercant("Marco","the",20);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();
	}

}
