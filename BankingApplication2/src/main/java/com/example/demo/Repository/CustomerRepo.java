package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	 @Query(value="select * from Customer where customerid=:s",nativeQuery=true)
	  public Customer getDetails(@Param("s") int Customer);
	  
}

