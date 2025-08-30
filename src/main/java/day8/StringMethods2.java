package day8;

public class StringMethods2 {

	public static void main(String[] args) 
	{
		
		String msg="Total Invoice Amount is 200 USD";
		
		String str[]=msg.split(" ");
		
		//length will return number of elements in given array
		int size=str.length;
		
		System.out.println(str[size-2]);
		
	}

}
