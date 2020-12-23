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


public class ClicDictionnaire implements ItemListener {


private Fenstock fenetre;

        
//------------------------
//  Constructeur 
//------------------------
public ClicDictionnaire(Fenstock fenetre) {
        super();
        this.fenetre = fenetre;
        fenetre.getCb3().addItemListener(this);
}

//-------------------------
// Methode actionPerformed
//-------------------------


@Override
public void itemStateChanged(ItemEvent e) {
	
	String getItem = (String)fenetre.getCb3().getSelectedItem();
	
	
	
	if(getItem.equals(fenetre.getItem3()[2])) {
		fenetre.getCb3().setEnabled(false);
		fenetre.getTitre().setVisible(true);
		fenetre.getTitretxt().setVisible(true);
		fenetre.getTarifj().setVisible(true);
		fenetre.getTarifjtxt().setVisible(true);
		fenetre.getQuantite().setVisible(true);
		fenetre.getQuantitetxt().setVisible(true);
		fenetre.getLangue().setVisible(true);
		fenetre.getLanguetxt().setVisible(true);
	}
	
}



}