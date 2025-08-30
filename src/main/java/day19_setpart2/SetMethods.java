package day19_setpart2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {
	
	/*
	 *  Set of Set -  	Yes
	 *  List Of Set -   Yes
	 *  Set Of List -   Yes
	 * 	List Of List -  Yes
	 */

	public static void main(String[] args) 
	{	
		Set<String> names=new LinkedHashSet<String>();
		
		names.add("AWS");
		
		names.add("AWS");
		
		names.add("Azure");
		
		names.add("AWS");
		
		names.add("GCP");
		
		names.add("OpenStack");
		
		System.out.println(names.size());
		
		System.out.println(names.contains("gcp"));
		
		System.out.println(names.contains("GCP"));
		
		System.out.println(names.isEmpty());
		
		System.out.println(names.remove("AWS"));
		
		//names.clear();
		
		System.out.println(names.size());
		

	}

}
