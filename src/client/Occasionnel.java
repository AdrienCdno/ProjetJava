package client;

public class Occasionnel extends Client{
	
	public Occasionnel(String idClient, String nomClient, String prenomClient, double reduction) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.reduction = 0;
	}

	@Override
	public String toString() {
		return "Occasionnel [ID=" + idClient + ", Nom=" + nomClient + ", Prénom=" + prenomClient
				+ ", Réduction=" + reduction + "]";
	}
	
}