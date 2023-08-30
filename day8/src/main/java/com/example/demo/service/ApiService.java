 package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class ApiService {

	BikeRepo br;
	public Bike adddet(Bike b)
	{
		return br.save(b);
	}
	
	public List<Bike> addndet(List<Bike> b)
	{
		return (List<Bike>)br.saveAll(b);
	}
	
	public List<Bike> showdet()
	{
		return br.findAll();
	}
	
	public List<Bike> getByYear(int year)
	{
		return br.getbyyear(year);
	}
	
	public List<Bike> getByYearandNam(int year,String name)
	{
		return br.getbyyearandname(year, name);
	}
	
	public List<Bike> getByName(String name)
	{
		return br.getbyname(name);
	}
}