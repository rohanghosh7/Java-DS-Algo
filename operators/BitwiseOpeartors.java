package operators;

public class BitwiseOpeartors {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int x = 13;
		int c = a & b;  //Bitwise AND
		int d = a | b;	//Bitwise OR
		int e = x>>2;	//Right shift by 1
		int f = x<<1;	//Left shift by 2
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
