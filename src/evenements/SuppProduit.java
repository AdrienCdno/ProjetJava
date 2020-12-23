package evenements;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

import client.Client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;
import java.util.Iterator;

import fenetre.FenErreurCl;
import fenetre.FenErreurProd;
import fenetre.Fenprinci;
import client.StockClient;
import test.Test;


public class SuppProduit implements ActionListener {

	
private Fenprinci fenetre;
private FenErreurProd erreur;

        
//------------------------
//  Constructeur 
//------------------------
public SuppProduit(Fenprinci fenetre) {
        super();
        this.fenetre = fenetre;
        fenetre.getItem1_3().addActionListener(this);
}

//-------------------------
// Methode actionPerformed
//-------------------------


@Override
public void actionPerformed(ActionEvent e) {
	if (fenetre.getJlistProd().getSelectedIndex() != -1)
    {
		
		Test.getListe().SupprProd(fenetre.getJlistProd().getSelectedIndex());
		fenetre.getListeProd().remove(fenetre.getJlistProd().getSelectedIndex());
    	
    }	
	else if (fenetre.getJlistCl().getSelectedIndex() == -1)
    	{
    		FenErreurProd erreur = new FenErreurProd();
    	}
    }

}

