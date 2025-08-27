package com.java8.code1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class B6_GroupingElements {

	public static void main(String[] args) {

		// Group users by age.

		List<User> asList = Arrays.asList(new User("Ali", 31), new User("Aliya", 27), new User("Waqar", 27),
				new User("Tahmeed", 1), new User("Fazan", 31));

		Map<Integer, List<User>> groupUser = asList.stream().collect(Collectors.groupingBy(User::getAge));
		System.out.println(groupUser);

		Map<Integer, Long> collect = asList.stream().peek(System.out::println)
				.collect(Collectors.groupingBy(User::getAge, Collectors.counting()));
		System.out.println(collect);
	}

}

class User {

	private String username;
	private int age;

	public User(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}

}
