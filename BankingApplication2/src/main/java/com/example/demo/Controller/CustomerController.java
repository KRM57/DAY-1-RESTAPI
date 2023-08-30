package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController {
 @Autowired
 CustomerService cs;
  @PostMapping("addCustomer")
  public List<Customer> addCtmr(@RequestBody List<Customer> ctmr){
	  return cs.add(ctmr);
  }
  @GetMapping("getAllCustomer")
  public List<Customer> getCtmr(){
	  return cs.get();
  }
  @GetMapping("getCustomer/{id}")
  public Customer get(@PathVariable int id) {
	  return cs.getCustomerDetails(id);
  }
  @GetMapping("sortandpage/{pageno}/{pagesize}/{name}")
  public List<Customer> sortPaging(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
  	return cs.sortandpage(pageno,pagesize,name);
  }
  @DeleteMapping("DeleteCustomer/{id}")
  public String delete(@PathVariable int id) {
	  cs.deleteCustomerDetails(id);
	  return "Customer deleted successfully";
  }
}
