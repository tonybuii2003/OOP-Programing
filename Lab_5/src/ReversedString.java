import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Input the String:");
		String str = inp.nextLine();
		String newStr="";
		for (int i = str.length()-1; i>=0; i--)
		{
			newStr+= str.substring(i,i+1);
		}
		System.out.println(newStr);
		inp.close();
	}

}
