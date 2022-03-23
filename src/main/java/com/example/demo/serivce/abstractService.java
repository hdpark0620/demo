package com.example.demo.serivce;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EmployeeDao;

public abstract class abstractService {
	
	@Autowired
	EmployeeDao employeeDao;
}