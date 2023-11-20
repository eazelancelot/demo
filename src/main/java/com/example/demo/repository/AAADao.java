package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AAA;

@Repository
public interface AAADao extends JpaRepository<AAA, Integer>{
	public AAA findTopByOrderByIdDesc();
	
	public List<AAA> findByIdIn(List<Integer> idList);
	
	public List<AAA> findByName(String name);
	
	List<AAA> findByNameContaining(String name);
	
	public List<AAA> findByStartDateGreaterThanEqual(LocalDate startDate);
	
	public List<AAA> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(LocalDate startDate, LocalDate endDate);
	
	public List<AAA> findByNameAndStartDateGreaterThanAndEndDateLessThan(String name, LocalDate startDate, LocalDate endDate);
}
