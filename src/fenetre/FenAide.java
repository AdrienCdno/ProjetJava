package fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenAide extends JFrame{
	
	private JLabel msg;
	
	public FenAide(){
	this.setTitle("Aide");
	this.setSize(600, 200);
	this.setLocationRelativeTo(null);          
	this.setVisible(true);
	this.setLayout(new BorderLayout());
	
	msg = new JLabel("Bienvenue dans la vidéothèque. Grâce au menu, vous avez accès à toutes les fonctionnalités de l'application. Vous pouvez ajouter, supprimer et modifier des clients, des produits et des commandes. Pour supprimer et modifier, veuillez sélectionner l'item que vous voulez supprimer ou modifier.");
	this.add(msg, BorderLayout.CENTER);
	
	
	
	}
}
