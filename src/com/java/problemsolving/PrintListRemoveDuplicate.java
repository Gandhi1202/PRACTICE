package com.java.problemsolving;
//14. Create a method that takes a List<Integer> and removes duplicates using a Set, then returns the modified list.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintListRemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(50);
		list.add(60);
		
		System.out.println("normal list:-"+list);
		List<Integer> modifiedList = removeDuplicatenumbers(list);
        System.out.println("List after removing duplicates: " + modifiedList);
		
	}

	
	public static List<Integer> removeDuplicatenumbers(List<Integer> list)
	{
		
		Set<Integer> set= new LinkedHashSet<>(list);
		ArrayList<Integer> modifiedlist=new ArrayList<>(set);		
		return modifiedlist;
	}
}
