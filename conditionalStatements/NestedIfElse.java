package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12, b = 10, c = 19;
		int result;
		if(a > b)
		{
			if(a > c)
				result = a;
			else
				result = c;
		}
		else
		{
			if(b > c)
				result = b;
			else
				result = c;
		}	
		System.out.println("Maximum of three numbers is " + result);

	}

}
