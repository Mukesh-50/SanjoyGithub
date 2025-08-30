package day19_setpart2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSetConversion2 {

	
	// WAP to remove duplicates from List/ArrayList/LinkedList
	
	// what is the difference between add and addAll method in Collection
	
	public static void main(String[] args) 
	{
		
		List<String> names=new ArrayList<String>();
		
		names.add("Chai");
		
		names.add("Chai");
		
		names.add("Mocha");
		
		names.add("Detox");
		
		names.add("Detox");
		
		names.add("Jasmine");
		
		// option 2- call addAll Method
		Set<String> namesInSet=new LinkedHashSet<String>();
		
		namesInSet.addAll(names);
		
		System.out.println(namesInSet);
		
		
	}

}
