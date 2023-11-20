package com.example.demo.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class TestA {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	private UUID uuid;

	public TestA() {
		super();
	}

	public TestA(String name) {
		super();
		this.name = name;
	}
	
	public TestA(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
