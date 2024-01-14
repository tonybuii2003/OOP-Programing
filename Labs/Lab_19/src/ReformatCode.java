import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class ReformatCode {
	public static void main (String[] agrs) throws FileNotFoundException{
		String fileName = agrs[0];
		File file = new File("./" + fileName);
		Scanner inp = new Scanner(file);
		File file2 = new File("./" + fileName.replace(".java", "") + "2.java");
		PrintWriter writer = new PrintWriter(file2);
		String prevLine = "";
		boolean writePrev = false;
		
		while (inp.hasNextLine()) {
			if (writePrev) writer.write(prevLine);
			String line = inp.nextLine();
			if (line.matches("[ \t]*\\{")) {
				writer.write(" {\n");
				writePrev = false;
				
			}
			else {
				if (writePrev) writer.write("\n");
				prevLine = line;
				writePrev = true;
			}
		}
		writer.write(prevLine);
		writer.close();
		inp.close();
		
		writer = new PrintWriter(file);
		inp = new Scanner(file2);
		while (inp.hasNextLine()) {
			writer.write(inp.nextLine());
			writer.write("\n");
		}
		writer.close();
		inp.close();
		file2.delete(); 
	}
}
