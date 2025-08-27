package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class B4_FindFirst {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Optional<Integer> first = asList.stream().findFirst();
		
		System.out.println(first.get());
	}

}
