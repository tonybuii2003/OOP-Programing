/*
 * Name: Phi Long Bui
 * SBU ID: 14555975
 */
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("No. 1 side: ");
		int side1 = inp.nextInt();
		System.out.println("No. 2 side: ");
		int side2 = inp.nextInt();
		System.out.println("No. 3 side: ");
		int side3 = inp.nextInt();
		
		if (side1 == side2 && side2 == side3)
			System.out.println("Equilateral");
		if (side1 + side2 > side3 && side2+side3 > side1 && side1 + side3 > side2)
		{
			if (side1 != side2 || side1 != side3 || side2 != side3)
			{
				if(side1 == side2 || side1 == side3 || side2 == side3)
				{
					System.out.println("Isosceles");
				} 
				else
				{
					System.out.println("Scalene");
				}
			}
		} else {
			System.out.println("Invalid input!");
		}
		inp.close();
	}

}
