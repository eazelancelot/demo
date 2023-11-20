package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@SpringBootTest(classes = DemoApplication.class)
public class PersonInfoServiceTest {
	
	@Autowired
	private PersonInfoService personInfoService;
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	@Test
	public void addInfoTest() {
		personInfoService.addInfo(new PersonInfo("A223456789", "CCC", 28, "Kaohsiung"));
	}
	
	@Test
	public void addInfoTest2() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("K123456787", "KKK", 28, "Kaohsiung"));
		list.add(new PersonInfo("F123456787", "FFF", 30, "Taichung"));
		personInfoService.addInfoList(list);
	}
	
	@Test
	public void daoSaveAllTest() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("A123456787", "DDD", 28, "Kaohsiung"));
		list.add(new PersonInfo("E123456787", "EEE", 30, "Taichung"));
		personInfoDao.saveAll(list);
	}
	
	@Test
	public void daoFindTest() {
		Optional<PersonInfo> infoOp = personInfoDao.findById("A123456787");
		if(infoOp.isEmpty()) {
			System.out.println("Not found!!");
			return;
		} 
		System.out.println(infoOp.get().getName());
	}
	
	@Test
	public void daoFindTest2() {
		List<PersonInfo> list = personInfoDao.findAll();
		for(PersonInfo item : list) {
			System.out.println(item.getName());
		}
	}
	
	@Test
	public void daoFindTest3() {
		boolean result = personInfoDao.existsById("A123456787");
		System.out.println(result);
	}
	
	@Test
	public void daoFindTest4() {
//		List<PersonInfo> result = personInfoDao.findByCity("Kaohsiung");
//		List<PersonInfo> result = personInfoDao.findByNameAndCity("DDD", "Kaohsiung");
		List<PersonInfo> result = personInfoDao.findByNameOrCity("DDD", "Kaohsiung");
		for(PersonInfo item : result) {
			System.out.println(item.getName());
		}
	}

}
