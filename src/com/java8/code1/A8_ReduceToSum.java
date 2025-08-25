package com.java8.code1;

import java.util.Arrays;
import java.util.List;

public class A8_ReduceToSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(1, 2,  3, 4, 5);
		
		Integer sum = asList.stream().reduce(0, Integer::sum);
		System.out.println(sum);

	}

}
