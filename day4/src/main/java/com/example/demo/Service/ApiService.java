package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class ApiService {
  @Autowired
  StudentRepo sr;
  public Student addStudent(Student s) {
	  return sr.save(s);
  }
  public List<Student> addStudents(List<Student> s){
	  return (List<Student>)sr.saveAll(s);
  }
  public List<Student> showInfo() {
	  return sr.findAll();
  }
  public Student updateInfo(Student s) {
	  return sr.saveAndFlush(s);
  }
  public void delete(Student s) {
	  sr.delete(s);
  }
}
