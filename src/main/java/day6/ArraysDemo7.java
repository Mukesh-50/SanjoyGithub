package day6;

public class ArraysDemo7 {

	public static void main(String[] args) 
	{
		
		// WAP to find sum of all numbers in given array
		// WAP to find average of all numbers in given array
		
		int arr[]= {15,25,35,550,65,89,45,78,88,55};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		
		System.out.println(sum/arr.length);
		

	}

}
