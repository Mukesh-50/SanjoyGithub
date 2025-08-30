package day11;

public class EmpManagement2 
{

	public static void main(String[] args) 
	{
		
		Employee e1=new Employee();
		
		System.out.println(e1.email);
		
		Employee e2=new Employee(121);
		
		System.out.println(e2.email);
		
		System.out.println(e2.empID);
		
		Employee e3=new Employee("mukesh@email.com", 151);
		
	}

}
