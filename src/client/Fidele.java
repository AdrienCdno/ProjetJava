package client;

public class Fidele extends Client{

	public Fidele(String idClient, String nomClient, String prenomClient, double reduction) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.reduction = 0.10;
	}

	@Override
	public String toString() {
		return "Fidele [ID=" + idClient + ", Nom=" + nomClient + ", Pr�nom=" + prenomClient
				+ ", R�duction=" + reduction + "]";
	}

	
	
}
