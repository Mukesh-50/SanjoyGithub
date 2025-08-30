package day6;

import java.util.Scanner;

public class ArraysDemo8 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter number 1");
		
		int num1=sc.nextInt();
		
		System.out.println("Please enter number 2");
		
		int num2=sc.nextInt();
		
		System.out.println("Please enter number 3");
		
		int num3=sc.nextInt();
		
		System.out.println("Sum of all number "+(num1+num2+num3));
		
		System.out.println("Average "+(num1+num2+num3)/3);

	}

}
