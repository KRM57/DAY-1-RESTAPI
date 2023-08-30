package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CarModel;
import com.example.demo.Repository.CarRepo;

@Service
public class ApiService {
	@Autowired
	CarRepo cr;
    public List<CarModel> addDetail(List<CarModel> cm){
    	return cr.saveAll(cm);
    }
    public List<CarModel> showinfo(){
    	return cr.findAll();
    }
	public int updateField(int oldid,String cartype) {
		return cr.updateByName(oldid,cartype);
	}
	public List<CarModel> getbycarname(String name) {
		
		return cr.getByname(name);
	}
	public int deletethecar(int id) {
		
		return cr.deleteCar(id);
	}
	
	
    
}