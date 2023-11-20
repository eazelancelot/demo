package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void ifTest() {
		int a = 5;
		if (a > 5) {
			System.out.println("===========");
		} else {
			System.out.println("+++++++++++");
		}
	}

	@Test
	public void ifTest1() {
		int a = 5;
		if (a > 5) {
			System.out.println("===========");
		} else if (a > 6) {
			System.out.println("+++++++++++");
		} else {
			System.out.println("-----------");
		}
	}

	@Test
	public void ifTest2() {
		int a = 5;
		if (a > 5) {
			System.out.println("===========");
			System.out.println("===========+++");
		}
	}

	@Test
	public void switchTest() {
		int a = 95;
		int b = 95 / 10;
		double c = 95.0 / 10;
		System.out.println(b);
		System.out.println(c);
	}

	@Test
	public void scannerTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字:");
		String a = scan.next();
		System.out.println("輸入的文字是: " + a);
	}

	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字:");
		String a = scan.next();
		String b = scan.next();
		System.out.println("輸入的文字是: " + a + b);
	}

	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字:");
		String a = scan.nextLine();
		System.out.println("輸入的文字是: " + a);
	}

	@Test
	public void scannerTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int a = scan.nextInt();
		System.out.println("輸入的數字是: " + a);
	}

	@Test
	public void switchTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績:");
		int input = scan.nextInt();
		switch (input / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
	}

	@Test
	public void switchTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是星期幾:");
		String inputStr = scan.next();
		int weekday = 0;
//		String[] strArray = {"日", "天", "一", "二", "三", "四", "五", "六"};
		switch(inputStr) {
			case "日":
			case "天":
				weekday = 7;
				break;
			case "六":
				weekday = 6;
				break;
			case "五":
				weekday = 5;
				break;
			case "四":
				weekday = 4;
				break;
			case "三":
				weekday = 3;
				break;
			case "二":
				weekday = 2;
				break;
			case "一":
				weekday = 1;
				break;			
		}
		System.out.println("請輸入幾天後的天數:");
		int days = scan.nextInt();
		switch((weekday+days)%7) {
			case 0:
				System.out.printf("今天是星期%s, %d天後是星期天", inputStr, days);
				break;
			case 1:
				System.out.printf("今天是星期%s, %d天後是星期一", inputStr, days);
				break;
			case 2:
				System.out.printf("今天是星期%s, %d天後是星期二", inputStr, days);
				break;
			case 3:
				System.out.printf("今天是星期%s, %d天後是星期三", inputStr, days);
				break;
			case 4:
				System.out.printf("今天是星期%s, %d天後是星期四", inputStr, days);
				break;
			case 5:
				System.out.printf("今天是星期%s, %d天後是星期五", inputStr, days);
				break;
			case 6:
				System.out.printf("今天是星期%s, %d天後是星期六", inputStr, days);
				break;
		}
	}
	
	@Test
	public void switchTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是星期幾:");
		int inputInt = scan.nextInt();
		String weekday = switchDay(inputInt);			
		System.out.println("請輸入幾天後的天數:");
		int days = scan.nextInt();
		String output = switchDay((inputInt+days)%7);	
		System.out.printf("今天是星期%s, %d天後是星期%s", weekday, days, output);
	}
	
	public String switchDay(int inputInt) {
		String weekday = "";
		switch(inputInt) {
			case 0:
				weekday = "日";
				break;
			case 6:
				weekday = "六";
				break;
			case 5:
				weekday = "五";
				break;
			case 4:
				weekday = "四";
				break;
			case 3:
				weekday = "三";
				break;
			case 2:
				weekday = "二";
				break;
			case 1:
				weekday = "一";
				break;
		}
		return weekday;
	}
	
	@Test
	public void switchTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是星期幾:");
		int inputInt = scan.nextInt();
		String weekday = "日";
		switch(inputInt) {
			case 7:
				weekday = "日";
				break;
			case 6:
				weekday = "六";
				break;
			case 5:
				weekday = "五";
				break;
			case 4:
				weekday = "四";
				break;
			case 3:
				weekday = "三";
				break;
			case 2:
				weekday = "二";
				break;
			case 1:
				weekday = "一";
				break;
		}
		System.out.println("請輸入幾天後的天數:");
		int days = scan.nextInt();
		switch((inputInt+days)%7) {
			case 0:
				System.out.printf("今天是星期%s, %d天後是星期%s", weekday, days);
				break;
			case 6:
				System.out.printf("今天是星期%s, %d天後是星期%s", weekday, days);
				break;
			case 5:
				System.out.printf("今天是星期%s, %d天後是星期五", weekday, days);
				break;
			case 4:
				System.out.printf("今天是星期%s, %d天後是星期四", weekday, days);
				break;
			case 3:
				System.out.printf("今天是星期%s, %d天後是星期三", weekday, days);
				break;
			case 2:
				System.out.printf("今天是星期%s, %d天後是星期二", weekday, days);
				break;
			case 1:
				System.out.printf("今天是星期%s, %d天後是星期一", weekday, days);
				break;
		}
	}

}
