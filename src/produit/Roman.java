package produit;

public class Roman extends Livre{
	public Roman(String titre, double tarif_jour, int quantite, String auteur) {
		super();

		this.titre = titre;
		this.tarif_jour = tarif_jour;
		this.auteur = auteur;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Roman [auteur=" + auteur + ", identifiant=" + identifiant + ", titre=" + titre + ", tarif_jour="
				+ tarif_jour + ", quantite=" + quantite + "]";
	}
	


}
