package com.eight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ExampleFour {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sumit");
		list.add("Sumant");
		list.add("Sumit");
		list.add("Raja");
		list.add("Delhi");
		list.add("Sunil");

		System.out.println("List value :- " + list);
		
		System.out.println("-----------------------------------------------");
		
		list.add(3, "Suraj");
		
		System.out.println("List value :- " + list);
		
		System.out.println("-----------------------------------------------");
		
		list.remove(0);
		
		System.out.println("List value :- " + list);
		
		System.out.println("-----------------------------------------------");
		
		list.forEach(foo -> {
	        if(foo.length() > 4) {
	          System.out.print(" " + foo + "  ");
	        }
	    });
		
		System.out.println("-----------------------------------------------");
		
		 Iterator<String> iterator = list.iterator();
		 
		 while(iterator.hasNext()) {
			 String next = iterator.next();
			 System.out.print(" " + next + " ");
		 }
		
		System.out.println("-----------------------------------------------");
		
		List<String> listOne = new ArrayList<>();
		list.add("Sumit");
		list.add("Sumant");
		list.add("Sumit");
		list.add("Raja");
		list.add("Delhi");
		list.add("Sunil");
		
		list.addAll(listOne);
		
		System.out.println(" Final List :- " + list);
		
		System.out.println("---------------------------------------------");
		
		for(String str:list) {
			System.out.println(str);
		}

	}

}
