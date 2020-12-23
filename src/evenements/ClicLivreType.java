package evenements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import fenetre.Fenstock;

public class ClicLivreType implements ItemListener {


private Fenstock fenetre;

        
//------------------------
//  Constructeur 
//------------------------
public ClicLivreType(Fenstock fenetre) {
        super();
        this.fenetre = fenetre;
        fenetre.getCb4().addItemListener(this);
}

//-------------------------
// Methode actionPerformed
//-------------------------


@Override
public void itemStateChanged(ItemEvent e) {
	
	String getItem = (String)fenetre.getCb4().getSelectedItem();
	
	
	
	if(getItem.equals(fenetre.getItem4()[1])) {
		fenetre.getCb4().setEnabled(false);
		fenetre.getTitre().setVisible(true);
		fenetre.getTitretxt().setVisible(true);
		fenetre.getTarifj().setVisible(true);
		fenetre.getTarifjtxt().setVisible(true);
		fenetre.getQuantite().setVisible(true);
		fenetre.getQuantitetxt().setVisible(true);
		fenetre.getAuteur().setVisible(true);
		fenetre.getAuteurtxt().setVisible(true);
	}
	
	if(getItem.equals(fenetre.getItem4()[2])) {
		fenetre.getCb4().setEnabled(false);
		fenetre.getTitre().setVisible(true);
		fenetre.getTitretxt().setVisible(true);
		fenetre.getTarifj().setVisible(true);
		fenetre.getTarifjtxt().setVisible(true);
		fenetre.getQuantite().setVisible(true);
		fenetre.getQuantitetxt().setVisible(true);
		fenetre.getAuteur().setVisible(true);
		fenetre.getAuteurtxt().setVisible(true);
	}
	
	if(getItem.equals(fenetre.getItem4()[3])) {
		fenetre.getCb4().setEnabled(false);
		fenetre.getTitre().setVisible(true);
		fenetre.getTitretxt().setVisible(true);
		fenetre.getTarifj().setVisible(true);
		fenetre.getTarifjtxt().setVisible(true);
		fenetre.getQuantite().setVisible(true);
		fenetre.getQuantitetxt().setVisible(true);
		fenetre.getAuteur().setVisible(true);
		fenetre.getAuteurtxt().setVisible(true);
	}
	
}



}