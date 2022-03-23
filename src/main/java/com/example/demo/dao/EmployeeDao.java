package com.example.demo.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.Employee;

@Dao
@ConfigAutowireable
public interface EmployeeDao {

    @Select
    public Employee select(long id);

}