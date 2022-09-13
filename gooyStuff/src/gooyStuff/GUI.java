
package gooyStuff;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	
	public GUI() {
		frame = new JFrame();
		
		button = new JButton("click me");
		button.addActionListener(this);
		//((Object) button).setColor();
		
		label = new JLabel("number of clicks : 0");
		
		panel = new JPanel();	
		panel.setBorder(BorderFactory.createEmptyBorder(20,30,10,30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("number of clicks : " + count);
	}

}
