package com.tyss.thread.common;

public class Test {

	public static void main(String[] args) {
	
		MyFunctionalInterface ref1 = n ->{
			System.out.println("success");
			System.out.println(n);
			return false;
		};
		 System.out.println(ref1.getData("ELF"));
		System.out.println(" -----------------");
		MyFunctionalInterface ref2 = name->{
			System.out.println(" ELF ");
			System.out.println(name);
			return true;
		};
		
		System.out.println(ref2.getData("Training"));
	}
}
