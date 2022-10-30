package personnages;

public class Commercant extends Humain {

	private int argentPerdu;

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public int seFaireExtorquer() {
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		this.argentPerdu=getArgent();
		this.perdreArgent(argentPerdu);
		return argentPerdu;
	}
	
	public void recevoir(int don) {
		System.out.println((getNom())+": " + don +" sous ! Je te remercie généreux donateur !");
		this.gagnerArgent(don);
	}
}
