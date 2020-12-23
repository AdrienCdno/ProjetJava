package produit;

public class DVD extends SupportNumerique{
	private String realisateur;
	public DVD(String titre, double tarif_jour, int quantite, String realisateur) {
		super();

		this.titre = titre;
		this.tarif_jour = tarif_jour;
		this.realisateur = realisateur;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "DVD [realisateur=" + realisateur + ", identifiant=" + identifiant + ", titre="
				+ titre + ", tarif_jour=" + tarif_jour + ", quantite=" + quantite + "]";
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	
	
}
