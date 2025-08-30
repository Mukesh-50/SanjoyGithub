package day19_setpart2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetConversion2 
{

	public static void main(String[] args) 
	{
		
		Set<String> names=new LinkedHashSet<String>();
		
		names.add("AWS");
		
		names.add("Azure");
		
		names.add("GCP");
		
		names.add("OpenStack");
		
		//System.out.println(names);
		
		// Option 2 - Convert Set To List Using addAll Method
		
		List<String> namesInList=new ArrayList<String>();
		
		namesInList.addAll(names);
		
		System.out.println(namesInList.get(0));
		

	}

}
