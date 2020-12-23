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

public class ClicDocument implements ItemListener {


private Fenstock fenetre;

        
//------------------------
//  Constructeur 
//------------------------
public ClicDocument(Fenstock fenetre) {
        super();
        this.fenetre = fenetre;
        fenetre.getCb1().addItemListener(this);
}

//-------------------------
// Methode actionPerformed
//-------------------------


@Override
public void itemStateChanged(ItemEvent e) {
	
	String getItem = (String)fenetre.getCb1().getSelectedItem();
	
	
	
	if(getItem.equals(fenetre.getItem1()[1])) {
		fenetre.getCb3().setVisible(true);
		fenetre.getCb1().setEnabled(false);
	}
	
}



}