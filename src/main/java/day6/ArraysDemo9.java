package day6;

public class ArraysDemo9 {

	public static void main(String[] args) 
	{
		
		// WAP to find given number is present in given array
		
		int arr[]= {15,89,45,78};
		
		int numberToFind=78;
		
		boolean found=false;
		
		for(int i=0;i<arr.length;i++)
		{

				if(numberToFind==arr[i]) 
				{
					found=true;
					break;
				}
			
		}
		
		if(found)
		{
			System.out.println("Number is present in given array");
		}
		else
		{
			System.out.println("Number is not present in given array");
		}
		

	}

}
