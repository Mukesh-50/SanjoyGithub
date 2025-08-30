package day18_set;

public class EvenOddArray {

    public static void main(String[] args) 
    {
       
    	int arr[]=new int[6];
    	
    	int even[]=new int[3];
    	
    	int odd[]=new int[3];
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=i+1;
    	}
    	
    	int evenIndex=0;
    	
    	int oddIndex=0;
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%2==0)
    		{
    			even[evenIndex++]=arr[i];
    		}
    		else
    		{
    			odd[oddIndex++]=arr[i];
    		}
    	}
    	
    	for(int x:even)
    	{
    		System.out.println(x);
    	}
    	
    	for(int x:odd)
    	{
    		System.out.println(x);
    	}
    	
    	
    }
}
