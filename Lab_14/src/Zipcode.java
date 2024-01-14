import java.util.Scanner;

public class Zipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter zipcode: ");
		String zip = inp.next();
		
		if (zip.matches("[0-9]{5}"))
			System.out.println("Valid zipcode");
		else
			System.out.println("Invalid zipcode");
	}

}
