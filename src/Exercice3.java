import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Exercice3 {

	private JFrame frame;
	public int click;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercice3 window = new Exercice3();
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
	public Exercice3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 147);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		String click = null;
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				int click = 0;
				click++;
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP2_Swing\\images\\android.png"));
		btnNewButton.setBounds(67, 35, 144, 33);
		panel.add(btnNewButton);
		
		JLabel label = new JLabel();
		label.setText(click);
		label.setBounds(67, 54, 46, 14);
		panel.add(label);
		
		JButton button = new JButton("");
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon("C:\\Users\\Walim\\eclipse-workspace\\TP2_Swing\\images\\apple.png"));
		button.setBounds(221, 35, 144, 33);
		panel.add(button);
	}
}
