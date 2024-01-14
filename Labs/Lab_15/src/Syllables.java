import java.util.ArrayList;
import java.util.Scanner;

public class Syllables {
	public static int countSyllable(String str) {
		int count = 0;
		boolean preVouel = false;
		for (int i = 0; i<str.length(); i++) {
			if ("^[aeiouAEIOU]".indexOf(str.charAt(i)) != -1) {
				if (preVouel) {
					System.out.println(str.substring(i-1,i+1));
					preVouel = false;
					count++;
				}
				else {
					preVouel = true;
					}
				}
			else {
				if (preVouel) {
					System.out.println(str.charAt(i-1));
					preVouel = false;
					count++;
				}
			}
		}
		if (preVouel) {
			System.out.println(str.charAt(str.length()-1));
			preVouel = false;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = inp.nextLine();
		System.out.println(countSyllable(str));
		}

}
