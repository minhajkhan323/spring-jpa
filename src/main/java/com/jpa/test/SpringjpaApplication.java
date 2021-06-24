package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entity.User;



@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjpaApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		
		//CREATE
		/*
		User user1 = new User();
		user1.setName("PP");
		user1.setCity("Bangalore");
		user1.setProfession("Analyst");
		
		User user2 = new User();
		user2.setName("Sivani");
		user2.setCity("Bangalore");
		user2.setProfession("Thread Analyst");
		
		List<User> users = List.of(user1,user2);
		
		Iterable<User> result =userRepo.saveAll(users);

		result.forEach(u -> {
			System.out.println(u);
			System.out.println("Done");
		});
		
		*/
		
		//Update using id
		/*
		Optional<User> optional=userRepo.findById(1);
		User user = optional.get();
		user.setName("Minhaj Khan");
		User result = userRepo.save(user);
		System.out.print(result);
		
		*/
		
		//Delete using id
		/*
		try
		{
			Optional<User> optional=userRepo.findById(5);
			User user = optional.get();
			
			userRepo.delete(user);
			
			System.out.println("User Deleted Successfully...!");
		} 
		catch (Exception e) 
		{
			System.out.print("No such id exist");
		}
		
		*/
		
		//Display all user from DB
		/*
		Iterable<User> user = userRepo.findAll();
		Iterator<User> iterator = user.iterator();
		while(iterator.hasNext())
		{
			User user2 = iterator.next();
			System.out.println(user2);
			
		}
		
		*/
		//-----------------------------------------
		//Iterable process
		//user.forEach(u ->{System.out.println(u);});
		//--------------------------------------------
		
		//-------------------------------------------------
		//Implement derived query method
		/*
		List<User> user=userRepo.findByName("Minhaj Khan");
		user.forEach(u->System.out.println(u)); */
		
		/*
		List<User> user1=userRepo.findByCity("Bangalore");
		user1.forEach(u->System.out.println(u));
		*/
		//----------------------------------------------------------
		
		List<User> u=userRepo.findByName("Minhaj Khan");
		
		u.forEach(n->System.out.println(n));
		
		
		System.out.println("---------------------------");
		
		List<User> user=userRepo.findAllUsers();
		user.forEach(names->System.out.println(names));
		
		List<User> user1=userRepo.findByNameAndCity("Aryan","Hydrabad");
		user1.forEach(u1->System.out.println(u1));
		
		
		
		
		
		
	}

}
