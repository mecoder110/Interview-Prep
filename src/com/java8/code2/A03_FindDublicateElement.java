package com.java8.code2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A03_FindDublicateElement {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
//		List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);

		Map<Integer, Long> collect = asList.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(collect);
		collect.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k);
			}
		});
	}

}
