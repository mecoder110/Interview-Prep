package com.java8.code2;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A08_FindTheFirstRepeatedCharacter {

	public static void main(String[] args) {

		String name = "Java Articles are Awesome";

	Character key = name.chars().mapToObj(s->Character.valueOf((char)s))
		
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(c->c.getValue()>=2).findFirst().get().getKey();
		
				System.out.println(key);
	}

}
