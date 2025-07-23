package com.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppendToString {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Alice", "Bob", "Charlie");
		List<String> collect = asList.stream().map(name -> "Mr: " + name).collect(Collectors.toList());
		System.out.println(collect);
	}

}
