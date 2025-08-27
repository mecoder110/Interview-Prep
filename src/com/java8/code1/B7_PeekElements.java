package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B7_PeekElements {

	public static void main(String[] args) {
		//Problem: Print elements of a stream during processing without altering the stream.

		List<String> asList = Arrays.asList("Ali Rizvi", "Tamheed Zehra", "Weqar Zehra");

		List<String> firstNames = asList.stream().peek(System.out::println).map(s -> s.split(" ")[0])
				.collect(Collectors.toList());

		System.out.println(firstNames);
		
		/*
		 * Explanation: peek is used for debugging or performing actions without
		 * changing the stream. It prints each element before passing it along the
		 * stream.
		 */
	}
}
