package com.tyss.elftraining.common;

import java.io.FileInputStream;
import java.io.IOException;

import com.tyss.elftraining.basic.MainClass;
public class SubMainClass extends MainClass {

	public static void main(String[] args) {

		int a = 20;
		int b = 0;
		int res = a/b;
		System.out.println(res);
		
		
//		try {
//			String str = null;
//			str.charAt(0);
//			FileInputStream fileInputStream = new FileInputStream("src/emo.txt");
//			int i = fileInputStream.read();
//			
//			while( i != -1) {
//				char data = (char) i;
//				System.out.print(data);
//				i = fileInputStream.read();
//			}
//			fileInputStream.close();
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
	}
}
