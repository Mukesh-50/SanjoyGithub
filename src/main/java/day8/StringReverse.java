package day8;

public class StringReverse {

	
	// WAP to reverse the String without using reverse method
	
	public static void main(String[] args) {
		
		String str="TestNG "; // muineleS
		
		// empty string
		String newstr=""; 
		
		// length
		// loop forloop
		// concat
		
		char []arr=str.toCharArray();
		
		int size=arr.length;
		
		for(int i=size-1;i>=0;i--)
		{
			// concat
			newstr=newstr+arr[i];
		}
		
		//System.out.println(newstr);

	}

}
