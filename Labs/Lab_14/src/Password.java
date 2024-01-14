import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String pass = inp.next();
		if (pass.length() < 8)
			System.out.println("Invalid password");
		else {
			boolean upper=false,lower=false, number=false, special=false;
			for (int i = 0; i<pass.length();i++) {
				String p = pass.substring(i,i+1);
				if (p.matches("[a-z]{1}")) 
					lower = true;
				if (p.matches("[A-Z]{1}"))
					upper = true;
				if (p.matches("[\\d]{1}"))
					number = true;
				if (p.matches("[!@#$%^&*]{1}"))
					special = true;
			}
			if (lower && number && upper && special) {
				System.out.println("valid password");
			}
			else {
				System.out.println("invalid passpord");
			}
			
		}
	}

}
