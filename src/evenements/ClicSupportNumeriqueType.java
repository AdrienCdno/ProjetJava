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

public class ClicSupportNumeriqueType implements ItemListener {


private Fenstock fenetre;

        
//------------------------
//  Constructeur 
//------------------------
public ClicSupportNumeriqueType(Fenstock fenetre) {
        super();
        this.fenetre = fenetre;
        fenetre.getCb2().addItemListener(this);
}

//-------------------------
// Methode actionPerformed
//-------------------------


@Override
public void itemStateChanged(ItemEvent e) {
	
	String getItem = (String)fenetre.getCb2().getSelectedItem();
	
	
	
	if(getItem.equals(fenetre.getItem2()[1])) {
		fenetre.getCb2().setEnabled(false);
		fenetre.getTitre().setVisible(true);
		fenetre.getTitretxt().setVisible(true);
		fenetre.getQuantite().setVisible(true);
		fenetre.getQuantitetxt().setVisible(true);
		fenetre.getTarifj().setVisible(true);
		fenetre.getTarifjtxt().setVisible(true);
		fenetre.getAnnee().setVisible(true);
		fenetre.getAnneetxt().setVisible(true);
	}
	
	if(getItem.equals(fenetre.getItem2()[2])) {
		fenetre.getCb2().setEnabled(false);
		fenetre.getTitre().setVisible(true);
		fenetre.getTitretxt().setVisible(true);
		fenetre.getQuantite().setVisible(true);
		fenetre.getQuantitetxt().setVisible(true);
		fenetre.getTarifj().setVisible(true);
		fenetre.getTarifjtxt().setVisible(true);
		fenetre.getReal().setVisible(true);
		fenetre.getRealtxt().setVisible(true);
	}
	
}



}