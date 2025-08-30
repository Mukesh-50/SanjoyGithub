package studentsdoubts;

import java.io.File;

public class Sample2 {

	public static void main(String[] args) {
		
		// write my own logic
		
		File src=new File("/Users/mukeshotwani/Documents/JavaPrograms/List_Of_Java_Program.pdf");
		
		System.out.println(src.isFile());
		
		System.out.println(src.exists());
		
		System.out.println(src.isHidden());
		
	}

}
