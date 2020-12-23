package evenements;

import javax.swing.*;

import client.Fidele;
import client.Occasionnel;
import client.StockClient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fenetre.Fenstock;
import produit.BD;
import produit.CD;
import produit.DVD;
import produit.Dictionnaire;
import produit.ManuelScolaire;
import produit.Roman;
import fenetre.Fenprinci;
import test.Test;


public class ValiderProduit implements ActionListener {

	
private Fenstock fenetre;
private Fenprinci fen;
        
//------------------------
//  Constructeur 
//------------------------
public ValiderProduit(Fenstock fenetre, Fenprinci fen) {
        super();
        this.fenetre = fenetre;
        this.fen = fen;
        fenetre.getValider().addActionListener(this);
        
}

//-------------------------
// Methode actionPerformed
//-------------------------
public void actionPerformed(ActionEvent e){
        
	
        JButton b= (JButton) e.getSource();
    	String getItem1 = (String)fenetre.getCb2().getSelectedItem();
    	String getItem2 = (String)fenetre.getCb3().getSelectedItem();
    	String getItem3 = (String)fenetre.getCb4().getSelectedItem();
    	
        if (b== fenetre.getValider())
        {
        	if(getItem1.equals(fenetre.getItem2()[1]))
        	{
        		CD cd = new CD(fenetre.getTitretxt().getText(), Double.parseDouble(fenetre.getTarifjtxt().getText()), Integer.parseInt(fenetre.getQuantitetxt().getText()), Integer.parseInt(fenetre.getAnneetxt().getText()));
        		fen.getListeProd().addElement(cd);
        		Test.getListe().AjoutProd(cd);
        		
        	}
        	
        	else if(getItem1.equals(fenetre.getItem2()[2]))
        	{
        		DVD dvd = new DVD(fenetre.getTitretxt().getText(), Double.parseDouble(fenetre.getTarifjtxt().getText()), Integer.parseInt(fenetre.getQuantitetxt().getText()), fenetre.getRealtxt().getText());
        		fen.getListeProd().addElement(dvd);
        		Test.getListe().AjoutProd(dvd);
        	}
        	
        	else if(getItem2.equals(fenetre.getItem3()[2]))
        	{
        		Dictionnaire dico = new Dictionnaire(fenetre.getTitretxt().getText(), Double.parseDouble(fenetre.getTarifjtxt().getText()), Integer.parseInt(fenetre.getQuantitetxt().getText()), fenetre.getLanguetxt().getText());
        		fen.getListeProd().addElement(dico);
        		Test.getListe().AjoutProd(dico);
        		
        	}
        	
        	else if(getItem3.equals(fenetre.getItem4()[1]))
        	{
        		BD bd = new BD(fenetre.getTitretxt().getText(), Double.parseDouble(fenetre.getTarifjtxt().getText()), Integer.parseInt(fenetre.getQuantitetxt().getText()), fenetre.getAuteurtxt().getText());
        		fen.getListeProd().addElement(bd);
        		Test.getListe().AjoutProd(bd);
        		
        	}
        	else if(getItem3.equals(fenetre.getItem4()[2]))
        	{
        		ManuelScolaire manu = new ManuelScolaire(fenetre.getTitretxt().getText(), Double.parseDouble(fenetre.getTarifjtxt().getText()), Integer.parseInt(fenetre.getQuantitetxt().getText()), fenetre.getAuteurtxt().getText());
        		fen.getListeProd().addElement(manu);
        		Test.getListe().AjoutProd(manu);
        		
        	}
        	else if(getItem3.equals(fenetre.getItem4()[3]))
        	{
        		Roman roman = new Roman(fenetre.getTitretxt().getText(), Double.parseDouble(fenetre.getTarifjtxt().getText()), Integer.parseInt(fenetre.getQuantitetxt().getText()), fenetre.getAuteurtxt().getText());
        		fen.getListeProd().addElement(roman);
        		Test.getListe().AjoutProd(roman);
        		
        	}
        	fenetre.dispose();
        }
}

}