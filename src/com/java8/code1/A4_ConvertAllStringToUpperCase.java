package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A4_ConvertAllStringToUpperCase {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Alice", "Bob", "Charlie");

		List<String> upper = asList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		List<String> upperCase = asList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upperCase);
	}

}
