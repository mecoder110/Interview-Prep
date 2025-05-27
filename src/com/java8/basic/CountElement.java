package com.java8.basic;

import java.util.Arrays;
import java.util.List;

public class CountElement {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 5, 3, 6, 9, 4, 2, 6, 9);
long count = asList.stream().filter(n -> n>5).count();
System.out.println(count);
	}

}
