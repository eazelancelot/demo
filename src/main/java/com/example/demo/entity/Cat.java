package com.example.demo.entity;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println(super.getName() + " 邊吃邊打瞌睡!!!");
	}

	@Override
	public void sleep() {
		System.out.println(super.getName() + " 一直睡!!!");
	}

	public void barking() {
		System.out.println(super.getName() + " 肚子一直呼嚕叫!!!");
	}
}
