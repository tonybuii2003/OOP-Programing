import java.util.Scanner;
	
public class Vowels {
	public static int countVowels(String str) {
		return str.replaceAll("[^aeiouAEIOU]", "").length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = inp.nextLine();
		System.out.println(countVowels(str));
	}

}
