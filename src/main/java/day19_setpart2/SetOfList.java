package day19_setpart2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetOfList 
{	
	public static void main(String[] args) 
	{

	    List<String> morningBatch=Arrays.asList("Himanshu","Sonjoy","Bipasa");
	    
	    List<String> weekendBatch=Arrays.asList("Andrew","Aditya","Akshay");
	    
	    List<String> eveningBatch=Arrays.asList("Kashif","Kirti","Manoj");
	    
	    List<String> eveningBatch1=Arrays.asList("Kashif","Kirti","Mukesh");
	    
	    Set<List<String>> s1=new LinkedHashSet<List<String>>();
		
	    s1.add(morningBatch);
	    
	    s1.add(weekendBatch);
	    
	    s1.add(eveningBatch);
	    
	    s1.add(eveningBatch1);
	    
	    System.out.println(s1);
	 
	}

}
