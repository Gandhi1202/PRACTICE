package com.java.problemsolving;
//15. Given a list of integers, write a method that returns a Set<Integer> containing only the unique elements from the list.
import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(10);
		numbers.add(50);
		numbers.add(50);
		numbers.add(60);
		System.out.println("normal list: "+numbers);
		
		uniqueNumbers(numbers);
	}
	
	public static void uniqueNumbers(List<Integer> list)
	{
		Set<Integer> unique=new LinkedHashSet<>(list);
		System.out.println("set list: "+unique);
	}

}
