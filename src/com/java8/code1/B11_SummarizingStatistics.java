package com.java8.code1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class B11_SummarizingStatistics {

	public static void main(String[] args) {

		// Problem: Get summary statistics for a list of integers.
		
		List<Integer> asList = Arrays.asList(1, 1, 1, 2, 3, 4, 5, 3, 5, 7, 5, 3, 8, 4);

		IntSummaryStatistics summaryStatistics = asList.stream().mapToInt(Integer::intValue).summaryStatistics();
		
		System.out.println(summaryStatistics);
	}

}
