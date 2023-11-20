package com.example.demo.entity;

public class TaipeiBank1 {

	private String branch;

	private String user;

	private int balance;

	// 建構方法(Constructor): 方法名稱與類別名稱相同
	// 預設建構方法: 方法不帶任何參數
	public TaipeiBank1() {
		super();
	}

	// 一般建構方法: 方法需要帶參數
	public TaipeiBank1(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款
	// balance = 2000;
	// amount = 3000;
	public int saving(int amount) {
		if (amount < 0) {
			return this.balance;
		}
		this.balance += amount;
		return this.balance;
	}

	// 提款
	public int withdraw(int amount) {
		if (amount > this.balance || amount <= 0) {
			return this.balance;
		}
		this.balance -= amount;
		return this.balance;
	}

}
