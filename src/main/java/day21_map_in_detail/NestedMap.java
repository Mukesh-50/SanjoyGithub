package day21_map_in_detail;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {

	public static void main(String[] args) 
	{
		
		Map<String, Object> studentDetails=new LinkedHashMap<String, Object>();
		
		// quick way to create map and this allow only max 10 entries and uses internally HashMap means no order
		Map<String, Object> addressdetails=Map.of("Area", "Whitefield", "Pincode", 474455, "City", "BLR");
		
		studentDetails.put("Name", "Jyoti");
		
		studentDetails.put("Address", addressdetails);
		
		System.out.println(studentDetails);

	}

}
