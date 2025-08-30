package day11;

public class Calc {

	public static void main(String[] args) 
	{

		Calc.add(15.25,5);

	}
	
	public static void add()
	{
		System.out.println("1-Calling add method");
	}
	
	public static void add(int num1,int num2)
	{
		System.out.println("2-Result is "+(num1+num2));
	}
	
	public static void add(double num1,double num2)
	{
		System.out.println("3-Result is "+(num1+num2));
	}
	
	public static void add(int num1,double num2)
	{
		System.out.println("4-Result is "+(num1+num2));
	}
	
	public static void add(double num1,int num2)
	{
		System.out.println("5-Result is "+(num1+num2));
	}

}
