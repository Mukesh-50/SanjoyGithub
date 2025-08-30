package day20_map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		
		// [] [] {}
		Map<Integer, String> map1=new HashMap<Integer, String>();
		
		// put method to add entries in map
		map1.put(101, "Manoj");
		
		map1.put(201, "Himanshu");
		
		map1.put(301, "Somil");
		
		map1.put(401, "Michale");
		
		map1.put(501, "Paul");
		
		map1.put(601, "Mukesh");
		
		System.out.println(map1);
		
		// if key does not exist it return null
		System.out.println(map1.get(501));
		
		// use key to remove if key not present then return null
		map1.remove(701);
		
		System.out.println(map1);
		
		
		map1.replace(601, "Mahesh");
		
		System.out.println(map1);
		
		
	}

}
