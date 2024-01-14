import java.util.Scanner;

public class LongestCommonPrefix {
public static String compareStr(String str1, String str2) {
	if (str1.length() < str2.length())
		return str1;
	else
		return str2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		Scanner inp = new Scanner(System.in);
		System.out.println("String 1: ");
		String str1 = inp.nextLine();
		System.out.println("String 2: ");
		String temp = "";
		String str2 = inp.nextLine();
		String temp2 = "";
		String result = "";
		String str  = compareStr(str1,str2);
		// create a new string which stores the prefix, the loop runs until 2 string is no longer equal
		for (int i = 0; i<=str.length()-1; i++) {
			temp += str1.substring(i,i+1);
			temp2 += str2.substring(i,i+1);
			
			if ((temp.equals(temp2))) {
				result = temp;
			}
			else {
				break;
			}
		}
		if (result.length() == 0) {
			result =(str1 + " and " + str2 + " have no common prefix.");
		}
		System.out.print(result);
		inp.close();
		}
		
}
