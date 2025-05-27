package com.java8.custom;

import java.util.Objects;

public class Person {

	private int age;
	private String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		
		Person p = (Person) obj;
		return age == p.age && Objects.equals(name, p.name);
	}

}
