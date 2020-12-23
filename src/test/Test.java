package test;

import java.util.Date;
import java.util.Scanner;

import client.Fidele;
import client.StockClient;
import commande.Commande;
import commande.Emprunt;
import fenetre.Fenprinci;
import produit.Roman;
import produit.StockProd;

public class Test {
	private static Fenprinci fen;
	private static StockClient listeCl;
	private static StockProd liste;
	public static StockProd getListe() {
		return liste;
	}
	public static void setListe(StockProd liste) {
		Test.liste = liste;
	}
	public static StockClient getListeCl() {
		return listeCl;
	}
	public static void setListeCl(StockClient listeCl) {
		Test.listeCl = listeCl;
	}
	public static Fenprinci getFen() {
		return fen;
	}
	public static void setFen(Fenprinci fen) {
		Test.fen = fen;
	}
	public static void main(String[] args) {
		
		liste = new StockProd();
		Commande cde1 = new Commande();
		listeCl = new StockClient();

		//Fenetre
		fen = new Fenprinci();
		fen.setVisible(true);
		
	}
	

}
