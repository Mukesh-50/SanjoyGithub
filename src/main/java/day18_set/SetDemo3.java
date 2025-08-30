package day18_set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		
		// maintains sorting 
		// set allow unique values no duplicate 
		// no null values allowed
		
		// 65-90 - A-Z
		
		// 97-122 - a-z
		Set<String> set1=new TreeSet<String>();
		
		set1.add("aws");
		
		set1.add("Azure");
		
		set1.add("zalenium");
		
		set1.add("Selenium");
		
		set1.add("Maven");
		
		//set1.add(null);
		
		System.out.println(set1);
		

	}

}
