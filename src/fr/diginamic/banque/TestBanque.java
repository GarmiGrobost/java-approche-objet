package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte cpt = new Compte("FR11600", 12500);
		System.out.println(cpt);
		System.out.println("******************************");
		CompteTaux cel = new CompteTaux("El13120", 5300, 1.5);
		System.out.println(cel);
		System.out.println("******************************");
		Compte[] cpts = new Compte[2];
		cpts[0] = cpt;
		cpts[1] = cel;

		for (Compte c : cpts) {
			System.out.println(c);
		}
	}

}
