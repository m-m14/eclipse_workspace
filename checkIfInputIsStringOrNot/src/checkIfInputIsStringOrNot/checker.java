/**
 * 
 */
package checkIfInputIsStringOrNot;
import java.util.Scanner;
/**
 * @author Meme
 *
 */
public class checker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = sr.next();
		for(int i = 0;i < input.length();i++) {
			int code = (int) input.toUpperCase().charAt(i);
			while (code < 65 || code > 90) {
				System.out.println("Enter a STRING : ");
				input = sr.next();
				code = (int) input.toUpperCase().charAt(i);
			}
		}
		System.out.println("You passed the string test");
	}
}
