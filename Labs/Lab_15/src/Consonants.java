import java.util.Scanner;

public class Consonants {
	public static int countConsonants(String str) {
		String l = str.replaceAll("[^a-z,A-Z]","");
		return l.length()-l.replaceAll("[^aeiouAEIOU]","").length();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = inp.nextLine();
		System.out.print(countConsonants(str));
	}

}
