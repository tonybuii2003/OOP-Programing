
public class EliminateDuplicates {
	public static String eliminateDuplicates(String str) {
		int count = 0;
		boolean in = false;
		String temp = "";
		for (int i = 0; i<str.length(); i++) {
			for (int j = 0; j<count; j++) {
				if (temp.charAt(j) == str.charAt(i)) {
					in = true;
					break;
				}
			}
			if (!in) {
				
				temp+=str.charAt(i);
				count++;
			}
			in = false;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eliminateDuplicates("toyynny"));
		System.out.println(eliminateDuplicates("abracadabra")); //returns abrcd

		System.out.println(eliminateDuplicates("Stony Brook University")); //returns Stony BrkUives

		System.out.println(eliminateDuplicates("This is a test sentence.")); //returns This atenc.
	}

}
