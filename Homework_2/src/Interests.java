import java.util.Scanner;

public class Interests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		Scanner inp = new Scanner(System.in);
		System.out.println("Input loan amount: ");
		int loanAmount = inp.nextInt();
		System.out.println("Input year: ");
		int numberOfYears = inp.nextInt();
		System.out.printf("%10s %10s %10s %n","Interest Rate", "Monthly Payment", "Total Payment");
		// Create a table using for loop 
		for (double annualInterestRate = 5; annualInterestRate<=8; annualInterestRate+=(1.0/8.0)) {
			double monthlyInterestRate = annualInterestRate / 1200;

			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));

			double totalPayment = monthlyPayment * numberOfYears * 12; 
		System.out.printf("%1.3f%% %14.2f %16.2f %n",annualInterestRate, monthlyPayment, totalPayment);
		}
		inp.close();
		
	}

}
