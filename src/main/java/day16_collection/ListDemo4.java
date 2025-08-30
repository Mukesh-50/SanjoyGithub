package day16_collection;

import java.util.ArrayList;

public class ListDemo4 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("Java");
		list1.add("Selenium");
		list1.add("Cypress");
		list1.add("Playwright");
		list1.add("WDIO");
		list1.add("Tosca");
	/*	
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	*/	
		for(String str:list1)
		{
			
			if(str.contains("Playwright"))
			{
				System.out.println("Element found");
			}
		}
		
		
	}

}
