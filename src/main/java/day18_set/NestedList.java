package day18_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedList {

	public static void main(String[] args) 
	{
		
		// Option 1- ArrayList
		
		// Option 2- Arrays.asList
		
	    List<String> morningBatch=Arrays.asList("Himanshu","Sonjoy","Bipasa");
	    
	    List<String> weekendBatch=Arrays.asList("Andrew","Aditya","Akshay");
	    
	    List<String> eveningBatch=Arrays.asList("Kashif","Kirti","Manoj");
		
		List<List<String>> masterList=new ArrayList<List<String>>();
		
		masterList.add(morningBatch); //0
		
		masterList.add(weekendBatch); // 1
		
		masterList.add(eveningBatch); // 2
		
		//masterList.add("Mukesh");
		
		System.out.println(masterList.get(2).get(2));
				
	
	}

}
