package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// Création de la première instance de la classe Personne
		Personne pr1 = new Personne();
		pr1.nom = "POISSON";
		pr1.prenom = "Marc";
		pr1.adr1 = new AdressePostale();

		// Création de la première instance de la classe Personne
		Personne pr2 = new Personne();
		pr2.nom = "Lavache";
		pr2.prenom = "Marc";
		pr2.adr1 = new AdressePostale();
	}

}
