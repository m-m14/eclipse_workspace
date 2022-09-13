package file_comparer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Comparing_files {
	
	private String file1;
	private String file2;
	private JFrame frame;
	private JPanel panel;
	private JLabel title;
	private JLabel fname;
	private JFileChooser first;
	private JButton choose1;
	private JLabel sname;
	private JFileChooser second;
	private JButton choose2;
	
	public Comparing_files() {
		frame = new JFrame();
		
		panel = new JPanel();
		panel.setLayout(null);
		
		title = new JLabel("Insert two different text files");
		title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 20));
		title.setBounds(60,20,300,30);
		panel.add(title);
		
		fname = new JLabel("Insert first file : ");
		fname.setBounds(20,60,150,30);
		panel.add(fname);
		
		first = new JFileChooser();
		first.setBounds(20,90,120,30);
		first.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//first.setVisible(false);
		panel.add(first);
		
		choose1 = new JButton("choose");
		//choose1.setBounds(20,90,150,30);
		choose1.setBounds(30,140,80,30);
		choose1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				first.showOpenDialog(panel);
				//file1 = first.getSelectedFile();
				try {
					Scanner sr = new Scanner(first.getSelectedFile());
					while(sr.hasNextLine()) {
						
						file1 = file1 + sr.nextLine() + "\n";

					}
					System.out.println(file1);
					
				} catch (Exception m) {
					// TODO Auto-generated catch block
					System.out.println(m);
				}
				//System.out.println(first.getSelectedFile());
			}
			
		});
		panel.add(choose1);
		
		
		sname = new JLabel("Insert second file : ");
		sname.setBounds(240,60,150,30);
		panel.add(sname);
		
		second = new JFileChooser();
		second.setBounds(240,90,150,30);
		second.setFileSelectionMode(JFileChooser.FILES_ONLY);
		panel.add(second);
		
		choose2 = new JButton("choose");
		choose2.setBounds(250,140,80,30);
		choose2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				second.showOpenDialog(panel);
				try {
					Scanner sr = new Scanner(second.getSelectedFile());
					while(sr.hasNextLine()) {
						file2 = file2 + sr.nextLine() + "\n";
					}
					System.out.println(file2);
					
				} catch (Exception n) {
					// TODO Auto-generated catch block
					System.out.println(n);
				}
			}
			
		});
		panel.add(choose2);
		
		
		frame.add(panel);
		frame.setSize(400,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Comparing_files();
	}

}
