package com.java8.code1;

import java.util.Arrays;
import java.util.List;

public class A2_FindMaximum {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 8, 9, 7, 6);

		Integer minNum = asList.stream().min(Integer::compare).get();

		// System.out.println(minNum);
		// Custom sorting order
		Integer maxNum = asList.stream().max((a, b) -> a.compareTo(b)).get();
		// System.out.println(maxNum);

		// by reduce
		// Use reduce for custom aggregation logic.
		// reduce degrade performance
		Integer reduce = asList.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(reduce);

	}

}
