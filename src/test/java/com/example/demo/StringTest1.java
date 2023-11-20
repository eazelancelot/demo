package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.TaipeiBank1;

public class StringTest1 {
	
	@Test
	public void stringTest() {
		String str1 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println("=============");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println("=============");
		String str4 = "aBC";
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str4));
	}
	
	@Test
	public void stringTest2() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		System.out.println("str 長度: " + str.length());
		System.out.println("str1 長度: " + str1.length());
		System.out.println("str2 長度: " + str2.length());
		System.out.println("=============");
		System.out.println("str is empty: " + str.isEmpty());
		System.out.println("str1 is empty: " + str1.isEmpty());
		System.out.println("str2 is empty: " + str2.isEmpty());
		System.out.println("=============");
		System.out.println("str is blank: " + str.isBlank());
		System.out.println("str1 is blank: " + str1.isBlank());
		System.out.println("str2 is blank: " + str2.isBlank());
		System.out.println("=============");
		String str3 = null;
		System.out.println(str3 == null);
	}
	
	@Test
	public void stringTest3() {
		TaipeiBank1 bank = new TaipeiBank1();
		String branch = bank.getBranch();
		System.out.println(branch == null);
		if (branch == null || branch.isBlank()) {
//			 branch 不得為 null、空字串、全空白
			System.out.println("branch is not ok!!");
		} else {
			System.out.println("branch is ok!!");
		}
		System.out.println("=====================");
		if (!StringUtils.hasText(branch)) {
//			 branch 不得為 null、空字串、全空白
			System.out.println("branch is not ok!!");
		} else {
			System.out.println("branch is ok!!");
		}
	}
	
	@Test
	public void stringTest4() {
		String str = "ABCDBCAD";
		System.out.println(str.indexOf("B"));
		System.out.println(str.indexOf("B", 1));
		System.out.println(str.indexOf("B", 6));//找不到，會回 -1
		System.out.println("=====================");
		System.out.println(str.lastIndexOf("B"));
		System.out.println("=====================");
		System.out.println(str.contains("D"));
		System.out.println(str.contains("d"));
	}
	
	@Test
	public void stringTest5() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String keyword = "小龍女";
		int count = 0;
		int startIndex = 0;
		while(true) {
			startIndex = str.indexOf(keyword, startIndex);
			if (startIndex == -1) {
				break;
			}
			count++;
			startIndex += keyword.length();
		}
		System.out.println(count);
	}
	
	//replace:替換字串
	@Test
	public void stringTest6() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		System.out.println(str);
		// replace 是取代全部相符的字串
		str = str.replace("小龍女", "小龍包");
		System.out.println(str);
		System.out.println("==================");
		// replace 是取代全部相符的字串，主要是用在正規表達式
		str = str.replaceAll("小龍包", "小龍菜包");
		System.out.println(str);
	}
	
	//substring:擷取字串
	@Test
	public void stringTest7() {
		String str = "ABCDEF";
		System.out.println(str);
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 4));
	}
	
	//split:分割
	@Test
	public void stringTest8() {
		String str = "A, B,C, D,E, F ";
		String[] strArray = str.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("==================");
		// foreach:遍歷
		for (String item : strArray) {
			System.out.println(item);
		}
	}
	
	@Test
	public void stringTest9() {
		String str = "ABCDEF";
		String[] strArray = str.split("");
		for (String item : strArray) {
			System.out.println(item);
		}
		System.out.println("==================");
	}
	
	//用 replace 消除空白
	@Test
	public void stringTest10() {
		String str = "A,  B,C, D,E, F ";
		str = str.replace(" ", ""); // str = "A,B,C,D,E,F"
		String[] strArray = str.split(",");
		// foreach:遍歷
		for (String item : strArray) {
			System.out.println(item);
		}
	}
	
	// trim:刪除字串的前後空白 
	@Test
	public void stringTest11() {
		String str = "   A,  B,C, D,E, F  ";
		str = str.trim();
		System.out.println(str);
	}
	
	// foreach: lambda
	@Test
	public void stringTest12() {
		List<String> strList = new ArrayList<>(Arrays.asList("A", "B", "C"));
		for(String item : strList) {
			System.out.println(item);
		}
		System.out.println("====================");
		// lambda
		strList.forEach(item -> {
			System.out.println(item);
		});
	}
	
	@Test
	public void stringTest13() {
		String str = "ABACADEF";
		int lastIndex = str.lastIndexOf("A");
		str = str.substring(0, lastIndex) + "W" + str.substring(lastIndex + 1);
		System.out.println(str);
	}
	
	@Test
	public void stringTest14() {
		String str = "ABACADEF";
		int lastIndex = str.lastIndexOf("A");
		String lastStr = str.substring(lastIndex);
		lastStr = lastStr.replace("A", "W");
		str = str.substring(0, lastIndex) + lastStr;
		System.out.println(str);
	}
	
	@Test
	public void stringTest15() {
		String str = "ABC";
		str = str + "DEF";
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb.equals(str));
		System.out.println(sb.toString().equals(str));
		sb = sb.reverse();
		System.out.println(sb.toString());
	}
	
	@Test
	public void stringTest16() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String input = scan.next();
		if (input.equals(new StringBuffer(input).reverse().toString())) {
			System.out.println("是迴文!!");
		} else {
			System.out.println("不是迴文!!");
		}
	}
	
	@Test
	public void stringTest99() {
		StringBuffer sb = new StringBuffer("ABACADEF");
		int lastIndex = sb.lastIndexOf("A");
		sb.setCharAt(lastIndex, 'W'); // 結果不需要接回來
		System.out.println(sb.toString());
	}

}
