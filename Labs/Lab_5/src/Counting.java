import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countPositive, countNegative;
		float average = 0;
		countPositive = 0;
		countNegative = 0;
		int i = 0;
		int total = 0;
		Scanner inp = new Scanner(System.in);
		
		int num = -1;
		while (num != 0)
		{
			System.out.println("Input: ");
			num = inp.nextInt();
			if (num > 0)
			{
				countPositive++;
				total+=num;
			}
			if (num<0)
			{
				countNegative++;
				total+=num;
			}
			else if (num == 0)
			{
				average = total/(countPositive+countNegative);
				System.out.println("The amount of positive numbers: " + countPositive);
				System.out.println("The amount of negative numbers: " + countNegative);
				System.out.println("Total: " + total);
				System.out.println("Average: " + average);
			}
		}
		inp.close();
	}

}
