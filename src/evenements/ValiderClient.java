package evenements;

import javax.swing.*;

import client.Fidele;
import client.Occasionnel;
import client.StockClient;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fenetre.Fenclient;
import fenetre.Fenprinci;
import test.Test;


public class ValiderClient implements ActionListener {

	
private Fenclient fenetre;
private Fenprinci fen;
        
//------------------------
//  Constructeur 
//------------------------
public ValiderClient(Fenclient fenetre, Fenprinci fen) {
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

        if (b== fenetre.getValider())
        {
            if (fenetre.getFidele().isSelected())
            {
                if (StockClient.Idexiste(fenetre.getIdtxt().getText())== false) {
                    Fidele c = new Fidele(fenetre.getIdtxt().getText(), fenetre.getNomtxt().getText(), fenetre.getPrenomtxt().getText(),0.10);
                    fen.getListeCl().addElement(c);
                    Test.getListeCl().Ajouter(c);
                }
                
                
            }
            
            else
            {
            	if (StockClient.Idexiste(fenetre.getIdtxt().getText())== false) {
                    Occasionnel c = new Occasionnel(fenetre.getIdtxt().getText(), fenetre.getNomtxt().getText(), fenetre.getPrenomtxt().getText(),0.10);
                    fen.getListeCl().addElement(c);
                    Test.getListeCl().Ajouter(c);
            }
            fenetre.dispose();
        }
        }
}
}
