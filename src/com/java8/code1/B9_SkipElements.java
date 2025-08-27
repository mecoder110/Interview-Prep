package com.java8.code1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class B9_SkipElements {

	public static void main(String[] args) {
		// Problem: Skip the first 2 elements of a list and return the rest.
		List<Integer> asList = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);

		List<Integer> collect = asList.stream().skip(4).collect(Collectors.toList());
		System.out.println(collect);
		// Explanation: skip discards the first n elements of the stream.

		// Find 2nd highest num
		Integer integer = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(integer);

	}

}
