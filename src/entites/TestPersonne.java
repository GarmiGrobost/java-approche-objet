package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// Création de la première instance de la classe Personne
		AdressePostale adr1 = new AdressePostale(18, "Rue du loup", "27180", "Gisors");

		Personne pr1 = new Personne("POISSON", "Marc", adr1);

		// Création de la première instance de la classe Personne
		AdressePostale adr2 = new AdressePostale(21, "Rue du bonheur", "34000", "Montpellier");

		Personne pr2 = new Personne("Lavache", "Marc", adr2);

	}

}
