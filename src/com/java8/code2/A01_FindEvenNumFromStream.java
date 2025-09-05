package com.java8.code2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A01_FindEvenNumFromStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> evenNum = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		evenNum.forEach(System.out::println);
	}

}
