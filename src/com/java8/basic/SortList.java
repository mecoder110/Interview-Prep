package com.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SortList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 5, 3, 6, 9, 4, 2, 6, 9);

		List<Integer> naturalSort = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(naturalSort);

		List<Integer> customSort = asList.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(customSort);
	}

}
