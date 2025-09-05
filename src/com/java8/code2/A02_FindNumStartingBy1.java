package com.java8.code2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A02_FindNumStartingBy1 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> collect = asList.stream().filter(n -> n.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(collect);
		// OR
		List<String> collect2 = asList.stream().map(n -> n + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
