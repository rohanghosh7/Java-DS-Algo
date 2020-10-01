package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		//Logical AND
		int number = 45;
		if(number >= 1 && number <= 100)
			System.out.println("Number is in range");
		else
			System.out.println("Number is out of range");
		
		//Logical OR
		int grade = 11;
		if(grade == 10 || grade == 12)
			System.out.println("You can give board exams");
		else
			System.out.println("You can not give board exams");
		
		//Logical NOT
		grade = 11;
		if(!(grade == 10 || grade == 12))
			System.out.println("You can not give board exams");
		else
			System.out.println("You can  give board exams");
	}

}
