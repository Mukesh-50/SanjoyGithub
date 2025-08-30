package day22_exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		
		int arr[]= {12,24,36,48};
		
		try
		{
			System.out.println(arr[0]+arr[10]);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Something went wrong : Please use valid indexes "+e.getMessage());
		}
		
		System.out.println("End");
		
	}

}
