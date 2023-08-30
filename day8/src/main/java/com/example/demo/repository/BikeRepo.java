 package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer> {

     @Query(value = "select * from biketable where year=:s",nativeQuery = true)
     public List<Bike> getbyyear(@Param("s") int year);
     
     @Query(value = "select * from biketable where year=:a and bikename=:an",nativeQuery = true)
     public List<Bike> getbyyearandname(@Param("a") int year,@Param("an") String bikenam);
     
     @Query(value = "select * from biketable where bikename=:an",nativeQuery = true)
     public List<Bike> getbyname(@Param("an") String name);
}