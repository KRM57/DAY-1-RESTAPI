package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class ApiService {
     @Autowired
     EmployeeRepo er;
     public Employee saveInfo(Employee e) {
    	 return er.save(e);
     }
     public List<Employee> showInfo(){
    	 return er.findAll();
     }
}
