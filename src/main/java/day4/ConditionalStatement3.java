package day4;

public class ConditionalStatement3 
{

	public static void main(String[] args) 
	{
		int age=21;
		
		boolean hasLoginDetails=false;
		
		int marks=96;
		
		if(age>=18 )
		{
			if(hasLoginDetails)
			{
				
				if(marks>=95)
				{
					System.out.println("Awesome --- You are allowed");
				}
				else
				{
					System.out.println("You did great job but better luck apply next time");
				}
				
				
			}
			else
			{
				System.out.println("Please check with admin for login details");
			}
			
			
		}
		else
		{
			System.out.println("Wait for sometime and then apply");
		}
		

	}

}
