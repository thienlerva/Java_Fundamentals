package com.revature.pojos;

/*
 * Plain OL Java Objects
 * Almost like "Java Beans". less strict on conventional rules.
 */

public class Person {
	
	private String name;
	private String hobby;
	private int age;
	
	public Person() {
		
	}
	
	
	public Person(String name, String hobby, int age) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", hobby=" + hobby + ", age=" + age + "]";
	}
	
	

}
