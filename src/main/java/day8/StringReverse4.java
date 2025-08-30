package day8;

public class StringReverse4 {

	
	// WAP to reverse the String without using reverse method
	
	public static void main(String[] args) {
		
		String str="TestNG"; 
		
		String newstr=""; 
			
		for(int i=str.length()-1;i>=0;i--)
		{
			newstr=newstr+str.charAt(i);
		
		}
		
		System.out.println(newstr);

	}

}
