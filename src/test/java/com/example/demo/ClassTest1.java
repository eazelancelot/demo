package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog1;
import com.example.demo.entity.TaipeiBank1;

public class ClassTest1 {
	
	@Test
	public void dogTest() {
		Dog1 dog = new Dog1();
		System.out.println(dog);
		System.out.println("狗兒的名字: " + dog.getName());
		System.out.println("狗兒的顏色: " + dog.getColor());
		System.out.println("狗兒的年齡: " + dog.getAge());
		dog.setName("威士忌");
		dog.setColor("黑白");
		dog.setAge(2);
		System.out.println("狗兒的名字: " + dog.getName());
		System.out.println("狗兒的顏色: " + dog.getColor());
		System.out.println("狗兒的年齡: " + dog.getAge());
		System.out.println("======================");
		Dog1 dogg = new Dog1();
		System.out.println(dogg);
		System.out.println("狗兒的名字: " + dogg.getName());
		System.out.println("狗兒的顏色: " + dogg.getColor());
		System.out.println("狗兒的年齡: " + dog.getAge());
	}
	
	@Test
	public void dogTest2() {
		Dog1 dog = new Dog1();
		System.out.println(dog);
		Dog1 dog1 = dog;
		System.out.println(dog1);
		System.out.println(dog == dog1);
		System.out.println("===================");
		Dog1 dog2 = new Dog1();
		System.out.println(dog2);
		System.out.println(dog == dog2);
	}
	
	@Test
	public void bankSavingTest() {
		TaipeiBank1 bank = new TaipeiBank1();
		bank.setBranch("KH");
		bank.setUser("A01");
		bank.setBalance(1000);
		
		int balance = bank.saving(-2000);
//		System.out.println(balance == 1000);
		Assert.isTrue(balance == 1000, "金額錯誤!!");
		balance = bank.saving(2000);
		Assert.isTrue(balance == 3000, "金額錯誤!!");
	}
	
	@Test
	public void bankWithdrawTest() {
		TaipeiBank1 bank = new TaipeiBank1("KH", "A01", 1000);
//		bank.setBranch("KH");
//		bank.setUser("A01");
//		bank.setBalance(1000);
		
		int balance = bank.withdraw(-2000);
		Assert.isTrue(balance == 1000, "金額錯誤!!");
		balance = bank.withdraw(2000);
		Assert.isTrue(balance == 1000, "金額錯誤!!");
		balance = bank.withdraw(1000);
		Assert.isTrue(balance == 0, "金額錯誤!!");
	}

}
