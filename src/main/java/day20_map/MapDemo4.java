package day20_map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo4 {

	public static void main(String[] args) 
	{

		// treemap will sort based on Key
		Map<String, Object> s1 = new TreeMap<String, Object>();

		s1.put("name", "Anu");

		s1.put("phone", 78787845);

		s1.put("status", false);

		s1.put("marks", 98.56);

		System.out.println(s1);
		
		//System.out.println(s1.en);

	}

}
