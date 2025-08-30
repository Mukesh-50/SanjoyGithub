package day19_setpart2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetConversion 
{

	public static void main(String[] args) 
	{
		
		Set<String> names=new LinkedHashSet<String>();
		
		names.add("AWS");
		
		names.add("Azure");
		
		names.add("GCP");
		
		names.add("OpenStack");
		
		//System.out.println(names);
		
		// Option 1 - Convert Set To List Using Constructor
		
		List<String> namesInList=new ArrayList<String>(names);
		
		System.out.println(namesInList.get(2));
		
		System.out.println(namesInList.get(3));
	

	}

}
