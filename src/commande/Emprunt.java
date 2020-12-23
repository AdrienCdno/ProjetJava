package commande;

import java.util.Date;

import produit.Produit;

public class Emprunt{
	protected Date date_debut;
	protected Date date_fin;
	protected Produit p;
	
	
	public Emprunt(Date date_debut, Date date_fin, Produit p) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.p = p;
		
	}

	public Produit getP() {
		return p;
	}

	public void setP(Produit p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Emprunt [date_debut=" + date_debut + ", date_fin=" + date_fin + "]";
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
}
