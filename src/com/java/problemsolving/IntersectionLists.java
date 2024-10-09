package com.java.problemsolving;
//13. Write a method that takes two lists of integers and returns a Set<Integer> containing the intersection of the two lists.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionLists {
	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(20);
		list1.add(10);	
		list1.add(60);
		List<Integer> list2= new ArrayList<Integer>();
		list2.add(10);
		list2.add(25);
		list2.add(30);
		list2.add(40);
		list2.add(20);
		list2.add(10);
		list2.add(70);
		list2.add(70);
		list2.add(60);
		
		System.out.println("first list:-"+list1);
		System.out.println("second list:-"+list2);
		
		Set<Integer> intesectionnumbers=findIntersection(list1,list2);
		System.out.println("insertion set:-"+intesectionnumbers);
		
	}
	 public static Set<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
		 
		
		 Set<Integer> set1 = new HashSet<>(list1); 
	        Set<Integer> intersection = new HashSet<>(); 

	        for (Integer num : list2) {
	            if (set1.contains(num)) { // Check if the second list's element is in the first list's Set
	                intersection.add(num); 
	            }
	        }

	        return intersection; 
	    }
}
