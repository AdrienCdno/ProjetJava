package fenetre;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import client.Client;
import client.StockClient;
import commande.Commande;
import commande.Emprunt;
import evenements.SuppClient;
import evenements.SuppProduit;
import produit.Produit;
import produit.StockProd;

public class Fenprinci extends JFrame {
	//attributs pour le menu
	private JMenuBar menuBar = new JMenuBar();
	private JMenu test1 = new JMenu("Produits");
	private JMenu test2 = new JMenu("Clients");
	private JMenu test3 = new JMenu("Commandes");
	private JMenu test4 = new JMenu("Aide");

	private JMenuItem item1_1 = new JMenuItem("Ajouter");
	private JMenuItem item1_2 = new JMenuItem("Modifier");
	private JMenuItem item1_3 = new JMenuItem("Supprimer");
	
	private JMenuItem item2_1 = new JMenuItem("Ajouter");
	private JMenuItem item2_2 = new JMenuItem("Modifier");
	private JMenuItem item2_3 = new JMenuItem("Supprimer");
	
	private JMenuItem item3_1 = new JMenuItem("Ajouter");
	private JMenuItem item3_2 = new JMenuItem("Modifier");
	private JMenuItem item3_3 = new JMenuItem("Supprimer");
	private JMenuItem item4 = new JMenuItem("Aidez-moi");
	//fin attributs menu
	
	private DefaultListModel<Client> listeCl;
	private JList<Client> jlistCl;
	
	private DefaultListModel<Produit> listeProd;
	private JList<Produit> jlistProd;
	
	private DefaultListModel<Emprunt> listeCde;
	private JList<Emprunt> jlistCde;

	
	JLabel title1 = new JLabel("Liste des produits :");
	JLabel title2 = new JLabel("Liste des clients :");
	JLabel title3 = new JLabel("Les commandes :");

	
	public Fenprinci(){  
		setTitle("La Videotheque IUT Metz");
		setSize(new Dimension(1000,700));
		setLocationRelativeTo(null);               
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		JPanel pan1 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan2 = new JPanel();
		
		pan1.add(title1,BorderLayout.NORTH);
		pan2.add(title2,BorderLayout.NORTH);
		pan3.add(title3,BorderLayout.NORTH);
		// on initialise la grille de Layout
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.weighty=1;	// les grilles prennent 1 case de hauteur
		
		
		pan1.setBorder(BorderFactory.createLineBorder(Color.black));
		pan2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		pan3.setBackground(Color.lightGray);
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx=1;	//la case fait 1 de large
		add(pan1,gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.weightx = 2;	// la case fait 2 de large
		add(pan3,gc);
		
		gc.gridx = 4;
		gc.gridy = 0;
		gc.weightx=1;
		add(pan2,gc);
		
		
		setVisible(true);
		//la barre du menu
		test1.add(item1_1);
		test1.add(item1_2);
		test1.add(item1_3);
		
		test2.add(item2_1);
		test2.add(item2_2);
		test2.add(item2_3);
		
		test3.add(item3_1);
		test3.add(item3_2);
		test3.add(item3_3);
		test4.add(item4);
		menuBar.add(test1);
		menuBar.add(test2);
		menuBar.add(test3);
		menuBar.add(test4);
		setJMenuBar(menuBar);
		// fin barre menu
		setVisible(true);
		
		//création de la zone de liste des clients
		listeCl = new DefaultListModel<Client>();
		for(Client cl : StockClient.getListeCl()) listeCl.addElement(cl);
	    jlistCl = new JList<Client>(listeCl); 
	    JScrollPane listscrollerCl = new JScrollPane(jlistCl);
	    listscrollerCl.setPreferredSize(new Dimension(200,500));
	    pan2.add(listscrollerCl, BorderLayout.CENTER);
	    
	    //création de la zone de liste des produits
	  	listeProd = new DefaultListModel<Produit>();
	  	for(Produit p : StockProd.getAl()) listeProd.addElement(p);
	  	jlistProd = new JList<Produit>(listeProd); 
	    JScrollPane listscrollerProd = new JScrollPane(jlistProd);
	    listscrollerProd.setPreferredSize(new Dimension(200,500));
	    pan1.add(listscrollerProd, BorderLayout.CENTER);
		
	    //création de la zone de liste des commandes
	  	listeCde = new DefaultListModel<Emprunt>();
	  	for(Emprunt cde : Commande.getCde()) listeCde.addElement(cde);
	  	jlistCde = new JList<Emprunt>(listeCde); 
	    JScrollPane listscrollerCde = new JScrollPane(jlistCde);
	    listscrollerCde.setPreferredSize(new Dimension(200,500));
	    pan3.add(listscrollerCde, BorderLayout.CENTER);
		
		// on ajoute l'item d'action a la classe
		
		 item1_1.addActionListener(new Classe_Actions_Menu1_1());
		 //item1_2.addActionListener(new Classe_Actions_Menu1_2());
		 //item1_3.addActionListener(new Classe_Actions_Menu1_3());
		 item2_1.addActionListener(new Classe_Actions_Menu2_1());
		// item2_2.addActionListener(new Classe_Actions_Menu2_2());
		// item2_3.addActionListener(new Classe_Actions_Menu2_3());
		 item3_1.addActionListener(new Classe_Actions_Menu3_1());
		// item3_2.addActionListener(new Classe_Actions_Menu3_2());
		// item3_3.addActionListener(new Classe_Actions_Menu3_3());
		 item4.addActionListener(new Classe_Actions_Menu4());
		 
		//appel des événements
		 new SuppClient(this);
		 new SuppProduit(this);
		 
	}
	
	public JMenuItem getItem1_3() {
		return item1_3;
	}

	public void setItem1_3(JMenuItem item1_3) {
		this.item1_3 = item1_3;
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

	public JMenuItem getItem2_3() {
		return item2_3;
	}

	public void setItem2_3(JMenuItem item2_3) {
		this.item2_3 = item2_3;
	}

	public JList<Client> getJlistCl() {
		return jlistCl;
	}

	public void setJlistCl(JList<Client> jlistCl) {
		this.jlistCl = jlistCl;
	}

	public DefaultListModel<Client> getListeCl() {
		return listeCl;
	}
	public void setListeCl(DefaultListModel<Client> listeCl) {
		this.listeCl = listeCl;
	}
	
	public DefaultListModel<Emprunt> getListeCde() {
		return listeCde;
	}

	public void setListeCde(DefaultListModel<Emprunt> listeCde) {
		this.listeCde = listeCde;
	}

	public JList<Emprunt> getJlistCde() {
		return jlistCde;
	}
	
	public void setJlistCde(JList<Emprunt> jlistCde) {
		this.jlistCde = jlistCde;
	}

	// on appelle la classe qui va écouter l'event
	class Classe_Actions_Menu1_1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Fenstock fen1 = new Fenstock();
		}
	}
	/*class Classe_Actions_Menu1_2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenModifProd fen1 = new FenModifProd();
		}
	}
	class Classe_Actions_Menu1_3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenSupprProd fen1 = new FenSupprProd();
		}
	}*/
	class Classe_Actions_Menu2_1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Fenclient fen1 = new Fenclient();
		}
	}
	/*class Classe_Actions_Menu2_2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenModifCl fen1 = new FenModifCl();
		}
	}
	class Classe_Actions_Menu2_3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenSupprCl fen1 = new FenSupprCl();
		}
	}*/
	class Classe_Actions_Menu3_1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Fencommande fen1 = new Fencommande();
		}
	}
	/*class Classe_Actions_Menu3_2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenModifCde fen1 = new FenModifCde();
		}
	}
	class Classe_Actions_Menu3_3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenSupprCde fen1 = new FenSupprCde();
		}
	}*/
	class Classe_Actions_Menu4 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			FenAide fen1 = new FenAide();
		}
	}

}