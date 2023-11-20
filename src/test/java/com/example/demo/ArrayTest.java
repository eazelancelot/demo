package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;

public class ArrayTest {
	
	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a);
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 5;
		System.out.println(a);
		System.out.println("==================");
		//宣告的同時給予初始值
		int[] b = {1, 3, 5, 7, 9};
		System.out.println(b[4]);
		for(int item : b) {
			System.out.println(item);
		}
	}
	
	@Test
	public void listTest() {
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("C");
		strList.add("D");
		strList.add("B");
		//List 是有順序的，依照加入的先後順序
		System.out.println(strList);
		System.out.println("===============");	
		System.out.println(strList.size());
		System.out.println("===============");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===============");
		List<String> strList1 = List.of("A", "S", "D", "F");
		List<String> strList2 = Arrays.asList("A1", "S1", "D1", "F1");
		//執行下一行程式會報錯 因為用 List.of() 產生的 List 其大小固定，無法再增刪
//		strList1.add("G");
		//執行下一行程式會報錯 因為用 Arrays.asList() 產生的 List 其大小固定，無法再增刪
//		strList2.add("G1");
		System.out.println("===============");
		//可透過以下方法宣告一個動態空間並同時給予預設值，
		List<String> strList3 = new ArrayList<>(List.of("A", "S", "D", "F"));
		List<String> strList4 = new ArrayList<>(Arrays.asList("A1", "S1", "D1", "F1"));
	}
	
	@Test
	public void foreachTest() {
		List<String> strList = new ArrayList<>(List.of("A", "S", "D", "F"));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===============");
		//foreach: 遍歷，意思是指將 List 裡的每個項目從頭到尾一個一個取出
		for(String item : strList) {
			System.out.println(item);
		}
		System.out.println("===============");
		strList.forEach(item -> {
			System.out.println(item);
		});
	}
	
	@Test
	public void listTest1() {
		int a = 5;
		int[] b = new int[5];
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void listTest2() {
		int a = 5;
		int[] b = new int[5];
		System.out.println(a);
		System.out.println(b);
	}

}
