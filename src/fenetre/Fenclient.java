package fenetre;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import client.Client;
import evenements.ValiderClient;

/*import evenements.AnnulerClient;
import evenements.SuppClient;
import evenements.TEST;
import evenements.ValiderClient;
import client.Client;*/
import fenetre.Fenprinci;
import fenetre.Fenprinci.Classe_Actions_Menu1_1;
import test.Test;

public class Fenclient extends JFrame{
	
	private JButton valider, annuler;
	private JLabel titre, nomlbl, prenomlbl, idlbl, fideletxt;
	private JTextField nomtxt, prenomtxt, idtxt;
	private JCheckBox fidele;
	private DefaultListModel<Client> listeCl;
	private JList<Client> jlistCl;
	private ArrayList<Client> a = new ArrayList<Client>();
	
	
	

	public ArrayList<Client> getA() {
		return a;
	}

	public void setA(ArrayList<Client> a) {
		this.a = a;
	}

	public Fenclient(){
	this.setTitle("Gestion des clients");
	this.setSize(500, 600);
	this.setLocationRelativeTo(null);          
	this.setVisible(true);
	this.setLayout(new GridLayout(1,2));
	
	JPanel panneauA = new JPanel();
	panneauA.setLayout(new GridLayout(3,1));
	
	JPanel panneau1 = new JPanel();
	titre = new JLabel("Ajoutez un client");
	panneau1.add(titre);
	panneauA.add(panneau1);
	
	JPanel panneau2 = new JPanel();
	panneau2.setLayout(new GridLayout(4,1,0,20));	
	nomlbl = new JLabel("Nom :");
	nomtxt = new JTextField(15);
	prenomlbl = new JLabel("Prénom :");
	prenomtxt = new JTextField(15);
	idlbl = new JLabel("Id :");
	idtxt = new JTextField(15);
	fideletxt = new JLabel("Fidèle");
	fidele = new JCheckBox();
	panneau2.add(nomlbl);
	panneau2.add(nomtxt);
	panneau2.add(prenomlbl);
	panneau2.add(prenomtxt);
	panneau2.add(idlbl);
	panneau2.add(idtxt);
	panneau2.add(fideletxt);
	panneau2.add(fidele);
	panneauA.add(panneau2);
	
	JPanel panneau3 = new JPanel();
	valider = new JButton("Valider");
	annuler = new JButton("Annuler");
	panneau3.add(valider);
	panneau3.add(annuler);
	panneauA.add(panneau3);
	
    
	this.add(panneauA);
	
	//appel des événements
	new ValiderClient(this, Test.getFen());
	
	
	
	//pour entrer des caractères uniquement
	nomtxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if(!(Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	
	prenomtxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if(!(Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	
	annuler.addActionListener(new Annuler());
	}


	
	
	class Annuler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}


	public DefaultListModel<Client> getListeCl() {
		return listeCl;
	}

	public void setListeCl(DefaultListModel<Client> listeCl) {
		this.listeCl = listeCl;
	}

	public JTextField getNomtxt() {
		return nomtxt;
	}

	public void setNomtxt(JTextField nomtxt) {
		this.nomtxt = nomtxt;
	}

	public JTextField getPrenomtxt() {
		return prenomtxt;
	}

	public void setPrenomtxt(JTextField prenomtxt) {
		this.prenomtxt = prenomtxt;
	}

	public JTextField getIdtxt() {
		return idtxt;
	}

	public void setIdtxt(JTextField idtxt) {
		this.idtxt = idtxt;
	}

	public JCheckBox getFidele() {
		return fidele;
	}

	public void setFidele(JCheckBox fidele) {
		this.fidele = fidele;
	}

	public JButton getValider() {
		return valider;
	}

	public void setValider(JButton valider) {
		this.valider = valider;
	}

	public JButton getAnnuler() {
		return annuler;
	}

	public void setAnnuler(JButton annuler) {
		this.annuler = annuler;
	}
	public JList<Client> getJlistCl() {
		return jlistCl;
	}

	public void setJlistCl(JList<Client> jlistCl) {
		this.jlistCl = jlistCl;
	}
	
	

}
