package day23_checkedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo2 
{

	// if some methods or constructor is having throws in the declaration then it will throw exception
	// if this method or constructor  is getting called then respective caller have to handle this exception
	// if we dont handle checked exception at main method then jvm have to handle and jvm dont handle any exception
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		System.out.println("Started");
		
		FileInputStream fis=new FileInputStream("Mukesh.txt");
		
		System.out.println("System is able to read the file");
			
		System.out.println("End");

	}

}
