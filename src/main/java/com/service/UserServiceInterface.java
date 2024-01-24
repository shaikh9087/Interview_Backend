package com.service;

import java.util.List;

import com.model.User;


public interface UserServiceInterface 
{
	public User saveUser(User u);//for saving single record
	
	public List<User> saveAllUser(List<User> list);//java.util//for saving list of record
	
	public  User getOneUser(int id);
	
	public  List<User> getAllUser();

	public void deleteById(int id);
	
	public User updateUser(User u);
	
}
