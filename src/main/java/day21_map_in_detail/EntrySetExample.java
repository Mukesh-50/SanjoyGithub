package day21_map_in_detail;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExample {

	public static void main(String[] args)
	{
		
		Map<String, Object> m1 = new LinkedHashMap<String, Object>();

		m1.put("name", "Anu");

		m1.put("phone", 78787845);

		m1.put("status", false);

		m1.put("marks", 98.56);
		
		// this can be duplicate
		//System.out.println(s1.values());
		
		// Set of keys because keys has to be unique
		//System.out.println(s1.keySet());
		
		// set of Entries and each entry is unique
		Set<Entry<String, Object>> es1=m1.entrySet();
		
		for(Entry<String, Object> entry:es1)
		{
			System.out.println("Name "+entry.getKey()+" Values Are "+entry.getValue());
		}
		
	}

}
