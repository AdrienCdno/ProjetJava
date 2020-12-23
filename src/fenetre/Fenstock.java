package fenetre;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import client.Client;
import evenements.ClicDictionnaire;
import evenements.ClicDocument;
import evenements.ClicLivre;
import evenements.ClicLivreType;
import evenements.ClicSupportNumerique;
import evenements.ClicSupportNumeriqueType;
import evenements.ValiderClient;
import evenements.ValiderProduit;
import fenetre.Fenclient.Annuler;
import produit.Produit;
import test.Test;

/*import evenements.AnnulerClient;
import evenements.ClicDictionnaire;
import evenements.ClicDocument;
import evenements.ClicLivre;
import evenements.ClicLivreType;
import evenements.ClicSupportNumerique;
import evenements.ClicSupportNumeriqueType;
import evenements.SuppClient;
import evenements.TEST;
import evenements.ValiderClient;
import client.Client;*/

public class Fenstock extends JFrame{
	
	private JButton valider, annuler, supprimer;
	private JLabel id, titre, tarifj, quantite, auteur, langue, annee, real;
	private JTextField idtxt, titretxt, tarifjtxt, quantitetxt, auteurtxt, languetxt, anneetxt, realtxt;
	private DefaultListModel<Produit> listeProd;
	private JList<Produit> jlistProd;
	private JComboBox<String> cb1, cb2, cb3, cb4;
	private String[] item1 = {"","Document","Support Numérique"};
	private String[] item2 = {"","CD","DVD"};
	private String[] item3 = {"","Livre","Dictionnaire"};
	private String[] item4 = {"","BD","Manuel Scolaire","Roman"};
	

	


	public Fenstock(){
	this.setTitle("Gestion du stock de la vidéothèque");
	this.setSize(700, 600);
	this.setLocationRelativeTo(null);          
	this.setVisible(true);
	this.setLayout(new GridLayout(1,2));
	
	
	JPanel pA = new JPanel();
	pA.setLayout(new GridLayout(4,1));
	
	
	JPanel p1 = new JPanel();
	titre = new JLabel("Ajoutez un produit au stock");
	p1.add(titre);
	pA.add(p1);
	
	
	JPanel p2 = new JPanel();
	//p2.setLayout(new GridLayout(8,2,0,20));	
	cb1 = new JComboBox<String>(item1);
    cb2 = new JComboBox<String>(item2);
    cb2.setVisible(false);
    cb3 = new JComboBox<String>(item3);
    cb3.setVisible(false);
    cb4 = new JComboBox<String>(item4);
    cb4.setVisible(false);
    p2.add(cb1);
    p2.add(cb2);
    p2.add(cb3);
    p2.add(cb4);
    pA.add(p2);
	
    JPanel p3 = new JPanel();
    titre = new JLabel("Titre: ");
    titretxt = new JTextField(10);
    tarifj = new JLabel("Tarif journalier:");
    tarifjtxt = new JTextField(5);
    quantite = new JLabel("Quantité: ");
    quantitetxt = new JTextField(10);
    auteur = new JLabel("Auteur: ");
    auteurtxt = new JTextField(10);
    langue = new JLabel("Langue: ");
    languetxt = new JTextField(10);
    annee = new JLabel("Année de sortie: ");
    anneetxt = new JTextField(5);
    real = new JLabel("Réalisateur: ");
    realtxt = new JTextField(10);
    titre.setVisible(false);
    titretxt.setVisible(false);
    tarifj.setVisible(false);
    tarifjtxt.setVisible(false);
    quantite.setVisible(false);
    quantitetxt.setVisible(false);
    auteur.setVisible(false);
    auteurtxt.setVisible(false);
    langue.setVisible(false);
    languetxt.setVisible(false);
    annee.setVisible(false);
    anneetxt.setVisible(false);
    real.setVisible(false);
    realtxt.setVisible(false);
	p3.add(titre);
	p3.add(titretxt);
	p3.add(tarifj);
	p3.add(tarifjtxt);
	p3.add(quantite);
	p3.add(quantitetxt);
	p3.add(auteur);
	p3.add(auteurtxt);
	p3.add(langue);
	p3.add(languetxt);
	p3.add(annee);
	p3.add(anneetxt);
	p3.add(real);
	p3.add(realtxt);
	pA.add(p3);
    
    
    JPanel p4 = new JPanel();
	valider = new JButton("Valider");
	annuler = new JButton("Annuler");
	supprimer = new JButton("Supprimer");
	p4.add(valider);
	p4.add(annuler);
	//p4.add(supprimer);
	pA.add(p4);
	
	
	this.add(pA);
	
	new ClicSupportNumerique(this);
	new ClicDocument(this);
	new ClicLivre(this);
	new ClicSupportNumeriqueType(this);
	new ClicDictionnaire(this);
	new ClicLivreType(this);
	new ValiderProduit(this, Test.getFen());
	annuler.addActionListener(new Annuler());
	

	
	//pour entrer des caractères uniquement
	auteurtxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if(!(Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	
	languetxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if(!(Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	
	realtxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if(!(Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	
	//pour ne pas entrer de caractères
	tarifjtxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if((Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	quantitetxt.addKeyListener(new java.awt.event.KeyAdapter() { 
	     public void keyTyped(java.awt.event.KeyEvent evt) { 

	     if((Character.isLetter(evt.getKeyChar()))){ 
	       evt.consume(); 
	      } 
	     } 
	    });
	}

	class Annuler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
	
	public JTextField getQuantitetxt() {
		return quantitetxt;
	}


	public void setQuantitetxt(JTextField quantitetxt) {
		this.quantitetxt = quantitetxt;
	}


	public JButton getValider() {
		return valider;
	}


	public void setValider(JButton valider) {
		this.valider = valider;
	}


	public String[] getItem2() {
		return item2;
	}


	public void setItem2(String[] item2) {
		this.item2 = item2;
	}


	public JComboBox<String> getCb2() {
		return cb2;
	}


	public void setCb2(JComboBox<String> cb2) {
		this.cb2 = cb2;
	}


	public JComboBox<String> getCb1() {
		return cb1;
	}


	public void setCb1(JComboBox<String> cb1) {
		this.cb1 = cb1;
	}


	public String[] getItem1() {
		return item1;
	}


	public void setItem1(String[] item1) {
		this.item1 = item1;
	}
	
	public JComboBox<String> getCb3() {
		return cb3;
	}


	public void setCb3(JComboBox<String> cb3) {
		this.cb3 = cb3;
	}


	public String[] getItem3() {
		return item3;
	}


	public void setItem3(String[] item3) {
		this.item3 = item3;
	}


	public String[] getItem4() {
		return item4;
	}


	public void setItem4(String[] item4) {
		this.item4 = item4;
	}
	
	public JComboBox<String> getCb4() {
		return cb4;
	}


	public void setCb4(JComboBox<String> cb4) {
		this.cb4 = cb4;
	}
	
	public JLabel getId() {
		return id;
	}


	public void setId(JLabel id) {
		this.id = id;
	}


	public JLabel getTitre() {
		return titre;
	}


	public void setTitre(JLabel titre) {
		this.titre = titre;
	}


	public JLabel getTarifj() {
		return tarifj;
	}


	public void setTarifj(JLabel tarifj) {
		this.tarifj = tarifj;
	}


	public JLabel getAuteur() {
		return auteur;
	}


	public void setAuteur(JLabel auteur) {
		this.auteur = auteur;
	}


	public JLabel getLangue() {
		return langue;
	}


	public void setLangue(JLabel langue) {
		this.langue = langue;
	}


	public JLabel getAnnee() {
		return annee;
	}


	public void setAnnee(JLabel annee) {
		this.annee = annee;
	}


	public JLabel getReal() {
		return real;
	}


	public void setReal(JLabel real) {
		this.real = real;
	}


	public JTextField getIdtxt() {
		return idtxt;
	}


	public void setIdtxt(JTextField idtxt) {
		this.idtxt = idtxt;
	}


	public JTextField getTitretxt() {
		return titretxt;
	}


	public void setTitretxt(JTextField titretxt) {
		this.titretxt = titretxt;
	}


	public JTextField getTarifjtxt() {
		return tarifjtxt;
	}


	public void setTarifjtxt(JTextField tarifjtxt) {
		this.tarifjtxt = tarifjtxt;
	}


	public JTextField getAuteurtxt() {
		return auteurtxt;
	}


	public void setAuteurtxt(JTextField auteurtxt) {
		this.auteurtxt = auteurtxt;
	}


	public JTextField getLanguetxt() {
		return languetxt;
	}


	public void setLanguetxt(JTextField languetxt) {
		this.languetxt = languetxt;
	}


	public JTextField getAnneetxt() {
		return anneetxt;
	}


	public void setAnneetxt(JTextField anneetxt) {
		this.anneetxt = anneetxt;
	}


	public JTextField getRealtxt() {
		return realtxt;
	}


	public void setRealtxt(JTextField realtxt) {
		this.realtxt = realtxt;
	}
	
	public DefaultListModel<Produit> getListeProd() {
		return listeProd;
	}


	public void setListeProd(DefaultListModel<Produit> listeProd) {
		this.listeProd = listeProd;
	}


	public JList<Produit> getJlistProd() {
		return jlistProd;
	}


	public void setJlistProd(JList<Produit> jlistProd) {
		this.jlistProd = jlistProd;
	}


	public JLabel getQuantite() {
		return quantite;
	}


	public void setQuantite(JLabel quantite) {
		this.quantite = quantite;
	}

}