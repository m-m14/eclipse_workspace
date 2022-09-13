/**
 * 
 */
package nameEchoer;
import java.util.Scanner;
/**
 * @author Meme
 *
 */
public class echoaName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = sr.next();
		for(int i = 0;i < firstName.length();i++) {
			int code = (int) firstName.toUpperCase().charAt(i);
			while (code < 65 || code > 90) {
				System.out.println("Enter a STRING : ");
				firstName = sr.next();
				code = (int) firstName.toUpperCase().charAt(i);
			}
		}
		System.out.println("Enter your last name : ");
		String lastName = sr.next();
		for(int i = 0;i < lastName.length();i++) {
			int code = (int) lastName.toUpperCase().charAt(i);
			while (code < 65 || code > 90) {
				System.out.println("Enter a STRING : ");
				lastName = sr.next();
				code = (int) lastName.toUpperCase().charAt(i);
			}
		}
		System.out.println(firstName + " " + lastName.toUpperCase());
	}

}