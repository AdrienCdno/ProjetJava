package produit;

public class BD extends Livre{
	public BD(String titre, double tarif_jour, int quantite, String auteur) {
		super();

		this.titre = titre;
		this.tarif_jour = tarif_jour;
		this.auteur = auteur;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "BD [auteur=" + auteur + ", identifiant=" + identifiant + ", titre=" + titre + ", tarif_jour="
				+ tarif_jour + ", quantite=" + quantite + "]";
	}
	


}
