package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argentPris = victime.seFaireExtorquer();
		this.gagnerArgent(argentPris);
		this.reputation ++;
		this.parler("J'ai piqué "+argentPris+" sous de "+victime.getNom()+" maintenant j'ai "+this.getArgent()+ " sous dans ma poche.");
		
	}
	
	public int perdre() {
		int argentPerdu = argent;
		perdreArgent(argentPerdu);
		reputation--;
		parler("J'ai perdu mon duel et mes "+argentPerdu+" sous, j'ai deshonoré le clan de "+clan+".");
		return argentPerdu;
		
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		parler("Ce ronin se croyait supérieur à "+getNom()+" du clan de "+clan+". Je l'ai dépouillé de ses "+gain+" sous.");
		reputation++;
	}

	public int getReputation() {
		return reputation;
	}
	
	
}
