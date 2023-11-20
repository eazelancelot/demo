package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TestA;

@Repository
public interface TestADao extends JpaRepository<TestA, Integer> {

}
