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

import fenetre.Fenstock.Annuler;


public class Fencommande extends JFrame{
	
	private JButton valider, annuler;
	private JLabel titre, idcl, datedeb, datefin, total1, total2, reduction;
	private JTextField idtxt, total_1, total_2, reductiontxt;
	
	public Fencommande(){
	this.setTitle("Ajout commande");
	this.setSize(400, 500);
	this.setLocationRelativeTo(null);          
	this.setVisible(true);
	this.setLayout(new GridLayout(3,1));
	
	JPanel panneau1 = new JPanel();
	titre = new JLabel("Ajouter une commande");
	panneau1.add(titre);
	this.add(panneau1);
	
	JPanel panneau2 = new JPanel();
	panneau2.setLayout(new GridLayout(6,1));	
	idcl = new JLabel("Client : ");
	idtxt = new JTextField();
	datedeb = new JLabel("Du : ");
	//prenomtxt = new JTextField(15);
	datefin = new JLabel("Au : ");
	//idtxt = new JTextField(15);
	total1 = new JLabel("Total : ");
	total_1 = new JTextField(10);
	reduction = new JLabel("Réduction : ");
	reductiontxt = new JTextField(10);
	total2 = new JLabel("Total : ");
	total_2 = new JTextField(10);
	panneau2.add(idcl);
	panneau2.add(idtxt);
	panneau2.add(datedeb);
	//panneau2.add(prenomtxt);
	panneau2.add(datefin);
	//panneau2.add(idtxt);
	panneau2.add(total1);
	panneau2.add(total_1);
	panneau2.add(reduction);
	panneau2.add(reductiontxt);
	panneau2.add(total2);
	panneau2.add(total_2);
	
	
	this.add(panneau2);
	
	JPanel panneau3 = new JPanel();
	valider = new JButton("Valider");
	annuler = new JButton("Annuler");
	panneau3.add(valider);
	panneau3.add(annuler);
	this.add(panneau3);
	
	
	
	annuler.addActionListener(new Annuler());
	}

	class Annuler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
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
}
