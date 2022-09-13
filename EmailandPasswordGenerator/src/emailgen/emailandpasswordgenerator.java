package emailgen;
import java.util.Scanner;
public class emailandpasswordgenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter your last name : ");
		String lname = sr.next();
		for(int i = 0;i < lname.length();i++) {
			int code = (int) lname.toUpperCase().charAt(i);
			while (code < 65 || code > 90) {
				System.out.println("That's not a valid name : ");
				lname = sr.next();
				code = (int) lname.toUpperCase().charAt(i);
			}
		}
		System.out.println("Enter the name of your department : ");
		String dep = sr.next();
		String email = lname + "@" + dep + ".com";
		System.out.println(email);
		System.out.println("Pick an option to set up password : ");
		System.out.println("a.set your own password");
		System.out.println("b.generate random password");
		String opt = sr.next();
		String password;
		if(opt.toLowerCase().equals("a")) {
			System.out.println("Set password : ");
			while(sr.next().length() < 8) {
				System.out.println("Password length should be atleast 8! : ");
			}
			password = sr.next();
		}
		if(opt.toLowerCase().equals("b")) {
			System.out.println("Im too noobish to do that rn");
		}
	}
}
