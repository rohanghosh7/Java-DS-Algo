package loops;

public class Continue {

	public static void main(String[] args) {
		
		int i ;
		
		for(i = 1; i <= 50; i++)
		{
			if(i >= 25 && i <= 35)
				continue;
			
			System.out.print(i + " ");
		}

	}

}
