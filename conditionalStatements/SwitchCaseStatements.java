package conditionalStatements;

import java.util.Scanner;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day number of week");
		int day = sc.nextInt();
		
		switch(day)
		{
			case 1:
				System.out.println("I am on leave");
				break;
			case 2:
				System.out.println("I am going to office");
				break;
			case 3:
				System.out.println("I am going to play football");
				break;
			case 4:
				System.out.println("I am going to CCD to grab coffee");
				break;
			default:
				System.out.println("Incorrect day");
		
		}
	}

}
