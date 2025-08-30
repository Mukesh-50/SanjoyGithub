package day4;

public class ConditionalStatement4 
{

	public static void main(String[] args) 
	{
		
		
		int age=15;
		
		boolean hasLoginDetails=true;
		
		int marks=96;
		
		if(age>=18 && hasLoginDetails && marks>=95)
		{
			System.out.println("Allowed");
		}
		else
		{
			System.out.println("Wait for sometime and then apply");
		}
		

	}

}
