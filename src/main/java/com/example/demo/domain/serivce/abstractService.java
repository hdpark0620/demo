package com.example.demo.domain.serivce;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.dao.EmployeeDao;

public abstract class abstractService {
	
	@Autowired
	EmployeeDao employeeDao;
}