package day5;

public class LoopsInJava6 
{
	/*
	 *  for loop suits when number of iterations are fixed or known
	 *  
	 *  while loop suits when number of iterations are not fixed or not known
	 * 
	 */

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		
		int i=0;
		
		while (i<=5) 
		{
			System.out.println("Hello world "+i);	
			
			//++i;
			i++;
			//i=i+1;
		}

		System.out.println("End");
		
	}

}
