package making_texts_sound_stupid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Making_texts_stupid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your text : ");
		
		
		
		String[] texts = scan.nextLine().split(" ");
		
		String[] stupid_texts = new String[texts.length];
		
		for (int i = 0;i < texts.length;i++) {
			stupid_texts[i] = makeStupid(texts[i]);
			
			System.out.print(stupid_texts[i] + " ");
		}
		
		
		
		
		
	}
	public static String makeStupid(String text) {
		char[] stupid_text = new char[text.length()];
		
		int[] random_letters;
		
		String stupid_word = "";
		
		random_letters = new int[(int) (Math.floor(text.length()/2))];
		
		
		for (int i = 0; i < random_letters.length; i++) {
			int random_integer = new Random().nextInt(0, text.length());
			
			for (int j = 0;j < random_letters.length;j++) {
				while (random_integer == random_letters[j]) {
					random_integer = new Random().nextInt(0, text.length());
				}
			}
			
			random_letters[i] = random_integer;
			//System.out.println(random_integer);
			//System.out.println(random_letters[i]);
			
		}
		
		for (int i = 0;i < text.length();i++) {
			
			boolean lol = false;
			for(int j = 0; j < random_letters.length; j++) {
				if (i == random_letters[j]) {
					lol = true;
				}
			}
			if (lol == true){
				stupid_text[i] = Character.toUpperCase(text.charAt(i));
			}
			else {
				stupid_text[i] = text.charAt(i);
			}
			
			stupid_word = stupid_word + stupid_text[i];
		}
		
		return stupid_word;
		
		
	}

}
