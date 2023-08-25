package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Child;
import com.example.demo.Repository.ChildRepo;

@Service
public class ApiService {
	@Autowired
	ChildRepo cr;
   public List<Child> addChild(List<Child> ch){
	   return (List<Child>)cr.saveAll(ch);
   }
   public List<Child> showinfo(){
		return cr.findAll();
	}
	public List<Child> sortby(String bn){
		return cr.findAll(Sort.by(bn).descending());
	}
	public List<Child> getbypage(int pgno,int pgsize){
		Page<Child> page=cr.findAll(PageRequest.of(pgno,pgsize));
		return page.getContent();
		}
	public List<Child> sortandpage(int pageno,int pagesize,String field){
		Page<Child> page = cr.findAll(PageRequest.of(pageno, pagesize, Sort.by(field)));
	    List<Child> entities = page.getContent();
	    return entities;
	}
}
