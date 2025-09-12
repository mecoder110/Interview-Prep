package com.java8.code2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A09_SortAllValuesPresentInList {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> collect = myList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}

}
