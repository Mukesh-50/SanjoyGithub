package day18_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		// does not maintain any order
		// set allow unique values no duplicate 
		Set<String> set1=new HashSet<String>();
		
		set1.add("Java");
		
		set1.add("Java");
		
		set1.add("Java");
		
		set1.add(null);
		
		set1.add(null);
		
		set1.add("JS");
		
		set1.add("Python");
		
		set1.add("C#");
		
		set1.add("Ruby");
		
		System.out.println(set1);
		
		System.out.println(set1.size());
		

	}

}
