package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// Création première instance de la classe AdressePostale
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 18;
		adr1.libelleRue = "Rue de la libération";
		adr1.codePostal = "27180";
		adr1.ville = "Gisors";

		// Création deuxième instance de la classe AdressePostale
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 21;
		adr2.libelleRue = "Rue du bonheur";
		adr2.codePostal = "34000";
		adr2.ville = "Montpellier";

	}

}
