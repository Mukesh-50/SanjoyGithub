package day12;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your marks for maths");
		
		double math=sc.nextDouble();
		
		System.out.println("Please enter your marks for chemis");
		
		double chem=sc.nextDouble();

		System.out.println("Please enter your marks for pyh");
		
		double phy=sc.nextDouble();
	
		System.out.println("Your average of marks "+ (math+chem+phy)/3);
		
		sc.close();

	}

}
