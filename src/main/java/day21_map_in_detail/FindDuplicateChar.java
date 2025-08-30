package day21_map_in_detail;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {
		
		String name="Mahesh Otwani";
		
		Map<Character, Integer> m1=new LinkedHashMap<Character, Integer>();
		
		
		
		
		// get all char in array
		char [] arr=name.toCharArray();
		
		for(char ch:arr)
		{
			Integer count=m1.get(ch);
			
			if(count==null)
			{
				m1.put(ch, 1);
			}
			else
			{
				m1.put(ch, count+1);
			}
			
		}
		
		//System.out.println(m1);
		
		Set<Entry<Character, Integer>> es1=m1.entrySet();
		
		for(Entry<Character, Integer> entry:es1)
		{
			
			int count=entry.getValue();
			
			if(count>1)
			{
				System.out.println("Duplicate Char is "+entry.getKey()+" and duplicate count is "+entry.getValue());
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
