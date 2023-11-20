package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {
	
	@Test
	public void stringTest() {
		String str = "ABC";
		String str1 = new String("ABC");
		String str2 = "ABC";
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println("================");
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println("================");
		String str3 = "aBC";
		System.out.println(str.equals(str3));
		System.out.println(str.equalsIgnoreCase(str3));
	}
	
	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		System.out.println(str.length());
		System.out.println("str1 length: " + str1.length());
		System.out.println("str2 length: " + str2.length());
		System.out.println("================");
		// isEmpty() 是看字串的長度是否為0
		System.out.println("str1 isEmpty: " + str1.isEmpty());
		System.out.println("str2 isEmpty: " + str2.isEmpty());
		System.out.println("================");
		// isBlank(): 1. 長度為0 ;2. 字串內容由全空白組成；滿足條件 1 或 2 則回傳 true 
		System.out.println("str1 isBlank: " + str1.isBlank());
		System.out.println("str2 isBlank: " + str2.isBlank());
	}
	
	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String name = dog.getName();
		String color = dog.getColor();
		System.out.println(name);
		System.out.println(color);
		System.out.println("================");
		System.out.println(name.length());
//		System.out.println(color.length());
		System.out.println(color == null);
		System.out.println("================");
		if (color == null || color.isBlank()) {
			System.out.println("color 是空字串!!");
		} else {
			System.out.println("color 不是空字串!!");
		}
		System.out.println("=================");
		System.out.println(StringUtils.hasLength("  "));
		System.out.println(StringUtils.hasText("  "));
		System.out.println("=================");
		color = "";
		if (color.isBlank()) {
			System.out.println("color 沒有內容!!");
		} else {
			System.out.println("color 有內容!!");
		}
		
		System.out.println("=================");
		
		if (StringUtils.hasText(color)) {
			System.out.println("color 有內容!!");
		} else {
			System.out.println("color 沒有內容!!");
		}
		
		System.out.println("=================");
		System.out.println("=================");
		if (!StringUtils.hasText(color)) {
			System.out.println("color 沒有內容!!");
		} else {			
			System.out.println("color 有內容!!");
		}
	}
	
	@Test
	public void searchTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，"
				+ "雖然小龍女在楊過眼中是清新脫俗";
		String ans = "小龍女";
		int count = 0;
		int index = 0;
//		for(; ;) {
//			if (str.indexOf(ans, index) == -1) {
//				break;
//			}
//			count++;
//			index = str.indexOf(ans, index) + ans.length();
//		}
//		System.out.println(count);
//		System.out.println("========================");
//		while(str.indexOf(ans, index) != -1) {
//			count++;
//			index = str.indexOf(ans, index) + ans.length();
//		}
//		System.out.println(count);
//		System.out.println("========================");
		for(;str.indexOf(ans, index) != -1;) {
			count++;
			index = str.indexOf(ans, index) + ans.length();
		}
		System.out.println(count);
	}
	
	@Test
	public void replaceTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，"
				+ "雖然小龍女在楊過眼中是清新脫俗";
		str = str.replace("小龍女", "小龍包");
		System.out.println(str);
		System.out.println("========================");
		str = str.replaceAll("小龍包", "小龍湯包");
		System.out.println(str);
	}
	
	@Test
	public void splitTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，"
				+ "雖然小龍女在楊過眼中是清新脫俗";
		String[] array = str.split("，");
		for(String item : array) {
			System.out.println(item);
		}
		System.out.println("===============");
		String str1 = "ABCD";
		String[] array1 =str1.split("");
		for(String item : array1) {
			System.out.println(item);
		}
	}
	
	@Test
	public void trimTest() {
		String str = "ABC  DEF G";
		String str1 = " ABC DEF ";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println("============");
		str = str.replace(" ", "");
		System.out.println(str);
	}
	
	@Test
	public void substringTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事";
		String substr = str.substring(5);
		String substr1 = str.substring(5, 11);
		System.out.println(substr);
		System.out.println(substr1);
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		sb.append("GGG");
		sb.append("AAA").append("BBB");
		System.out.println("================");
		String str = "ABC" + "DEF" + "GGG" + "AAA" + "BBB";
	}
	
	@Test
	public void stringBufferTest1() {
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb.equals(sb1));
		System.out.println("================");
		System.out.println(sb.toString().equals(sb1.toString()));
	}
	
	@Test
	public void stringBufferTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		if (str.equals(sb.reverse().toString())) {
			System.out.println(str + " 是迴文!");
		} else {
			System.out.println(str + " 不是迴文!");
		}
	}
	
	@Test
	public void stringBufferTest3() {
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("請輸入2個以上的文字");
			String str = scan.next();
			if (str.length() <= 2) {
				System.out.println("Try again!!");
				continue;
			}
			StringBuffer sb = new StringBuffer(str);
			if (str.equals(sb.reverse().toString())) {
				System.out.println(str + " 是迴文!");
			} else {
				System.out.println(str + " 不是迴文!");
			}
			break;
		}		
	}
	
	@Test
	public void replaceTest1() {
		String str = "ABACADEF";
		int index = str.lastIndexOf("A"); // index = 4
		String lastString = str.substring(index);// lastString = ADEF
		lastString = lastString.replace("A", "W"); // lastString = WDEF
		str = str.substring(0, index) + lastString; //str.substring(0, index) = ABAC; 
		System.out.println(str);
	}
	
	@Test
	public void replaceTest2() {
		String str = "ABACADEF";
		int index = str.lastIndexOf("A"); // index = 4
		StringBuffer sb = new StringBuffer(str);
		sb.setCharAt(index, 'W');
		System.out.println(sb.toString());
	}
	
	@Test
	public void listTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int inputInt = scan.nextInt();
		inputInt++;
		String str = String.valueOf(inputInt);
		String[] strArray = str.split("");
		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
	}

}
