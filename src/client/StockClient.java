package client;

import java.util.ArrayList;
import java.util.Iterator;

import commande.Emprunt;


public class StockClient {
protected static ArrayList<Client> listeCl;
	
	public StockClient() {
		listeCl = new ArrayList<Client>();
		
	}
	
	
	


	//ajouter un client
	public void Ajouter(Client cl) {
		listeCl.add(cl);
	}
	
	//supprimer un client
	public void Supprimer(int i) {
		listeCl.remove(i);
		
	}
	
	//afficher la liste des clients
	public void AfficheCl() {
		for (int i =0; i<listeCl.size();i++) {
			System.out.println("A l'index "+i+ " il y a "+ listeCl.get(i));
		}
	}

	public static ArrayList<Client> getListeCl() {
		return listeCl;
	}

	public void setListeCl(ArrayList<Client> listeCl) {
		this.listeCl = listeCl;
	}
	
	public static boolean Idexiste(String id) {
        boolean existe = false;
        for (int i = 0; i<listeCl.size(); i++){
            Client cl = listeCl.get(i);
            if (cl.getIdClient() == id)
            {
                existe = true;
                break;
            }
                
        }
        return existe;
    }
}

