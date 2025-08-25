package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class A9_FindAny {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(7, 2,  3, 4, 5);
		
		Optional<Integer> any = asList.stream().findAny();
		System.out.println(any.get());
	}

}
