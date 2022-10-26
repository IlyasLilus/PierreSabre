package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom=nom;
		this.boisson=boisson;
		this.argent=argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}


	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}
	private String prendreParole() {
		String texte = "L'humain " + nom + " : ";
		return texte;
	}
	
	public void direBonjour() {
		String salutations = "Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson;
		parler(salutations);
	}
	public void boire() {
		String boit = "Mmmm, un bon verre de "+ boisson +" ! GLOUPS !";
		parler(boit);
	}

	public void acheter(String bien, int prix) {
		if (prix>argent) {
			System.out.println("J'ai "+argent+"sous en poche. "
					+ "Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		}
		if (prix <= argent) {
			System.out.println("J'ai "+argent+" sous en poche."
					+ " Je vais pouvoir m'offir"+bien+" à "+prix);
			argent -= prix;
		}
    }







}
