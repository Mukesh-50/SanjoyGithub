package day12;

public class Child extends Parent 
{

	String newName="CTS";
	
	public static void main(String[] args) 
	{
		// 1- When we create object of child class and store in a reference of Child class then we 
		// can access child + base + object class
		Child obj=new Child();
		
		System.out.println(obj.name);
		
		obj.display();
		
		System.out.println(obj.newName);
		
		obj.show();
		
		// 2 - When we create object of child class and store in a reference of parent class then we can access
		// Parent + Object Class
		Parent obj1=new Child();
		
		obj1.display();
		
		System.out.println(obj1.name);
		
		// 3 - When we create object of Parent class and store in a reference of parent class then we can access
		// Parent + Object Class
		Parent obj2=new Parent();
		System.out.println(obj2.name);
		obj2.display();
		
		// 4- not allowed - you can not create object of parent class and store in child class reference
		//Child obj3=new Parent();
		
	}
	
	public void show()
	{
		System.out.println("I am in child class show method");
	}
	

}
