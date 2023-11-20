package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest1 {
	
	@Test
	public void arrayTest() {
		int[] intArray = new int[5];
		System.out.println(intArray.length);
		intArray[0] = 1;
		System.out.println(intArray[0]);
		intArray[0] = 3;
		System.out.println(intArray[0]);
		intArray[1] = 5;
		intArray[2] = 6;
		intArray[3] = 7;
		intArray[4] = 8;
		int sum = 0;
		// for loop
//		for(int i = 0; i < intArray.length; i++) {
//			sum  = sum + intArray[i];
//		}
		// foreach
		for(int item : intArray) {
			sum  = sum + item;
		}
		System.out.println(sum);
		System.out.println("===================");
		int[] intArray2 = {1, 2, 4, 6, 9};
	}
	
	@Test
	public void listTest() {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(5);
		intList.add(2);
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("=================");
		for(Integer a : intList) {
			System.out.println(a);
		}
	}
	
	@Test
	public void listTest2() {
		List<Integer> intList = new ArrayList<>(Arrays.asList(1, 5, 2));
		for(Integer item : intList) {
			System.out.println(item);
		}
		System.out.println("================");
		intList.add(2);
		for(Integer item : intList) {
			System.out.println(item);
		}
		System.out.println("================");
		//宣告時用 Arrays.asList()，長度是根據預設值的個數
		List<Integer> intList2 = Arrays.asList(10, 20, 30);
		intList.addAll(intList2);
		for(Integer item : intList) {
			System.out.println(item);
		}
		System.out.println("================");
		//下一行執行時會出錯，因為 intList2 宣告時用 Arrays.asList() 給值，其長度固定
		intList2.addAll(intList);
		for(Integer item : intList2) {
			System.out.println(item);
		}
	}
	
	@Test
	public void test() {
//		int a = 5;
//		int b = 5;
//		System.out.println(a == b);
		String str = new String("abc");
		String str1 = new String("Abc");
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
//		System.out.println("==============");
		String str2 = "abc";
		String str3 = "abc";
//		System.out.println(str2 == str3);
//		System.out.println("==============");
	}
	
	@Test
	public void test2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字: ");
		int target = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < target; i++) {
//			System.out.println("i = " + i);
			if (target % i == 0) {
				int j = target/i;
				if (list.contains(i)) {
					break;
				}
				list.add(j);
				System.out.printf("%d = %2d * %2d \n", target, i, j);
			}
		}
	}
	
	@Test
	public void test4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個數字: ");
		int target = scan.nextInt();
		List<Integer> list = new ArrayList<>();		
//		int count = 0;
		for (int i = 2; i < target; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
//					count++;
					break;
				}
			}
			if (isPrime) {
				list.add(i);
			}
//			if (count > 0) {
//				list.add(i);
//			}
		}
		System.out.println(list);
	}

}
