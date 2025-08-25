package com.java8.code1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A5_SortList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 3, 5, 3, 7, 9, 3, 8);

		List<Integer> sortInAsc = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortInAsc);

		List<Integer> sortInDesc = asList.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
		List<Integer> sortInDesc1 = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortInDesc);
		System.out.println(sortInDesc1);
	}

}
