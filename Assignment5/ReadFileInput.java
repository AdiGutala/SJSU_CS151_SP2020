import java.io.*;

public class ReadFileInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/adithya/eclipse-workspace/CS151Assignment5/src/quote.txt"));
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}
	

}
