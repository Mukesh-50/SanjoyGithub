package day15;

public interface Developer 
{
	
	public default void writecode()
	{
		System.out.println("I can write and build application");
	}

}
