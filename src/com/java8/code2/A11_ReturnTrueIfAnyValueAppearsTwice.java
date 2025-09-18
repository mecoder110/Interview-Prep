package com.java8.code2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A11_ReturnTrueIfAnyValueAppearsTwice {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,2,3,4,2);
		
		Map<Integer, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Entry<Integer, Long>> list = collect.entrySet().stream().filter(s->s.getValue()>1).toList();
		if(list.size()>0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
