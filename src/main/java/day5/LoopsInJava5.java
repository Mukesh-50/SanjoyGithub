package day5;

public class LoopsInJava5 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		
		for(int i=0;i<10;i=i+1)
		{
			
			System.out.println("I value "+i);
			
			if(i==5)
			{
				System.out.println("Number found");
				break;
			}
			
		}
		
		System.out.println("End");
		
		
	}

}
