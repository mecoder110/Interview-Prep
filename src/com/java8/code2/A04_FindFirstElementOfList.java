package com.java8.code2;

import java.util.Arrays;
import java.util.List;

public class A04_FindFirstElementOfList {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		asList.stream().findFirst().ifPresent(f -> System.out.println(f));

		//OR
		
		int[] arr = {15, 8, 49, 25, 98, 98, 32, 15};
		Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::print);
	}

}
