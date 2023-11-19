package tri;

public class Ville implements Comparable<Ville> {
	private String nom;
	private Integer nombreHabitants;

	public Ville(String nom, Integer nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(Integer nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

	@Override
	public String toString() {
		return nom + "," + nombreHabitants + " hab";
	}

	@Override
	public int compareTo(Ville ville) {
		return this.nom.compareTo(ville.getNom());
	}
}
