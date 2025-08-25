package com.java8.code1;

import java.util.Arrays;
import java.util.List;

public class A6_Count {

	public static void main(String[] args) {
		// Problem: Count the number of elements in a list that are greater than 5.
		List<Integer> asList = Arrays.asList(1, 3, 5, 3, 7, 9, 3, 8);

		long count = asList.stream().filter(a -> a > 5).count();
		System.out.println(count);
	}

}
