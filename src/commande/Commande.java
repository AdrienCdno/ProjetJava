package commande;

import java.util.ArrayList;

import produit.Produit;

public class Commande {
	protected static ArrayList<Emprunt> cde;
	
	

	public Commande() {
		cde = new ArrayList<Emprunt>();
	}
	
	public void AjouterEmprunt(Emprunt e) {
		// il faut g�rer la quantit� du produit, si on n'a plus le produit en stock ya pas de commande
		int quantite = e.getP().getQuantite()-1;
		if (e.getP().getQuantite() < 0) {
			System.out.println("Le produit demand� n'est plus en stock");
		}
		else {
			if (e.getP().getQuantite() == 0) {
				System.out.println("C'est le dernier produit en stock");
			}
			cde.add(e);
			e.getP().setQuantite(quantite);
		}		
	}
	
	public void SupprimerEmprunt(Emprunt e) {
		// d'abord v�rifier si le produit est d�j� dans une commande avant de la retirer et changer la qte
		if (cde.contains(e)) {
			cde.remove(e);
			int quantite = e.getP().getQuantite()+1;
			e.getP().setQuantite(quantite);
		}
		else {
			System.out.println("L'emprunt ne se trouve pas dans la commande");
		}
		
	}
	
	public void Afficher() {
		 for(int i = 0; i < cde.size(); i++)
		    {
		      System.out.println("Commande donn�e � l'indice " + i + " = " + cde.get(i));
		    }   
	}
	public static ArrayList<Emprunt> getCde() {
		return cde;
	}

	public void setCde(ArrayList<Emprunt> cde) {
		this.cde = cde;
	}
}
