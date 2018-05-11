import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Exercice4 {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercice4 window = new Exercice4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercice4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 355, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mnNewMenu.add(mntmOuvrir);
		
		JMenuItem mntmSauver = new JMenuItem("Sauver");
		mnNewMenu.add(mntmSauver);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.setAction(action);
		mnNewMenu.add(mntmQuitter);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Quitter");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			JOptionPane confirmation = new JOptionPane();
	        int i=JOptionPane.showConfirmDialog(null, "Vous allez quitter la page. Êtes-vous sûr de vouloir continuer?",
	                                    "Veuillez confirmer votre choix",
	                                    JOptionPane.YES_NO_OPTION);
	        if(i==0){
	        	System.exit(0);
	        }
	}
}
}
