package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a");
		int a = sc.nextInt();
		
		System.out.println("Enter b");
		int b = sc.nextInt();
		
		int i;
		int result = 1;
		
		for(i = 0; i < b; i++)
			result *= a;
		
		System.out.println("Result=" + result);

	}

}
