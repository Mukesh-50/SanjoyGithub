package day10;

public class MethodDemo3 
{
	
	public static void main(String[] args) 
	{
		
		MethodDemo3 obj1=new MethodDemo3();
		
		int result=obj1.average(15, 250, 450);
		
		System.out.println(result);
	}
	
	public int average(int n1,int n2,int n3)
	{
		int result=(n1+n2+n3)/3;
		
		return result;
		
	}
	
	
	

}
