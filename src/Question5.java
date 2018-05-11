import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Question5 extends JFrame{
	

	private static final long serialVersionUID = 1L;
	Container pane = this.getContentPane();
	String couleur[] =
	{"green","blue","red","magenta","orange"};
	public  Question5() {
		this.setSize (700 , 150); 	
		this.setTitle("Question 5");
		pane.setLayout(new BorderLayout()) ;
		final JPanel p1=new JPanel();
		 p1.setLayout ( new FlowLayout());
		p1.setBackground ( Color .green ) ;
		JSpinner s = new JSpinner ( new SpinnerListModel (couleur ));
		p1.add( s);
		pane.add(p1, BorderLayout.NORTH);	
		class Traitement2 implements ChangeListener
		{ public void stateChanged (ChangeEvent e )
		{  
			p1.setBackground ( Color .orange ) ;
		}			
		}
		 Traitement2 t2= new  Traitement2();
		 s.addChangeListener(t2);
		
		JPanel p2=new JPanel();
		p2.setLayout ( new FlowLayout ());
		JPanel p21=new JPanel();
		p21.setBackground ( Color .blue ) ;
		JComboBox combo = new JComboBox ();
		combo = new JComboBox ( couleur );
		p21.add( combo );
		p2.add(p21, BorderLayout.WEST);
		

   ////////////////////////////////
		JPanel p22=new JPanel();
		p22.setBackground ( Color .red ) ;
		p22.add( new JSlider (1 ,100 ,50));
		p2.add(p22, BorderLayout.CENTER);
		final JPanel p23=new JPanel();
		
		p23.setBackground ( Color .orange ) ;
		final JRadioButton bGreen = new JRadioButton (" Green ") ;
		final JRadioButton bBlue = new JRadioButton (" Blue ") ;
		final JRadioButton bRed = new JRadioButton (" Red ") ;
		final JRadioButton bMagenta = new JRadioButton (" Magenta ") ;
		final JRadioButton bOrange = new JRadioButton (" Orange ") ;
		ButtonGroup groupe = new ButtonGroup () ;
		groupe . add( bGreen ) ; groupe . add( bBlue ) ;
		groupe . add( bRed ) ; groupe . add( bMagenta ) ;
		groupe . add( bOrange ) ;
		
		p23.add(bGreen);p23.add(bBlue);
		p23.add(bRed);p23.add(bMagenta);p23.add(bOrange);

		p2.add(p23, BorderLayout.EAST);
		pane.add(p2, BorderLayout.CENTER) ;
		///////////////////////////////////////////
		class traitement1 implements ActionListener
		{ public void actionPerformed(ActionEvent e)
		{ if( e.getSource() instanceof JRadioButton){
			if (e.getSource()==bBlue) 
				p23.setBackground ( Color .blue ) ;
				else 
				if (e.getSource()==bGreen) 
				p23.setBackground ( Color .green);
				else 
				if (e.getSource()==bOrange) 
				p23.setBackground ( Color .orange ) ;
				else 
				if (e.getSource()==bRed) 
				p23.setBackground ( Color .red ); 
				else 
				p23.setBackground ( Color .magenta );
		}
				
		} 		
		}
		 traitement1 t= new  traitement1();
		 bBlue.addActionListener(t);
		 bGreen.addActionListener(t);
		 bOrange.addActionListener(t);
		 bRed.addActionListener(t);
		 bMagenta.addActionListener(t);
		 

		JPanel p3=new JPanel();
		p3.setName("panel de saisie" );
		p3.setBackground ( Color .magenta ) ;
		JTextField jtf = new JTextField (" " );
		jtf. setPreferredSize ( new Dimension (150 , 30));
        JLabel label = new JLabel ("Color Name");
        p3.add( label );
        p3.add( jtf );
		pane.add(p3, BorderLayout.SOUTH);
	}
	
	public static void main ( String [] args ) {
		 new Question5().setVisible ( true ) ;
			}

}

