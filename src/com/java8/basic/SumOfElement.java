package com.java8.basic;

import java.util.Arrays;
import java.util.List;

public class SumOfElement {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 4, 3, 5, 7, 4, 1);

		//int sum = asList.stream().mapToInt(n -> n.intValue()).sum();
		int sum = asList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		// to use reduce
		//Integer reduceSum = asList.stream().reduce(0, (a,b)->a+b);
		Integer reduce = asList.stream().reduce(0,Integer::sum);
		System.out.println(reduce);
	}

}
