package day11;

public class Employee 
{
	String email;
	
	int empID;
	
	public Employee(String emailAddress,int employeeID)
	{
		email=emailAddress;
		empID=employeeID;
		
		System.out.println("Constructor called and assigned values");
	}
	
	public Employee()
	{
		System.out.println("Constructor empty constructor");
	}
	
	public Employee(String emailAddress)
	{
		email=emailAddress;
		
	}
	
	public Employee(int employeeID)
	{
		empID=employeeID;
		
	}

}
