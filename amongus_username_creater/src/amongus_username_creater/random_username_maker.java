package amongus_username_creater;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class random_username_maker implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel header;
	private JButton generate;
	private JLabel username;
	private static String usrname;
	public random_username_maker() {
		frame = new JFrame();
		frame.setSize(700,500);
		
		panel = new JPanel();
		panel.setBackground(new Color(0,164,204));
		
		header = new JLabel("Create a Fun Username For Yourself!");
		header.setBounds(70,20,600,50);
		header.setFont(new Font("font", Font.BOLD, 30));
		
		generate = new JButton();
		generate.setBounds(250,200,200,50);
		generate.setText("<html><h2>Generate</h2></html>");
		generate.setBackground(Color.ORANGE);
		generate.addActionListener(this);
		panel.add(generate);
		
		username = new JLabel("");
		panel.add(username);
		
		panel.setLayout(null);
		panel.add(header);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.pack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new random_username_maker();
		//System.out.println(usrname);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		username.setBounds(300,270,200,50);
		String adj[] = {"dry","fluffy","blue","rare","shiny","purple"};
		String noun[] = {"rose","candy","plate","chair","chair","princess"};
		int rnd = new Random().nextInt(adj.length);
		int rand = new Random().nextInt(noun.length);
		usrname = adj[rnd] +" "+noun[rand];
		username.setText("<html><h2><em>"+usrname+"</em></h2></html>");
		
		if(usrname.length() > 11) {
			username.setBounds(290,270,200,50);
		}
		
		}

}
