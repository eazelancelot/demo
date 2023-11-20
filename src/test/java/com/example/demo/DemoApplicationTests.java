package com.example.demo;

import org.junit.jupiter.api.Test;

//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void firstTest() {
		int a = 123456789;
		long b = 12345678912L;
		System.out.println(a);
//		String str = new String("ABC");
		String str = "123";
		String str1 = "ABC";
		System.out.println(str + str1);
	}

}
