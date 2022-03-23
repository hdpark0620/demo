package com.example.demo.serivce;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeService extends abstractService {

    public Employee getEmployeeDao(long userid) {
        return employeeDao.select(userid);
    }
}