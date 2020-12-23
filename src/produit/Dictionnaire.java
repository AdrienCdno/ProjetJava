package produit;

public class Dictionnaire extends Document{
	private String langue;
	public Dictionnaire(String titre, double tarif_jour, int quantite, String langue) {
		super();

		this.titre = titre;
		this.tarif_jour = tarif_jour;
		this.langue = langue;
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + ", identifiant=" + identifiant + ", titre=" + titre + ", tarif_jour="
				+ tarif_jour + ", quantite=" + quantite + "]";
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}
	


}
