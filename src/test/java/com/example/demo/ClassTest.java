package com.example.demo;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

public class ClassTest {
	
	@Test
	public void classTest() {
		Dog yourDog = new Dog();
		System.out.println(yourDog.getName());
		yourDog.setName("cat");
		System.out.println("=================");
		Dog myDog = new Dog();
		System.out.println(myDog.getName());
		myDog.setName("monkey");
		System.out.println(yourDog.getName());
		System.out.println(myDog.getName());
		System.out.println("================");
	}
	
	@Test
	public void classTest1() {
		Dog dog = new Dog();
		dog.setAttributes("yellow", "Lily", 2);
		System.out.println("================");
	}
	
	@Test
	public void classTest2() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance());
		Assert.isTrue(bank.getBalance() == 1000, "saving error!!");		
		bank.saving(-500);
		Assert.isTrue(bank.getBalance() == 1000, "saving error!!");
//		System.out.println(bank.getBalance());
		bank.saving(500);
		Assert.isTrue(bank.getBalance() == 1500, "saving error!!");
//		System.out.println(bank.getBalance());
	}
	
	@Test
	public void classTest3() {
//		TaipeiBank bank = new TaipeiBank();
//		System.out.println(bank);
		System.out.println(new TaipeiBank());
		Dog dog = new Dog();
		System.out.println(dog);
		System.out.println("==================");
		Dog dogg = new Dog();
		System.out.println(dogg);
		System.out.println("==================");
		System.out.println(dog == dogg);
		Dog doggg = dog;
		System.out.println(doggg);
		System.out.println(dog == doggg);
//		bank.saving1(dog);
	}
	
	@Test
	public void classTest4() {
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		System.out.println("==================");
		Integer a1 = 10;
		Integer b1 = 10;
		System.out.println(a1 == b1);
		System.out.println("==================");
		Integer a2 = new Integer(10);
		Integer b2 = new Integer(10);
		System.out.println("a2 == b2: " + (a2 == b2));
		System.out.println("==================");
		boolean boo1 = false;
		boolean boo2 = false;
		Boolean boo3 = true;
		System.out.println(boo1 == boo2);
		
	}
	
	@Test
	public void classTest5() {
		TaipeiBank bank = new TaipeiBank();
		int a = 10;
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		if (a > 20) {
			System.out.println("==============");
		}
		int b = 20;
		System.out.println(b);
		System.out.println(a);
		b = 30;
	}
	
	@Test
	public void classTest6() {
		Dog dog = new Dog();
		dog.setName("Lily");
		dog.setColor("bule");
		dog.setAge(2);
		System.out.println("====================");
		Dog dogg = new Dog("QQQQ", "GGG", 3);
		System.out.println("====================");
	}
	
	@Test
	public void classTest7() {
		Dog dog = new Dog();
		dog.setAttributes();//一般方法的呼叫，必須要先把類別 new 出來
		Dog.setAttributes2();// static 方法的呼叫，直接用類別名稱.static 方法
		System.out.println("====================");
		Math.random();
		Random ran = new Random();
		ran.nextInt();
		System.out.println("====================");
		int aaaa = 100;
		aaaa = 200;
		final int bbbb = 50;
	}

}
