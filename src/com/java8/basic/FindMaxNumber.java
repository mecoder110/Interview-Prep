package com.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 5, 2, 8, 1);
		
		//Optional<Integer> max = numbers.stream().max((a,b)-> a.compare(a, b));
		//Optional<Integer> max = numbers.stream().max(Comparator.comparingInt(a -> a));
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println(max.get());
	}

}
