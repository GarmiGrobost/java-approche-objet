package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adr1;

	public Personne(String nom, String prenom, AdressePostale adr1) {
		this.nom = nom;
		this.prenom = prenom;
		this.adr1 = adr1;
	}
}
