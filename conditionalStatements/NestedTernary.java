package conditionalStatements;

public class NestedTernary {

	public static void main(String[] args) {
		int a = 12, b = 18, c = 15;
		int result;
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("Maximum of three numbers is " + result);


	}

}
