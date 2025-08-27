package com.java8.code1;

import java.util.Arrays;
import java.util.List;

public class B2_AllMatch {

	public static void main(String[] args) {

		// Problem: Check if all numbers in a list are positive.
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		boolean allMatch = asList.stream().allMatch(s -> s>0);
		
		System.out.println(allMatch);
	}

}
