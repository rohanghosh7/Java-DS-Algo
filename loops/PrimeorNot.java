package loops;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		int i;
		
		boolean isPrime = true;
		
		for(i = 2;i < n; i++)
		{
			if(n % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(n == 1)
			isPrime = false;
		
		if(isPrime)
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is not prime");

	}

}
