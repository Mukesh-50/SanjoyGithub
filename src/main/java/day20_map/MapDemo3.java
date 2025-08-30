package day20_map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {

		Map<String, Object> s1 = new LinkedHashMap<String, Object>();

		s1.put("name", "Anu");

		s1.put("phone", 78787845);

		s1.put("status", false);

		s1.put("marks", 98.56);

		// List<String> companies=Arrays.asList("TCS","Wipro","Infy");

		s1.put("companies", Arrays.asList("TCS", "Wipro", "Infy"));

		System.out.println(s1);

		Map<String, Object> s2 = new LinkedHashMap<String, Object>();

		s2.put("name", "Rupali");

		s2.put("phone", 78787845);

		s2.put("status", false);

		s2.put("marks", 97.56);

		// List<String> companies=Arrays.asList("TCS","Wipro","Infy");

		s2.put("companies", Arrays.asList("Wallmart", "CISCO", "Uber"));

		System.out.println(s2);

		Map<String, Object> s3 = new LinkedHashMap<String, Object>();

		s3.put("name", "Bipasa");

		s3.put("phone", 78787845);

		s3.put("status", false);

		s3.put("marks", 96.56);

		// List<String> companies=Arrays.asList("TCS","Wipro","Infy");

		s3.put("companies", Arrays.asList("Paypal", "RazorPay", "Paytm"));

		System.out.println(s3);

	}

}
