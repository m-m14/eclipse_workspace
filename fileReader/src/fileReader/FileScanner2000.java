package fileReader;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileScanner2000 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stu
		File file = new File("/Users/Meme/Desktop/captmidn.txt");
		Scanner sr = new Scanner(file);
		
		String fileContent = "";
		
		while(sr.hasNextLine()) {
			fileContent = fileContent.concat(sr.nextLine());
		}
		
		System.out.println(fileContent);
		String jane = "jane bingley bennet";
		
		FileWriter writer = new FileWriter("/Users/Meme/Desktop/newFile.txt");
		
		writer.write(fileContent);
	}

}
