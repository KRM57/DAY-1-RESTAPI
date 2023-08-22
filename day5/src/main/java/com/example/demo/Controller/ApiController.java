package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
  @Autowired
  ApiService as;
  @GetMapping("get")
  public List<Book> display(){
	  return as.showBooks();
  }
  @PostMapping("post")
  public List<Book> add(@RequestBody List<Book> bk){
	  return as.addBook(bk);
  }
  @PutMapping("put/{id}")
  public Book update(@PathVariable int id,@RequestBody Book bk) {
	  return as.updateBook(id,bk);
  }
  @DeleteMapping("delete/{id}")
  public String del(@PathVariable int id) {
	   as.deleteBook(id);
	  return "Deleted Successfully";
  }
}
