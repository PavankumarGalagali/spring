package com.tyss.elftraining.exceptions;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		MainClass class1 = new MainClass();
		
		try {
			class1.printData();
			class1.readFile();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
