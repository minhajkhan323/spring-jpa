package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	//Derived Query methods
	//public List<User> findByName(String name);
	
	public List<User> findByCity(String city);
	
	@Query(value = "Select * from User Where name = :n",nativeQuery = true)
	public List<User> findByName(@Param("n")String name);
	
	@Query(value = "Select * from User",nativeQuery = true)
	public List<User> findAllUsers();
	
	@Query(value = "Select * from User where name = :n and city=:c",nativeQuery = true)
	public List<User> findByNameAndCity(@Param("n")String name,@Param("c")String city);

}
