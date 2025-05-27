package com.java8.custom;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistintPerson {

	public static void main(String[] args) {
		List<Person> asList = Arrays.asList(new Person(30, "ALi"), new Person(30, "Rizvi"), new Person(24, "Waqar"),
				new Person(30, "ALi"));

		List<Person> persona = asList.stream().distinct().collect(Collectors.toList());
		
		persona.forEach(System.out::println);

	}

}
