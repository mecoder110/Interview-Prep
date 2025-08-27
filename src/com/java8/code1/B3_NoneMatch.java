package com.java8.code1;

import java.util.Arrays;
import java.util.List;

public class B3_NoneMatch {

	public static void main(String[] args) {

		
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,-7,8);
		
		boolean allMatch = asList.stream().noneMatch(s -> s<0);
		
		System.out.println(allMatch);
	}

}
