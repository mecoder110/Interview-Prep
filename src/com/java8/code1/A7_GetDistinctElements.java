package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A7_GetDistinctElements {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 3, 5, 3, 7, 9, 3, 8);

		 List<Integer> collect = asList.stream().distinct()
				.collect(Collectors.toList());
	
		System.out.println(collect);
	}

}
