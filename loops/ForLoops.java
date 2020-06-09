package loops;
import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,i;
		int sum = 0;
		
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		for(i = 1 ; i <=number ; i++)
			sum += i;
		
		System.out.println("Sum is " + sum);
	}

}
