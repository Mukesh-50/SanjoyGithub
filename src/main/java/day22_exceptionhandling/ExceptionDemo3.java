package day22_exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo3 
{
	
	//ArithmeticException
	//InputMismatchException
	//IllegalStateException
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Start");
		
		Scanner sc=new Scanner(System.in);
		
		try 
		{
			System.out.println("Please enter first number");
			
			int num1=sc.nextInt();
			
			System.out.println("Please enter second number");
			
			int num2=sc.nextInt();
			
			System.out.println("Div is "+(num1/num2));
			
		} 
		catch(Exception e)
		{
			System.out.println("Something went wrong - Please try again "+e.getMessage());
		}
		
		sc.close();
		
		System.out.println("End");
		
		
		
	}

}
