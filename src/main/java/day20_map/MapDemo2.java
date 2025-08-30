package day20_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		
		
		
		Map<Integer, String> map1=new HashMap<Integer, String>();
		
		map1.put(101, "Manoj");
		
		map1.put(201, "Himanshu");
		
		map1.put(301, "Somil");
		
		map1.put(401, "Somil");
		
		map1.put(501, null);
		
		// null as a key allowed in map for HashMap and LinkedHashMap but not for treemap
		map1.put(null, "Umesh");
		
		// if u use duplicate key it will override the value
		System.out.println(map1.get(301));
		
		System.out.println(map1);
		
		
	}

}
