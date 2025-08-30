package day17_listInDetail;

public class WrapperClassDemo 
{

	public static void main(String[] args) 
	{
		
		/*
		 * int Integer
		 * short Short
		 * byte Byte
		 * long Long
		 * double Double
		 * float Float
		 * char Character
		 * boolean Boolean
		 * 
		 * 
		 */
		
		int num1=10;
		
		Integer num2=num1; // primitive > non primitive - Autoboxing
		
		Integer x=20;
		
		int y=x; // non primitive > primitive - Autounboxing
		
		String price="12";
		
		int newPrice=Integer.parseInt(price);

		System.out.println(newPrice);
	}

}
