package produit;

import java.util.ArrayList;
import java.util.Iterator;

import client.Client;


public class StockProd {
	protected static ArrayList<Produit> Al;
	
	public StockProd() {
		Al = new ArrayList<Produit>();
	}
	
	

	public void AjoutProd(Produit prod) {
		Al.add(prod);
	}
	public void SupprProd(int i) {
		Al.remove(i);
	}
	
	
	public void AfficheProd() {
		for (int i =0; i<Al.size();i++) {
			System.out.println("A l'index "+i+ " il y a "+ Al.get(i));
		}
	}
	public void ChercheProd(Produit prod) {
		int i = 0;
		if (Al.get(i)== prod) {
			System.out.println("le produit \""+ prod.titre +"\" existe.");
		}
		}
	public static ArrayList<Produit> getAl() {
		return Al;
	}

	public static void setAl(ArrayList<Produit> al) {
		Al = al;
	}
}
