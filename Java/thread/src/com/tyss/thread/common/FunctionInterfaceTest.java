package com.tyss.thread.common;

public class FunctionInterfaceTest {
	public static void main(String[] args) {
		
		FunctionalInterfaceTwo interfaceTwo = (a ,b)->
			System.out.println(a +" " + b);
		
			interfaceTwo.getData("ELf", "Training");
	}
}
