package client;

import java.util.ArrayList;

import commande.Commande;

public abstract class Client {
	
	
	protected String idClient;
	protected String nomClient;
	protected String prenomClient;
	protected double reduction;
	protected ArrayList<Commande> listeCde;
	
	
	@Override
	public String toString() {
		return "Client [ID=" + idClient + ", Nom=" + nomClient + ", Prénom=" + prenomClient
				+ ", Réduction=" + reduction + "]";
		
	}

	public void AjouterCommande(Commande cde) {
		listeCde.add(cde);
		
	}

	public String getIdClient() {
		return idClient;
	}


	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public double getReduction() {
		return reduction;
	}


	public void setReduction(double reduction) {
		this.reduction = reduction;
	}
	
}

