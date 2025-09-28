package com.java8.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatingElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,4,5,2,6,7);
		
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Entry<Integer, Long> entry = collect.entrySet().stream().filter(s->s.getValue()>1).findFirst().get();
		//System.out.println("=> "+entry.getKey());
		
		Integer integer = list.stream().filter(lst -> Collections.frequency(list, lst)>1).findFirst().get();
		System.out.println(integer);
		
		//sum of the list
		Integer reduce = list.stream().reduce(0, (a,b)->a+b);
		System.out.println(reduce);
		
		// print sum of array
		int[] arr =  new int[] {1,2,3,4,5,6};
		
		//Stream.of(arr).reduce(arr, 0, (a,b) -> a+b);
		
		int reduce3 = Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println(reduce3);
	}


}












