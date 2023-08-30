package com.example.demo.Contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CarModel;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService  as;
@PostMapping("addinfo")
public List<CarModel> saveInfo(@RequestBody List<CarModel> cm){
	return as.addDetail(cm);
}
@GetMapping("showinfo")
public List<CarModel> showDetail(){
	return as.showinfo();
}
@PutMapping("update/{oldid}/{cartype}")
public String updateInfo(@PathVariable int oldid,@PathVariable String cartype){
	return as.updateField(oldid, cartype)+"updated";
}
@GetMapping("getbycar/{name}")
public List<CarModel> getbycar(@PathVariable String name){
	return as.getbycarname(name);
}
@DeleteMapping("delete/{id}")
public String deletecar(@PathVariable int id) {
	return as.deletethecar(id)+" Deleted";
} 
}
