import java.util.Scanner;


public class IntToHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int input = sc.nextInt();
		String hex = Integer.toHexString(input);
		System.out.println(hex);
	}

}
