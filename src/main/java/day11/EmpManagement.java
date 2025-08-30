package day11;

public class EmpManagement 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee("andrew@gmail.com",100);
		
		Employee e2=new Employee("rupali@gmail.com",101);
		
		Employee e3=new Employee("anushree@gmail.com",102);
		
		Employee e4=new Employee("somail@gmail.com",103);
		
		System.out.println("Emp1 Details "+e1.email + " "+e1.empID);
		
		System.out.println("Emp2 Details "+e2.email + " "+e2.empID);
		
		System.out.println("Emp3 Details "+e3.email + " "+e3.empID);
		
		System.out.println("Emp4 Details "+e4.email + " "+e4.empID);
		
		
	}

}
