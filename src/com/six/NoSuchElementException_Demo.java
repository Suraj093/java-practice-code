package com.six;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Set;

public class NoSuchElementException_Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to programming world");
		
        try {
			Set exampleleSet = new HashSet();
			Hashtable exampleTable = new Hashtable();
            exampleleSet.iterator().next();
            exampleTable.elements().nextElement();
		} catch (NoSuchElementException n) {
			System.out.println(n.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
