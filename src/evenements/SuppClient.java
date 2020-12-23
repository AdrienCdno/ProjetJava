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
import fenetre.Fenprinci;
import client.StockClient;
import test.Test;


public class SuppClient implements ActionListener {

	
private Fenprinci fenetre;
private FenErreurCl erreur;

        
//------------------------
//  Constructeur 
//------------------------
public SuppClient(Fenprinci fenetre) {
        super();
        this.fenetre = fenetre;
        fenetre.getItem2_3().addActionListener(this);
}

//-------------------------
// Methode actionPerformed
//-------------------------


@Override
public void actionPerformed(ActionEvent e) {
	if (fenetre.getJlistCl().getSelectedIndex() != -1)
    {
		Test.getListeCl().Supprimer(fenetre.getJlistCl().getSelectedIndex());
		fenetre.getListeCl().remove(fenetre.getJlistCl().getSelectedIndex());
    	
    }	
	else if (fenetre.getJlistCl().getSelectedIndex() == -1)
    	{
    		FenErreurCl erreur = new FenErreurCl();
    	}
    }

}

