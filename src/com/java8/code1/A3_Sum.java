package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class A3_Sum {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// 1st way
		int sum1 = asList.stream().mapToInt(n-> n.intValue()).sum();	
		// 2nd way
		int sum2 = asList.stream().mapToInt(Integer::intValue).sum();
		
		// by reduce
		
		Optional<Integer> reduce = asList.stream().reduce((n1,n2) -> n1+n2);
		
		Integer reduce2 = asList.stream().reduce(0, (a,b)->a+b);
		
		Integer reduce3 = asList.stream().reduce(0, Integer::sum);
		System.out.println(reduce3);
		
	}

}
