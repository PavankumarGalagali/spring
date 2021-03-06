package com.tyss.mapinterface.common;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.id - o.id;
	}
}
