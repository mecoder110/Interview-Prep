package com.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachString {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Alice", "Bob", "Charlie");

		List<String> collect = asList.stream().map(name -> new StringBuilder(name).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
