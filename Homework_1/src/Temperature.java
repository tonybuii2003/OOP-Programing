/*
 * Name: Phi Long Bui
 * SBU ID: 14555975
 */
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter a temperature between -58 Fahrenheit and 41 Fahrenheit and a wind speed greater than or equal to 2 then displays the wind-chill temperature:  ");
	System.out.println("Enter temperature: ");
	int t_a = inp.nextInt();
	System.out.println("Enter speed: ");
	int v = inp.nextInt();
	
	double t_wc = 35.74 + 0.6215 * t_a - 35.75 * Math.pow(v, 0.16)+0.4275 * t_a * Math.pow(v,0.16);
	System.out.println(t_wc);
	inp.close();
	}
	
}
