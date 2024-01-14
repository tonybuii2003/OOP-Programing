import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int checksum = 0;
		String result="";
		Scanner inp = new Scanner(System.in);
		System.out.println("9 digits: ");
		int input = inp.nextInt();
		
		for (int i = 1; i < 10; i++)
		{
			checksum = checksum + (input / (int)Math.pow(10, i-1))%10*(10-i);
		}
		checksum = checksum%11;
		if (checksum != 10)
		{
			if (input<100000000)
				result += "0" + input + checksum;
			else
				result += "" + input + checksum;
		}
		else
		{
			if (input<100000000)
				result += "0" + input + "X";
			else
				result += "" + input + "X";
		}
		System.out.println(result);
		inp.close();
	}

}
