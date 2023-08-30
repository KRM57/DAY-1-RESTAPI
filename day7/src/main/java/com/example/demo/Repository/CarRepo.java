package com.example.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.CarModel;

import jakarta.transaction.Transactional;

public interface CarRepo extends JpaRepository<CarModel , Integer> {
	@Modifying
	@Transactional
    @Query(value="update car_model set car_type=?2 where id=?1",nativeQuery = true)
	public int updateByName( int oldid,String cartype);

	@Query(value="select * from car_model where car_name=:sn",nativeQuery=true)
	public List<CarModel> getByname(@Param("sn") String name);
	
	@Modifying
	@Transactional
	@Query(value="delete from car_model where id=:sn",nativeQuery=true)
	public int deleteCar(@Param("sn") int id);

}