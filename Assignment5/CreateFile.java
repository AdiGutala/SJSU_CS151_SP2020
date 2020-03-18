import java.util.Scanner;
import java.io.*;


public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		FileWriter writer = new FileWriter("/Users/adithya/eclipse-workspace/CS151Assignment5/src/command_line_input.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		while(bool)	{
		try {
		System.out.println("Please enter the text");
		String val = sc.next();
		if(val.equals("@q")) {
			break;
		}
		bw.write(val);
		bw.newLine();
		System.out.println("Success");
		}
		catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		}
		
		bw.close();
		writer.close();
		
		
}
}
	

