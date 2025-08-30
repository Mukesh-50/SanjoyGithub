package day10;

public class MethodsDemo {

	/*
	 * 
	 *  Method
	 *  	Static - Static methods dont need objects we can call them directly without object.
	 *  	 We can call them using Class Name directly using .operator
	 *  	
	 *  	Non Static - Non static methods needs objects. Once object is ready you can call them using
	 *  				 . operator
	 * 
	 */
	
	public static void main(String[] args) 
	{
		System.out.println("Start");
		
		MethodsDemo.display();
		
		int result=MethodsDemo.sum(105,250);
		
		System.out.println("Result is "+result);
		
		System.out.println("End");
	
	}
	
	public static void display()	
	{
		System.out.println("Hello Welcome To Java World");
		
	}
	
	public static int sum(int n1,int n2)
	{	
		int result=n1+n2;
		
		return result;
	}
	
	
	

}
