package com.example.demo;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.TestA;
import com.example.demo.repository.TestADao;
import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;



@SpringBootTest
public class AtmServiceTest {
	
	@Autowired
	private AtmService atmService;
	
	@Autowired
	private TestADao testADao;
	
	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("A01", "AA123");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
	}
	
	@Test
	public void getBalanceByAccountTest() {
		atmService.getBalanceByAccount("A01", "AA123");
	}
	
	@Test
	public void aiTest() {
//		testADao.save(new TestA("CCC"));
		System.out.println(UUID.randomUUID());
	}

}
