package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B5FlatMapForNestedLists {

	public static void main(String[] args) {

		List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2),
				Arrays.asList(3, 4, 5));
		
				List<Integer> flatList = nestedNumbers.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
	}

}
