package day19_setpart2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSetConversion {

	
	// WAP to remove duplicates from List/ArrayList/LinkedList
	
	public static void main(String[] args) 
	{
		
		List<String> names=new ArrayList<String>();
		
		names.add("Chai");
		
		names.add("Chai");
		
		names.add("Mocha");
		
		names.add("Detox");
		
		names.add("Detox");
		
		names.add("Jasmine");
		
		// option 1- pass list in the constructor
		Set<String> namesInSet=new LinkedHashSet<String>(names);
		
		System.out.println(namesInSet);
		
		namesInSet.add("Jenkins");
		
		namesInSet.add("Teamcity");
		
		System.out.println(namesInSet);
		
	}

}
