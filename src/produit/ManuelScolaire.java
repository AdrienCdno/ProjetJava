package produit;

public class ManuelScolaire extends Livre{
	public ManuelScolaire(String titre, double tarif_jour, int quantite, String auteur) {
		super();

		this.titre = titre;
		this.tarif_jour = tarif_jour;
		this.auteur = auteur;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "ManuelScolaire [auteur=" + auteur + ", identifiant=" + identifiant + ", titre=" + titre + ", tarif_jour="
				+ tarif_jour + ", quantite=" + quantite + "]";
	}
	


}
