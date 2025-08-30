package day15;

public interface QA 
{
	
	public default void writetest()
	{
		System.out.println("I am responsible for test");
	}
	
	public default void raisebugs(int count)
	{
		System.out.println("QA can raise bugs "+count+ "at onetime");
	}

}
