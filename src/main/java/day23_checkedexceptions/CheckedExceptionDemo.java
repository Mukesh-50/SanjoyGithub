package day23_checkedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo 
{

	// if some methods or constructor is having throws in the declaration then it will throw exception
	// if this method or constructor  is getting called then respective caller have to handle this exception
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Started");
		
		try 
		{
			FileInputStream fis=new FileInputStream("Mukesh.txt");
			
			System.out.println("System is able to read the file");
			
		} catch (FileNotFoundException e) 
		
		{
			System.out.println("Could not read/load the file "+e.getMessage());
		}
		
		System.out.println("End");

	}

}
