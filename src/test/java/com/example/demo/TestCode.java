package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Car;

public class TestCode {

	@Test
	public void firstTest() {
		int a = 6; //宣告
//		System.out.println(a);
		String x = "ABC";
		String y = x + a;
		System.out.println(y);
	}
	
	// 一元運算式
	@Test
	public void test2() {		
		// 一元運算式: ++ 或 --
		// 遞增: a++  ==> a = a + 1
		// 遞增: ++a  ==> a = a + 1
		// 遞減: a--  ==> a = a - 1
//		int a = 6; //宣告
//		System.out.println("a = " + a);
//		//++在變數 a 的後面，所以是先把變數 a 的值賦予給變數 x，之後再對 a + 1
//		int x = a++;
//		System.out.println("a = " + a);
//		System.out.println("x = " + x);
//		System.out.println("====================");
//		int b = 6; //宣告
//		System.out.println("b = " + b);
//		//++在變數 b 的前面，所以是對變數 b 做 b+1，再把結果的值賦予給變數 y
//		int y = ++b;
//		System.out.println("b = " + b);
//		System.out.println("y = " + y);
//		System.out.println("====================");
		int c = 99;
//		int c1 = ++c;
		System.out.println(++c);
		System.out.println(c);
		System.out.println(--c);
		System.out.println(c);
		System.out.println("====================");
		int d = 99;
//		int d1 = d++;
		System.out.println(d++);
		System.out.println(d);
		System.out.println(d--);
		System.out.println(d);
		System.out.println("====================");
		int q1 = 100;
		int q2 = 101;
		int qq = 5 > 4 ?  q1 : q2;
		System.out.println(qq);
	}
	
	//反向運算
	@Test
	public void test3() {
		boolean boo = 100 > 101;
		System.out.println(boo);
		System.out.println(!boo);
		System.out.println("====================");
		boolean boo1 = !(100 > 101);
		System.out.println(boo1);
		System.out.println(!boo1);
		System.out.println("====================");
		boolean boo2 = 100 == 101;
		System.out.println(boo2);
		System.out.println("====================");
		boolean boo3 = 100 != 101;
		System.out.println(boo3);
	}
	
	@Test
	public void scannerTest() {
		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入數字: ");
//		int x = scan.nextInt();
//		System.out.println("輸入的數字是: " + x);
//		System.out.println("==========================");
//		System.out.println("請輸入文字: ");
//		String y = scan.next();
//		System.out.println("輸入的文字是: " + y);
//		System.out.println("==========================");
		System.out.println("請輸入文字: ");
		String z = scan.nextLine();
		System.out.println("輸入的文字是: " + z);
	}
	
	@Test
	public void listTest() {
		Car car = new Car();
		List<String> strList = car.getStrList();
		for (String str : strList) {
			System.out.println("===============");
		}
	}
}
