package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.service.ifs.RunService;

public class Car implements RunService {

	private List<String> strList = new ArrayList<>();
	
	private String name;

	@Override
	public void run() {
		System.out.println("飆車");

	}

	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
