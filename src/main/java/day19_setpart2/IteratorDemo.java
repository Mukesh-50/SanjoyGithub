package day19_setpart2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo 
{

	// iterator - interface
	// hasNext - boolean
	// next - get you the values and will move to next element
	
	public static void main(String[] args) 
	{
		
		List<String> l1=new ArrayList<String>();
		
		l1.add("Bangalore");
		l1.add("Hyd");
		l1.add("Chennai");
		l1.add("Mysure");
		l1.add("Pune");
		l1.add("Mumbai");
		l1.add("Pondy");
		
		Iterator<String> itr= l1.iterator();
		
		while(itr.hasNext())
		{
			String values=itr.next();
			
			System.out.println(values);
			
			if(values.equalsIgnoreCase("Pune"))
			{
				break;
			}
			
		}
		
		

	}

}
