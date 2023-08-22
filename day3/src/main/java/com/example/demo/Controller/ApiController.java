package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
  @Autowired
  ApiService asv;
  @PostMapping("addEmployee")
  public Employee add(@RequestBody Employee e) {
	  return asv.saveInfo(e);
  }
  @GetMapping("showInfo")
  public List<Employee> show(){
	  return asv.showInfo();
  }
}
