package com.java8.code2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class A06_FindMaximumValueElement {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(6, 4, 6, 8, 4, 8, 3, 9, 4, 3);

		Optional<Integer> max = asList.stream().max(Comparator.naturalOrder());

		System.out.println(max.get());

		// OR
		int[] arr = { 6, 3, 5, 8, 5, 8, 3, 8, 3 };
		Integer integer = Arrays.stream(arr).boxed().max(Integer::compareTo).get();

		System.out.println(integer);
	}

}
