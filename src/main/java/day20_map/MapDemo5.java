package day20_map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo5 {

	public static void main(String[] args) 
	{

		Map<String, Object> s1 = new LinkedHashMap<String, Object>();

		s1.put("name", "Anu");

		s1.put("phone", 78787845);

		s1.put("status", false);

		s1.put("marks", 98.56);
		
		s1.put("companies", "SAP");
		
		System.out.println(s1);

	}

}
