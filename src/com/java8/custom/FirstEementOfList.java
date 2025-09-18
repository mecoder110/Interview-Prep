package com.java8.custom;

import java.util.Arrays;
import java.util.List;

public class FirstEementOfList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,5,3,6,0,42,9,5,3);
		
		Integer integer = asList.stream().findFirst().get();
		System.out.println(integer);
	}

}
