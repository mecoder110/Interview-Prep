package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B1_ListFirstNames {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Ali Rizvi", "Tamheed Zehra", "Weqar Zehra");

		List<String> firstNames = asList.stream().map(s -> s.split(" ")[0]).collect(Collectors.toList());

		System.out.println(firstNames);
	}

}
