package com.example.demo.domain.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {

	@Id
	public Integer id;

	public String name;

	public Integer age;
	
	public Integer version;
}
