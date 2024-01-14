import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScoreProcessor {
	public static void main(String[] args) throws FileNotFoundException{
		int numScores = 0;
		int total = 0;
		String filename = args[0];
		File file = new File ("./" + filename);
		Scanner inp = new Scanner(file);
		while (inp.hasNextLine() && inp.hasNextInt()) {
			int num = inp.nextInt();
			total += num;
			numScores++;
		}
		System.out.println("Total: " + total);
		System.out.println("Averge: " + total * 1.0/numScores);
	}
}
