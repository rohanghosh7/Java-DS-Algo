package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Integer input
		int x = sc.nextInt();
		System.out.println(x);
		
		//Double input
		double y = sc.nextDouble();
		System.out.println(y);
		
		//String input
		String hello = sc.nextLine();
		System.out.println(hello);
	}
}
