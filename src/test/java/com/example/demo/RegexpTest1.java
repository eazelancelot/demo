package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest1 {
	
	@Test
	public void test() {
		String str = "\\";
		System.out.println(str);
		System.out.println(str.length());
	}
	
	@Test
	public void test2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼:");
		String input = scan.next();
		// 手機格式: 4個數字-3個數字-3個數字
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		String pattern = "\\d{4}-\\d{3}-\\d{3}"; //用大括號{}處理重複出現的部分
		String pattern = "\\d{4}(-\\d{3}){2}"; //用小括號將同一個區塊框起來
		if (input.matches(pattern)) {
			System.out.println(input + "符合手機格式!!");
		} else {
			System.out.println(input + "不符合手機格式!!");
		}
		
	}
	
	@Test
	public void test3() {
		Scanner scan = new Scanner(System.in);		
	//市話格式: (區碼2個號碼)7個號碼；(07)7654321
		//1. (07)-7654321；2. 07-7654321
		String pattern = "(\\d{2})-\\d{7}";
		for (int i = 0; i < 2; i++) {
			System.out.println("請輸入電話號碼:");
			String input = scan.next();
			if (input.matches(pattern)) {
				System.out.println(input + "符合電話格式!!");
			} else {
				System.out.println(input + "不符合電話格式!!");
			}
		}		
		System.out.println("()");
		System.out.println("\\(");
	}
	
	@Test
	public void test4() {
		Scanner scan = new Scanner(System.in);
		String pattern = "(\\d{2}||\\d{3})-\\d{7}";
		System.out.println("請輸入電話號碼:");
		String input = scan.nextLine();
		if (input.matches(pattern)) {
			System.out.println(input + "符合電話格式!!");
		} else {
			System.out.println(input + "不符合電話格式!!");
		}
	}

}
