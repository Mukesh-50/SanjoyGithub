package day16_collection;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) 
	{
		
		// <T> <E> <V>
		
		// Raw Arraylist
		ArrayList list1=new ArrayList();
		
		list1.add(15);
		list1.add(25.5);
		list1.add("Collection");
		list1.add(false);
		list1.add('Y');
		list1.add(null);
		list1.add(15);
		list1.add(25.5);
		
		
		//System.out.println(list1);
		
		System.out.println(list1.get(2));
		
		System.out.println(list1.contains(15));

		System.out.println(list1.size());
		
		System.out.println(list1);
		
		System.out.println(list1.remove(3));
		
		System.out.println(list1);
		
	}

}
