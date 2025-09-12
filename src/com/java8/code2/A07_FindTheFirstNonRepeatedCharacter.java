package com.java8.code2;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A07_FindTheFirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String name = "Mohd Baqar Murtaza Rizvi";

		IntStream chars = name.chars();
		
		Character key = chars.mapToObj(s->Character.valueOf((char)s))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1L).findFirst().get().getKey();
		
		System.out.println(key);
				
				
	}

}
