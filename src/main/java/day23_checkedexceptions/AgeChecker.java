package day23_checkedexceptions;

public class AgeChecker {

	public static void main(String[] args) 
	{
		
		// all custom exception is checked exception
		
		
		try 
		{
			VoterService.registerVoter(15);
			
			System.out.println("Eligible");
			
		} catch (AgeIsNotValidException e) 
		{
			System.out.println("Not eligible "+e.getMessage());
		}
		

	}

}
