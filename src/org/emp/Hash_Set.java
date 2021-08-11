package org.emp;


import java.util.ArrayList;
import java.util.List;


public class Hash_Set {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		
		System.out.println("Print the total list");
		System.out.println(li.get(3));
		
		System.out.println("Prints the size of the list");
		int j = li.size();
		System.out.println(j);
		
		System.out.println("Inserts a new index and prints the updated list");
		li.set(0,11);
		System.out.println(li);
		
		System.out.println("to insert a value be two index");
		li.add(1, 12);
		System.out.println(li);
		
		System.out.println("To check the value is present");
		boolean b = li.contains(14);
		System.out.println(b);
		
		System.out.println("This will print the list one by one");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		li.addAll(li);
		System.out.println(li);
		
		
	}

}
