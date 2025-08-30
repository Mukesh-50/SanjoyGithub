package day17_listInDetail;

import java.util.ArrayList;
import java.util.List;

public class ListInDetails {

	
	// In collection you can not use primitive data type 
	// Collection works with Objects
	// In order to use Collection for each data type you need wrapper class
	
	public static void main(String[] args) 
	{
		
		// List of students id or marks or status
		
		List<Double> marks=new ArrayList<Double>();
		
		marks.add(15.25); // autoboxing 
		
		marks.add(25.25);
		
		marks.add(35.25);
		
		double x=marks.get(2); // autounboxing
		
		System.out.println(x);
		
	}

}
