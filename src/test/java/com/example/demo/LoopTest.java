package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {

	@Test
	public void loopTest() {
		System.out.println("================");
		for (int i = 1; i < 5; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("================");
		for (int i = 1; i < 5; ++i) {
			System.out.println("i = " + i);
		}
	}

	@Test
	public void loopTest2() {
		a: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					break a;
				}
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}

	}

	@Test
	public void randomTest() {
		// 公式: (區間上限值 - 區間下限值 + 1) + 區間下限值
		// 1~99: 區間上限值 = 90；區間下限值 = 1
		double random = Math.random() * (99 - 1 + 1) + 1;
		// 20~50: 區間上限值 = 50；區間下限值 = 201
		double random1 = Math.random() * (50 - 20 + 1) + 20;
		System.out.println("=============================");

		Random ran = new Random();
		// Random 類別裡的 nextInt(整數i):會產生 0~小於輸入整數i的值
		// 產生 1 ~ 99，
		int a = ran.nextInt(99) + 1;
		// Random 類別裡的 nextInt(整數1, 整數2):會產生大於等於整數1 ~ 小於整數2的值
		// 產生 20 ~ 80，
		int b = ran.nextInt(1, 81);
	}

	@Test
	public void guessTest() {
		Scanner scan = new Scanner(System.in);
		int max = 99;
		int min = 1;
		int ans = (int) (Math.random() * (99 - 1 + 1)) + 1;
		int input;
		for (;;) {
			System.out.printf("請在 %d ~ %d 之間猜一個數字:", min, max);
			input = scan.nextInt();
			if (input < min || input > max) {
				continue;
			} else if (input == ans) {
				System.out.println("猜對了!!");
				break;
			} else if (input > ans) {
				max = input;
			} else if (input < ans) {
				min = input;
			}
		}
	}

	@Test
	public void guessTest1() {
		Scanner scan = new Scanner(System.in);
		int max = 99;
		int min = 1;
		int ans = (int) (Math.random() * (99 - 1 + 1)) + 1;
		int input;
		for (;;) {
			System.out.printf("請在 %d ~ %d 之間猜一個數字:", min, max);
			input = scan.nextInt();
			if (input < min || input > max) {
				continue;
			} 
			if (input == ans) {
				System.out.println("猜對了!!");
				break;
			} 
			if (input > ans) {
				max = input;
			} else {
				min = input;
			}
		}
	}

}
