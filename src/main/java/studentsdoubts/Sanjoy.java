package studentsdoubts;

public class Sanjoy {

	public static void main(String[] args) {
		
		String name="I am Sonjoy and I am from Kolkata";
		
		String arr[]=name.split("Sonjoy");
		
		System.out.println(arr[0]);
		
		System.out.println(arr[1].trim());
		
		String part2=arr[1];
		
		String arr1[]=part2.split("from");

		System.out.println(arr1[1].trim());
		
	}

}
