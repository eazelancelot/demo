package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest1 {
	
	@Test
	public void forTest() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
//			sum = sum + i;
			sum += i;
		}
		System.out.println("1~10的總和: " + sum);
	}
	
	@Test
	public void forTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入第一個數字: ");
		int a = scan.nextInt();
		System.out.println("請輸入第二個數字: ");
		int b = scan.nextInt();
		int sum = 0;
		for(int i = a; i <= b; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.printf("%d~%d的總和: %d", a, b, sum);
	}
	
	@Test
	public void forTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入第一個數字: ");
		int a = scan.nextInt();
		System.out.println("請輸入第二個數字: ");
		int b = scan.nextInt();
		int sum = 0;
		for(int i = a; i <= b; i++) {
			System.out.println("i1 = " + i);
			if(i % 2 == 0) {
//				break;
				continue;
			}
			System.out.println("i2 = " + i);
//			sum = sum + i;
			sum += i;
		}
		System.out.printf("%d~%d的總和: %d", a, b, sum);
	}
	
	@Test
	public void whileTest() {
		int i = 1;
		int sum = 0;
		while(i <= 10) {			
			System.out.println("i = " + i);
			sum += i;
			i++;
		}
		System.out.printf("1~10的總和: %d", sum);
	}
	
	@Test
	public void tagTest() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j < i) {
					continue;
				}
				System.out.printf("%d*%d=%2d  ", i, j, i*j);
			}
			System.out.println("");
		}
	}
	
	@Test
	public void randomTest() {
//		System.out.println(Math.random());
		
		Random random = new Random();		
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(99)+1);
		}
	}
	
	@Test
	public void guessTest() {
		int floor = 1;
		int top = 99;
		Random random = new Random();
		int bom = random.nextInt(99) + 1;
		System.out.println("bom: " + bom);
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.printf("請在 %d ~ %d 之間猜個數字 \n", floor, top);
			int guess = scan.nextInt();
			//排除輸入的數字不在範圍內
			if (guess > top || guess < floor) {
				continue;
			}
			//猜對數字
			if (guess == bom) {
				System.out.printf("猜對了!! \n");
				break;
			}
			//猜的數字大於炸彈
			if (guess > bom) {
				top = guess;
			} else {
				floor = guess;
			}
		}
	}

}
