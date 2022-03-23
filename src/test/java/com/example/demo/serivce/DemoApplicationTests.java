package com.example.demo.serivce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.example.demo.DemoApplication;
import com.example.demo.entity.Employee;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = WebEnvironment.NONE)
public class DemoApplicationTests {
	
	@Autowired
	EmployeeService service;
    
	@Test
	public void contextLoads() {
		Employee employee = service.getEmployeeDao(1);
		employee.getAge();
	}

}
