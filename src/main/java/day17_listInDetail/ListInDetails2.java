package day17_listInDetail;

import java.util.ArrayList;
import java.util.List;

public class ListInDetails2 {

	
	// In collection you can not use primitive data type 
	// Collection works with Objects
	// In order to use Collection for each data type you need wrapper class
	
	public static void main(String[] args) 
	{
		
		Browsers chrome=new Browsers("GChrome", 137);
		
		Browsers firefox=new Browsers("Mozila Firefox", 134);
		
		Browsers edge=new Browsers("MSEdge", 136);
		
		Browsers safari=new Browsers("Apple Safari", 14);
		
		
		List<Browsers> listOfBrowser=new ArrayList<Browsers>();
		
		listOfBrowser.add(chrome);
		
		listOfBrowser.add(firefox);
		
		listOfBrowser.add(edge);
		
		listOfBrowser.add(safari);
		
		Browsers b1=listOfBrowser.get(1);
		
		System.out.println(b1.browserName);
		
		System.out.println(b1.browserVersion);
		
		//System.out.println(listOfBrowser.get(3).browserName);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
