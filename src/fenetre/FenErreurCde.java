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

public class FenErreurCde extends JFrame{
	
	private JLabel msg;
	
	public FenErreurCde(){
	this.setTitle("Erreur");
	this.setSize(400, 75);
	this.setLocationRelativeTo(null);          
	this.setVisible(true);
	this.setLayout(new BorderLayout());
	
	msg = new JLabel("Veuillez sélectionner une commande.");
	this.add(msg, BorderLayout.CENTER);
	
	
	
	}
}
