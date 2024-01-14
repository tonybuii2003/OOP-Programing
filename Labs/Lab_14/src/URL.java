import java.util.Scanner;

public class URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a url: ");
		String url = inp.next();
		
		if (url.matches("http[s]{0,1}://www.(.){2,}\\.(.){2,3}"))
			System.out.println("Valid url");
		else
			System.out.println("Invalid url");
	}

}
