package randomPasswordGenerator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class RandomPasswordGUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel title;
	private JLabel pw;
	private JButton create;
	private JSlider slider;//120
	private JLabel lg;
	private JLabel min;
	private JLabel max;
	private JCheckBox symornot;
	private JCheckBox numornot;
	int mini;
    int maxi;
    boolean includesyms;
	public RandomPasswordGUI() {
		frame = new JFrame();
		
		frame.setSize(500,500);
		
		panel = new JPanel();
		frame.add(panel,BorderLayout.CENTER);
		
		panel.setSize(200,200);
		panel.setBackground(new Color(60, 171, 89));
		
		title  = new JLabel("Password Generator");
		title.setBounds(100,10,295,30);
		title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 30));
		panel.add(title);
		
		
		min = new JLabel("4");
		min.setBounds(130,160,40,30);
		panel.add(min);
		
		max = new JLabel("16");
		max.setBounds(370,160,40,30);
		panel.add(max);
		
		create = new JButton("Generate");
		create.setBounds(195,60,90,30);
		create.addActionListener(this);
		panel.add(create);
		
		pw = new JLabel("New Password : ");
		pw.setBounds(140,90,250,30);
		panel.add(pw);
		
		lg = new JLabel("Length : 8");
		lg.setBounds(140,130,80,30);
		panel.add(lg);
		
		slider = new JSlider(4,16,8);
		slider.setBounds(130,152,250,30);
		slider.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				lg.setText("length : "+slider.getValue());
			}
		});
		//slider.setOrientation(4);
		//slider.addActionListener(this);
		panel.add(slider);
		
		symornot = new JCheckBox("Include Symbols",true);
		symornot.setBounds(180,200,150,20);
		//panel.add(symornot);
		
		numornot = new JCheckBox("Include Numbers",true);
		numornot.setBounds(180,220,150,20);
		//panel.add(numornot);
		
		panel.setLayout(null);
		frame.setVisible(true);
		//frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomPasswordGUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char[] elements = new char[slider.getValue()];
		String password = "";
		mini=35;
	    maxi = 126;
	    includesyms = true;
	    if(symornot.isSelected() == false) {
	    	mini = 48;
	    	maxi = 122;
	    	includesyms = false;
	    }
		//if(symornot.))
		//iterate through the characters in elements
		for (int i = 0; i < elements.length;i++) {
			//eh = 0
			Random rand = new Random();
			int eh = 0;
			// || (eh >= 91 && eh <= 96) while e < 36 eh = random number between 0 and 126
			while (eh < mini) {
				eh = rand.nextInt(maxi);
			}
			if(includesyms == false) {
				while(eh > 90 && eh < 97) {
					eh = rand.nextInt(maxi);
				}
			}
			//code = eh
			int code = eh;
			//character i = code
			elements[i] = (char) code;
			password = password + Character.toString(elements[i]);
			//System.out.print(elements[i]);
		}
		//System.out.println(password);
		pw.setText("New Password : "+password);
		//System.out.println(slider.getValue());
		
	}

}
