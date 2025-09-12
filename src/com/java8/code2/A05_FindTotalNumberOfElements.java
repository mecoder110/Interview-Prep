package com.java8.code2;

import java.util.Arrays;
import java.util.List;

public class A05_FindTotalNumberOfElements {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		long count = asList.stream().count();
		System.out.println(count);
		
		//OR
		
		int[] arr = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		long count2 = Arrays.stream(arr).boxed().count();
		System.out.println(count2);
	}

}
