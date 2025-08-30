package day23_checkedexceptions;

public class VoterService 
{
	
	public static void registerVoter(int age) throws AgeIsNotValidException
	{
		
		if(age<18)
		{
			throw new AgeIsNotValidException("Please apply after sometime not eligible");
		}
			
	}

}
