package loginGooy;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginGUI implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel l2;
	private JTextField text;
	public LoginGUI() {
		frame = new JFrame();
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0, 1));
		l2 = new JLabel("enter your nickname : ");
		text = new JTextField();
		JButton button = new JButton("submit");
		button.addActionListener(this);
		label = new JLabel();
		panel.add(l2);
		panel.add(text);
		panel.add(button);
		panel.add(label);
		
		frame.add(panel , BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText("hello there,"+text.getText());
	}

}
