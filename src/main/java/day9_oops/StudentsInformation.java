package day9_oops;

public class StudentsInformation 
{

	public static void main(String[] args) 
	{
		
		// whenever you create object and you dont assign value by default java will assign default values to these fields according to data type
		
		Student s1=new Student();
		
		s1.gender='M';
		
		s1.marks=78;
		
		s1.marks=80;
		
		s1.rollNumber=101;
		
		s1.studentName="Akshay";
		
		Student s2=new Student();
		
		s2.gender='F';
		
		s2.marks=88;
		
		s2.rollNumber=102;
		
		s2.studentName="Chetna";
		
		Student s3=new Student();
		
		s3.gender='M';
		
		s3.marks=98;
		
		s3.rollNumber=103;
		
		s3.studentName="Aditya";
	
		System.out.println(s1.marks+s2.marks+s3.marks);

	}

}
