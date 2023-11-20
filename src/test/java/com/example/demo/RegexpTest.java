package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {
	
	@Test
	public void regexpTest() {
		String str = "0912-345-678";
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		String pattern = "\\d{4}(-\\d{3}){2}";
		System.out.println(str.matches(pattern));
	}
	
	@Test
	public void regexpTest2() {
//		String pattern = "(\\d{2})\\d{8}";//格式: 2碼8碼,不包含小括號;小括號只是分組用
		String pattern = "\\(\\d{2}\\)\\d{7}"; //格式: (2碼)7碼,包含小括號
		String pattern1 = "\\(\\d{2}\\)\\d{8}";//格式: (2碼)8碼,包含小括號
		String pattern2 = "\\d{2}-\\d{7}"; //格式: 2碼-7碼
		String pattern3 = "\\d{2}-\\d{8}"; //格式: 2碼-8碼
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入電話號碼:");
		System.out.println("電話格式為:(區碼2碼)電話號碼7碼或8碼");
		System.out.println("電話格式為:區碼2碼-電話號碼7碼或8碼");
		String input = scan.next();
		if (input.matches(pattern) || input.matches(pattern1) 
				||input.matches(pattern2) ||input.matches(pattern3)) {
			System.out.println(input + " 符合格式!!");
		} else {
			System.out.println(input + " 不符合格式!!");
		}
	}
	
	@Test
	public void regexpTest3() {
//		String pattern = "(\\d{2})\\d{8}";//格式: 2碼8碼,不包含小括號;小括號只是分組用
//		String pattern0 = "\\(\\d{2}\\)\\d{7}"; //格式: (2碼)7碼,包含小括號
//		String pattern1 = "\\(\\d{2}\\)\\d{8}"; //格式: (2碼)8碼,包含小括號
//		//以下是將 pattern0 和 pattern1 整合一起, 擇一使用
//		String patternA = "\\(\\d{2}\\)\\d{7}||\\(\\d{2}\\)\\d{8}"; //(02)1234567 or (02)12345678
//		String patternB = "\\(\\d{2}\\)(\\d{7}||\\d{8})";
//		String patternC = "\\(\\d{2}\\)\\d{7,8}";
//		
//		String pattern2 = "\\d{2}-\\d{7}"; //格式: 2碼-7碼
//		String pattern3 = "\\d{2}-\\d{8}"; //格式: 2碼-8碼
//		//pattern2 和 3 整合成 patternD
//		String patternD = "\\d{2}-\\d{7,8}";
		//patternC 和 D 整合
		String patternE = "(\\(\\d{2}\\)||\\d{2}-)\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入電話號碼:");
		System.out.println("電話格式為:(區碼2碼)電話號碼7碼或8碼");
		System.out.println("電話格式為:區碼2碼-電話號碼7碼或8碼");
		String input = scan.next();
		if (input.matches(patternE)) {
			System.out.println(input + " 符合格式!!");
		} else {
			System.out.println(input + " 不符合格式!!");
		}
	}
	
	@Test
	public void regexpTest4() {
		String str = "a";
		String str1 = "Ab";
		String pattern = "\\w";// \\w 占用一個字元, 但範圍限縮在 [A-Za-z0-9_]
		String pattern1 = "\\w."; // . 表示除了換行符號(\n)之外的其他所有字元, 但只佔一個字元
		// \\w 占用一個字元, 但範圍限縮在 [A-Za-z0-9_]；
		// .* 表示 0~多個字元，所以後面的字元可有(1~多個)可無
		String pattern2 = "\\w.*";
		System.out.println(str.matches(pattern));
		System.out.println(str1.matches(pattern));
		System.out.println("====================");
		System.out.println(str.matches(pattern1));
		System.out.println(str1.matches(pattern1));
		System.out.println("====================");
		System.out.println(str.matches(pattern2));
		System.out.println(str1.matches(pattern2));
	}
	
	@Test
	public void idCheckTest() {
		// 身分證比對，排除大小寫字母ABDEFH
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1,2]\\d{8}";
		String pattern2 = "([^ABDEFHabdefh\\W\\d_])[1,2]\\d{8}";
		String pattern3 = "([\\w&&[^\\d_ABDEFHabdefh]])[1,2]\\d{8}";
		String pattern4 = "([CGI-Zcgi-z])[1,2]\\d{8}";
	}

}
