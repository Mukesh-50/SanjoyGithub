package day4;

public class ConditionalStatement7 
{

	public static void main(String[] args) 
	{
		
		String name="Mukesh";
		
		// chetna, jyoti, rabia
		
		if(name.contains("Chetna"))
		{
			System.out.println("Bday Date 1 march ");
		}
		else if(name.contains("Jyoti"))
		{
			System.out.println("Bday Date 1 April ");
		}
		else if(name.contains("Rabia"))
		{
			System.out.println("Bday Date 1 May ");
		}
		else if(name.contains("Mukesh"))
		{
			System.out.println("Bday Date 1 Aug ");
		}
		else
		{
			System.out.println("Dont Remember");
		}
		
		

	}

}
