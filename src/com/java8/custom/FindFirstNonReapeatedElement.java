package com.java8.custom;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonReapeatedElement {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(5,2,5,7,10,4,2,7,9,4,2,7);
	Map<Integer, Long> res = asList.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
	res.forEach((k,v)->{
		if(k==1) {
			System.out.println(v);
		}
		else {System.out.println("===");}
	});

	}

}
