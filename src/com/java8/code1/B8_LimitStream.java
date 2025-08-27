package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B8_LimitStream {

	public static void main(String[] args) {

		// Problem: Limit the output to the first 3 elements of the list.

		List<Integer> asList = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);

		List<Integer> collect = asList.stream().limit(3).collect(Collectors.toList());
		System.out.println(collect);

		// Explanation: limit truncates the stream to be no longer than the specified
		// size.
	}

}
