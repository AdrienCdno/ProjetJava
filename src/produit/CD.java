package produit;

public class CD extends SupportNumerique{
	private int annee;
	public CD(String titre, double tarif_jour, int quantite, int annee) {
		super();

		this.titre = titre;
		this.tarif_jour = tarif_jour;
		this.annee = annee;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "CD [annee=" + annee + ", identifiant=" + identifiant + ", titre="
				+ titre + ", tarif_jour=" + tarif_jour + ", quantite=" + quantite + "]";
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	
}
