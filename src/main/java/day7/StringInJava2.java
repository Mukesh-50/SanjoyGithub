package day7;

public class StringInJava2 {

	public static void main(String[] args) {
		
		// String class have in built methods
		
		// methods - piece of code which performs some task and give result
		
		String name="Selenium";  
		
		System.out.println(name);
		
		// if index is not valid then StringIndexOutOfBoundException
		char data=name.charAt(3);
		
		System.out.println(data);
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.startsWith("Se"));
		
		System.out.println(name.endsWith("um"));
		
		// s different S different
		System.out.println(name.startsWith("s"));

		System.out.println(name.endsWith("M"));
		

	}

}
