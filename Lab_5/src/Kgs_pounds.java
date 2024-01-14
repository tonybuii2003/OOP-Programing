
public class Kgs_pounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int initialKilo = 0;
		int initialPound = 0;
		System.out.printf("%-5s %-5s %-5s %-5s %n","Kilograms", "Pounds", "Kilograms", "Pounds");
		for (int i = 0; i < 100; i+=1)
		{
			initialKilo = 2*i + 1;
			initialPound = 5*i + 20;
			System.out.printf("%-9d %-6.1f %-9d %-9.2f %n", initialKilo, initialKilo*2.2, initialPound, initialPound/2.2);
		}
	}

}
