package day23_checkedexceptions;

import java.util.Scanner;

public class ThrowDemo {

	// use throw when you want to throw some exception based on conditions
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your age to check");
		
		int age=sc.nextInt();
		
		// AgeIsNotValidException - Please focus on study apply after sometime- If you want you can create your own exception
		if(age<18)
		{
			throw new ArithmeticException("Please focus on study apply after sometime");
		}
		else
		{
			System.out.println("Eligible");
		}
		
		sc.close();

	}

}
