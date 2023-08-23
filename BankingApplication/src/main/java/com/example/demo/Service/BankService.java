package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Account;
import com.example.demo.Repository.BankRepo;

@Service
public class BankService {
 @Autowired
 BankRepo br;
 public List<Account> add(List<Account> a){
	 return (List<Account>) br.saveAll(a);
 }
 public Optional<Account> show(int id) {
	 return br.findById(id);
 }
 public String update(int id,Account a) {
	 br.saveAndFlush(a);
	 if(br.existsById(id)) {
		 return "Account updated successfully";
	 }
	 else {
		 return "Account does not exist";
	 }
 }
 public String delete(int id) {
	 if(br.existsById(id)) {
		 br.deleteById(id);
		 return "Account deleted successfully";
	 }
	 else {
		 return "Account does not exist";
	 }
 }
}
