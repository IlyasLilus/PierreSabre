package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}
	
	public void donner(Commercant benificiaire) {
		int argentDonne= (int)(argent*0.1);
		parler(benificiaire.getNom()+" prend ces "+argentDonne+" sous.");
		this.perdreArgent(argentDonne);
		benificiaire.recevoir(argentDonne);
		this.honneur++;
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		int reputationYakuza = adversaire.getReputation();
		parler("Je te retrouve enfin, tu vas payer pour ce que tu as fait.");
		if(force>=reputationYakuza) {
			parler("Je t'ai eu petit Yakuza !");
			int argentGagne=adversaire.perdre();
			gagnerArgent(argentGagne);
			honneur++;
		}else {
			parler("J'ai perdu contre lui ?!");
			int perte = getArgent();
			honneur--;
			adversaire.gagner(perte);
			perdreArgent(perte);
		}
		
	}
	
}
