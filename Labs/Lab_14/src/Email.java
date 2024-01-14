import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter email: ");
		String email = inp.next();
		
		if (email.matches("(.)+@(.)+"))
			System.out.println("Valid email");
		else 
			System.out.println("Invalid email");
	}

}
