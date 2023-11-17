package diwalitest;

public class IJFindOutput {
	
	public static void main(String args[])
	{
		int i=1,j;
		
		while(i<=3)
		{
			i += 2;
			j=1;
			System.out.println("i = "+i);
			while(j<=5)
			{
				j++;
				if(j==2)
					continue;
				if (j==5)
					break;
			System.out.println("\tj = "+j);
			}
		}

		
	}
	

}
