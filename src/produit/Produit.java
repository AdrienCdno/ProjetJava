package produit;

public abstract class Produit {
	protected String identifiant;
	protected String titre;
	protected double tarif_jour;
	protected int quantite;
	
	public String getIdentifiant() {
		return identifiant;
	}
	public String getTitre() {
		return titre;
	}
	public double getTarif_jour() {
		return tarif_jour;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setIdentifiant(String identifiant, int num_id) {
		if (num_id < 99) {
			this.identifiant = "P0"+(num_id+1);
		}
		else this.identifiant = "P"+(num_id+1);
		
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setTarif_jour(double tarif_jour) {
		this.tarif_jour = tarif_jour;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
