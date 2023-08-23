package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Account;
import com.example.demo.Service.BankService;
@RestController
public class BankController {
 @Autowired
 BankService bs;
 @PostMapping("post")
 public List<Account> addAccount(@RequestBody List<Account> acc){
	 return bs.add(acc);
 }
 @GetMapping("get/{id}")
 public Optional<Account> showAccount(@PathVariable int id){
	 return bs.show(id);
 }
 @PutMapping("put/{id}")
 public String updateAccount(@PathVariable int id,@RequestBody Account acc) {
	 return bs.update(id,acc);
 }
 @DeleteMapping("delete/{id}")
 public String deleteAccount(@PathVariable int id) {
	 return bs.delete(id);
	 //return "Account deleted successfully";
 }
}
