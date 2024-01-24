package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserServiceInterface;


@RestController
public class UserController
{

	@Autowired
	UserServiceInterface userService;
	
	@PostMapping("addUser")//method name can be different becuz it calls mapping (" ")
	
	
	public User addUser(@RequestBody User u)
	{
		userService.saveUser(u);
		return u;
	}
	

	@PostMapping("/addAllUsers")
	
	
	//@RequestBody set values in postman
	
	public List<User> addAllUser(@RequestBody List<User> list)
	{
		userService.saveAllUser(list);
		return list;
	}
	
	
	@GetMapping("/getoneUserById/{id}")
	
	public User findOneUser(@PathVariable int id)
	{
		return userService.getOneUser(id);
	}

	@GetMapping("/getAllUsers")

	
	public List<User> findAllUser() 
	{
		return userService.getAllUser();
	}
	
	
	@DeleteMapping("/deleteUserById/{id}")
	
	public void deleteById(@PathVariable int id)
	{
		userService.deleteById(id);
	}
	
	@PutMapping("updateUser")
	
	public User updateUser(@RequestBody User u) 
	{
		return userService.updateUser(u);

		
	}
	
	
}
