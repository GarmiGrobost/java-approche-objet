package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// Création de la première instance de la classe Personne
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 18;
		adr1.libelleRue = "Rue de la libération";
		adr1.codePostal = "27180";
		adr1.ville = "Gisors";
		Personne pr1 = new Personne();
		pr1.nom = "POISSON";
		pr1.prenom = "Marc";
		pr1.adr1 = adr1;

		// Création de la première instance de la classe Personne
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 21;
		adr2.libelleRue = "Rue du bonheur";
		adr2.codePostal = "34000";
		adr2.ville = "Montpellier";
		Personne pr2 = new Personne();
		pr2.nom = "Lavache";
		pr2.prenom = "Marc";
		pr2.adr1 = adr2;
	}

}
