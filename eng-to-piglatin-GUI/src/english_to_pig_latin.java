import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class english_to_pig_latin {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel engintro;
	private JTextArea eng;
	private JLabel plintro;
	private JTextArea pl;
	
	public english_to_pig_latin() {
		frame = new JFrame("English to pig latin converter");
		frame.setSize(700,400);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 179, 226));
		frame.add(panel);
		
		engintro = new JLabel("Enter English : ");
		engintro.setBounds(120,10,100,20);
		panel.add(engintro);
		
		eng = new JTextArea();
		eng.setBackground(new Color(255,255,255));
		eng.setBounds(10,40,300,200);
		panel.add(eng);
		
		plintro = new JLabel("Pig Latin : ");
		plintro.setBounds(420,10,100,20);
		panel.add(plintro);
		
		pl = new JTextArea();
		pl.setBackground(new Color(255,255,255));
		pl.setBounds(380,40,300,200);
		pl.setEditable(false);
		panel.add(pl);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new english_to_pig_latin();
	}

}
