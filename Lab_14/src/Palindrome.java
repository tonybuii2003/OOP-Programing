import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = inp.next();
		boolean isPali = true;
		int lastIndex =string.length() - 1;
		for (int i = 0; i < string.length()/2; i++) {
			if (!string.substring(i,i+1).equals(string.substring(lastIndex,lastIndex+1))) {
				isPali = false;
				break;
			}
			lastIndex--;
		}
		if (isPali) {
			System.out.println("The string is Palindrome");
		}
		else {
			System.out.println("The string is not Palindrome");
		}
	}

}
