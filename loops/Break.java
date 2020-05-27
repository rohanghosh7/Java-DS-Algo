package loops;

public class Break {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 1; i <= 50; i++)
		{
			if(i == 30)
				break;
			
			System.out.print(i + " ");
		}

	}

}
