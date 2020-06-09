package loops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int i , j;
		
		for(i = 1; i<= 5; i++)
		{
			for(j = 1;j <= 10; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
