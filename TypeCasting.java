package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		//Automatic type casting
		byte x = 4;
		int y = x;
		System.out.println(y);
		
		int a = 10;
		double b = a;
		System.out.println(b);
		
		//Manual type casting
		double myDouble = 3.12;
		int myInt = (int)myDouble;
		System.out.println(myInt);

	}

}
