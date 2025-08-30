package day8;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="Selenium";
		
		String str1=" Selenium ";
		
		String str2="Selenium ";
		
		String str4="selenium ";
		
		String str5="My name is Mukesh Otwani";
		
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
	
		String str3=str1.trim();
		System.out.println(str3.length()); // 8
		
		System.out.println(str.equals(str1)); // false
		
		System.out.println(str.equals(str1.trim()));  // true
		
		System.out.println(str1.equals(str2));  // false
		
		System.out.println(str2.equals(str4)); // false
		
		System.out.println(str2.equalsIgnoreCase(str4)); // true
		
		System.out.println(str5.contains(" Otwani")); // true

	}

}
