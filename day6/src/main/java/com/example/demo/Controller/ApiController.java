package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Child;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
  @Autowired 
  ApiService as;
  @PostMapping("add")
  public List<Child> adddetails(@RequestBody List<Child> c){
	  return as.addChild(c);
  }
  @GetMapping("showinfo")
  public List<Child> showinfo(){
  	return as.showinfo();
  }
  @GetMapping("sort/{name}")
  public List<Child> sortbyfield(@PathVariable String name){
  	return as.sortby(name);
  }
  @GetMapping("getbypage/{pageno}/{pagesize}")
  public List<Child> getpage(@PathVariable int pageno,@PathVariable int pagesize ){
  	return as.getbypage(pageno, pagesize);
  }
  @GetMapping("sortandpage/{pageno}/{pagesize}/{name}")
  public List<Child> sortPaging(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
  	return as.sortandpage(pageno,pagesize,name);
}
}
