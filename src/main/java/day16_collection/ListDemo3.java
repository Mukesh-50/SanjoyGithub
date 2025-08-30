package day16_collection;

import java.util.ArrayList;

public class ListDemo3 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("Java");
		list1.add("Selenium");
		list1.add("Cypress");
		list1.add("Playwright");
		list1.add("WDIO");
		list1.add("Tosca");
		list1.add(1, "Grid");
		
		System.out.println(list1);
		
		list1.set(2, "MCP Server");
		
		System.out.println(list1);
		
	}

}
