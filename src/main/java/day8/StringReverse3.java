package day8;

public class StringReverse3 {

	
	// WAP to reverse the String without using reverse method
	
	public static void main(String[] args) {
		
		String str="Your Name Is Anushree"; // muineleS
		
		String newstr=""; 
			
		char []arr=str.toCharArray();
		
		for(int i=str.toCharArray().length-1;i>=0;i--)
		{
			newstr=newstr+arr[i];
		}
		
		System.out.println(newstr);

	}

}
