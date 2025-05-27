package com.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> evenList = asList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
	}

}
