package day17_listInDetail;

import java.util.Arrays;
import java.util.List;

public class ImmutableList 
{

	public static void main(String[] args) 
	{	
		// can not add , can not delete
		
		// Immutable List
		List<String> names= Arrays.asList("Akshay","Aditya","Bipasa","Himanshu");
		
		System.out.println(names.get(2));
		
		names.set(2, "Mahesh");
		
		System.out.println(names);
	}

}
