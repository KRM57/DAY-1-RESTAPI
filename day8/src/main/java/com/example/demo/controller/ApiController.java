 package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	ApiService as;
	
	@PostMapping("adddetail")
	public Bike adddetail(@RequestBody Bike b)
	{
		return as.adddet(b);
	}
	
	@PostMapping("addndetails")
	public List<Bike> addndetails(@RequestBody List<Bike> b)
	{
		return as.addndet(b);
	}
	
	@GetMapping("showdetails")
	public List<Bike> showdetails()
	{
		return as.showdet();
	}
	
	@GetMapping("showBike/{year}")
	public List<Bike> showBike(int year)
	{
		return as.getByYear(year);
	}
	
	@GetMapping("showBikes/{year}/bikename{name}")
	public List<Bike> showBikes(int year,String name)
	{
		return as.getByYearandNam(year, name);
	}
	
	@GetMapping("showBikesName/{name}")
	public List<Bike> showBikesName(String name)
	{
		return as.getByName(name);
	}
}