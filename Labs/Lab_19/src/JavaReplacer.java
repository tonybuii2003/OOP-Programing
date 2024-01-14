import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaReplacer {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String name = args[0];
		File file = new File("./" + name);
		File file2 = new File("./" + name.replace(".txt", "") + "toHTML.txt");
		Scanner in = new Scanner(file);
		PrintWriter writer = new PrintWriter(file2);
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String replace = line.replace("Java", "HTML");
			writer.print(replace + "\n");
		}
		writer.close();
		in.close();
	}
	

}
