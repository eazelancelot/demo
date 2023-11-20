package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {
	
	@Autowired
	private PersonInfoDao personInfoDao;

	@Override
	public void addInfo(PersonInfo info) {
		String id = info.getId();
		String pattern = "[a-zA-Z][1,2]\\d{8}";		
		if (StringUtils.hasText(id) && id.matches(pattern)) {
			personInfoDao.save(info);
		} else {
			System.out.println("id error!!");
		}		
	}

	@Override
	public void addInfoList(List<PersonInfo> infoList) {// 假設 infoList 有10筆資料
		String pattern = "[a-zA-Z][1,2]\\d{8}";
		for(PersonInfo item : infoList) {
			String id = item.getId();
//			if (!(StringUtils.hasText(id) && id.matches(pattern))) {
//				System.out.println("id error!!");
//				return;				
//			}
			if (!StringUtils.hasText(id) || !id.matches(pattern)) {
				System.out.println("id error!!");
				return;	
			}
		}
		personInfoDao.saveAll(infoList);
	}

}
