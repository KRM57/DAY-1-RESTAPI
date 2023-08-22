package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
  @Autowired
  ApiService as;
  @GetMapping("show")
  public List<Student> display() {
	  return as.showInfo();
  }
  @PostMapping("add")
  public Student addDetalis(@RequestBody Student stu) {
	  return as.addStudent(stu);
  }
  @PostMapping("addAll")
  public List<Student> addObject(@RequestBody List<Student> stu) {
	  return as.addStudents(stu);
  }
  @PutMapping("update")
  public Student updateInformation(@RequestBody Student stu) {
	  return as.updateInfo(stu);
  }
  @DeleteMapping("delete")
  public String deleteInformation(@RequestBody Student stu) {
	  as.delete(stu);
	  return "Deleted Successfully";
  }
  
}
