package day22_exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	
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
		catch (ArithmeticException e) // 1
		{
			System.out.println("Something went wrong - Please select valid data "+e.getMessage());
		}
		catch(InputMismatchException e) // 2
		{
			System.out.println("Something went wrong - Please select valid input ");
		}
		catch(IllegalStateException e) // 3
		{
			System.out.println("Something went wrong - "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong - Please try again "+e.getMessage());
		}
		finally
		{
			sc.close();
			
			System.out.println("Closing the scanner object");
		}
	
		System.out.println("End");
		
		
		
	}

}
