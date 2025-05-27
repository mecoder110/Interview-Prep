package com.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistintElements {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 5, 3, 6, 9, 4, 2, 6, 9);
 List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
System.out.println(collect);
	}

}
