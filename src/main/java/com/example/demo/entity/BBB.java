package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bbb")
public class BBB {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "a_id")
	private int aId;

	@Column(name = "city")
	private String city;

	public BBB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BBB(int aId, String city) {
		super();
		this.aId = aId;
		this.city = city;
	}

	public BBB(int id, int aId, String city) {
		super();
		this.id = id;
		this.aId = aId;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
