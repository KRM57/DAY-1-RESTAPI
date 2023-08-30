package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepo;

@Service
public class CustomerService {
  @Autowired
  CustomerRepo cr;
  public List<Customer> add(List<Customer> c){
	  return cr.saveAll(c);
  }
  public List<Customer> get(){
	  return cr.findAll();
  }
	public List<Customer> sortandpage(int pageno,int pagesize,String field){
		Page<Customer> page = cr.findAll(PageRequest.of(pageno, pagesize, Sort.by(field)));
	    List<Customer> entities = page.getContent();
	    return entities;
	}
	public Customer getCustomerDetails(int id) {
		return cr.getDetails(id);
	}
	public void  deleteCustomerDetails(int id) {
		  cr.deleteById(id);
	}
	
}
