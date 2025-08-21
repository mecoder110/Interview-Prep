package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A1_FilterEvenNumbers {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Predicate<Integer> p = n -> n%2==0;
		
		List<Integer> even = asList.stream().filter(p).collect(Collectors.toList());
		
		System.out.println(even);
		
	}

}
