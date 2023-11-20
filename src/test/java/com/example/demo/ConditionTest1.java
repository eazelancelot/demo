package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest1 {
	
	@Test
	public void ifTest() {
		int a = 6;
		int b = 12;
		if(a > b) {
			// 如果 a > b = true，執行此區塊
			System.out.println("+++++++++");
		} else {
			// 如果 a > b = false，執行此區塊
			System.out.println("---------");
		}
	}
	
	@Test
	public void ifTest2() {
		int a = 6;
		int b = 12;
		if (a > b) {
			// 如果 a > b = true，執行此區塊
			System.out.println("+++++++++");
		} else if (a == b) {
			// 如果 a == b = true，執行此區塊
			System.out.println("%%%%%%%%%");
		} else {
			// 如果上述的條件都不符合，執行此區塊
			System.out.println("---------");
		}
	}
	
	@Test
	public void ifTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字: ");
		int a = scan.nextInt();
		System.out.println("請再次輸入數字: ");
		int b = scan.nextInt();
		if (a > b) {
			// 如果 a > b = true，執行此區塊
			System.out.println("+++++++++");
		} else if (a == b) {
			// 如果 a == b = true，執行此區塊
			System.out.println("%%%%%%%%%");
		} else {
			// 如果上述的條件都不符合，執行此區塊
			System.out.println("---------");
		}
	}

	@Test
	public void ifTest4() {
		int a = 5;
		int b = 6;
		int c;
		if(a > b) {
			c = 20;
		} else {
			c = 30;
		}
		System.out.println("c = " + c);
		System.out.println("================");
		int d = a > b ? 20 : 30;
		System.out.println("d = " + d);
	}
	
	@Test
	public void ifTest5() {
		int hs = 151;
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入工時: ");
		int h = scan.nextInt();
		double total;
		if (h < 40 && h > 0) {
			total = hs*h*0.8;
			System.out.println(total);
		} else if(h == 40) {
			System.out.println(hs*h);
		} else if (h > 40 && h <= 50) {
			System.out.println(hs*h*1.2);
		} else if (h > 50){
			System.out.println(hs*h*1.6);
		}
	}
	
	@Test
	public void ifTest6() {
		int hs = 151;
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入工時: ");
		int h = scan.nextInt();
		if (h > 0) {
			if (h < 40) {
				System.out.println(hs*h*0.8);
			} else if(h == 40) {
				System.out.println(hs*h);
			} else if (h > 40 && h <= 50) {
				System.out.println(hs*h*1.2);
			} else {
				System.out.println(hs*h*1.6);
			}
		}
	}
	
	@Test
	public void switchTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績: ");
		int score = scan.nextInt();
		switch(score/10) {
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
		System.out.println("請問今天是星期幾: ");
		int weekday = scan.nextInt();
		System.out.println("請輸入天數: ");
		int days = scan.nextInt();
		int result = (weekday + days)%7;
		switch(result) {
			case 1:
				System.out.println("今天是星期" + weekday + "，" + days + "天後是星期一");
				break;
			case 2:
				System.out.printf("今天是星期%d，%d天後是星期二\n", weekday, days);
				break;
			case 3:
				System.out.println("今天是星期" + weekday + "，" + days + "天後是星期三");
				break;
			case 4:
				System.out.println("今天是星期" + weekday + "，" + days + "天後是星期四");
				break;
			case 5:
				System.out.println("今天是星期" + weekday + "，" + days + "天後是星期五");
				break;
			case 6:
				System.out.println("今天是星期" + weekday + "，" + days + "天後是星期六");
				break;
			default:
				System.out.println("今天是星期" + weekday + "，" + days + "天後是星期日");
		}
	}
	
	@Test
	public void switchTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請問今天是星期幾: ");
		int weekday = scan.nextInt();
		String str = switchDay(weekday);
		System.out.println("請輸入天數: ");
		int days = scan.nextInt();
		int result = (weekday + days)%7;
		String str1 = switchDay(result);
		System.out.printf("今天是星期%s，%d天後是星期%s\n", str, days, str1);
		
	}
	
	private String switchDay(int inputDay) {
//		int result = (weekday + days)%7;
		String str = "日";
		switch(inputDay) {
			case 1:
				str = "一";
				break;
			case 2:
				str = "二";
				break;
			case 3:
				str = "三";
				break;
			case 4:
				str = "四";
				break;
			case 5:
				str = "五";
				break;
			case 6:
				str = "六";
		}
		return str;
	}

}
