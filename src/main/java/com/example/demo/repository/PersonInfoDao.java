package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonInfo;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String>{
	
	public List<PersonInfo> findByCity(String city);
	
	public List<PersonInfo> findByNameAndCity(String name, String city);
	
	public List<PersonInfo> findByNameOrCity(String name, String city);
	
	public List<PersonInfo> findByAgeGreaterThan(int age);
	
	public List<PersonInfo> findByAgeLessThanOrderByAge(int age);
	
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age1, int ag2);
	
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age1, int age2);
	
	public List<PersonInfo> findByCityContaining(String keyword);
	
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String city);

}
