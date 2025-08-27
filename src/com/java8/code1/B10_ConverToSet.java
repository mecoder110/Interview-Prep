package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class B10_ConverToSet {

	public static void main(String[] args) {
		// Problem: Convert a list of integers to a set to remove duplicates.
		List<Integer> asList = Arrays.asList(1, 1, 1, 2, 3, 4, 5, 3, 5, 7, 5, 3, 8, 4);

		Set<Integer> collect = asList.stream().collect(Collectors.toSet());
		System.out.println(collect);

		// Explanation: Collecting the stream into a Set automatically removes
		// duplicates.
	}

}
