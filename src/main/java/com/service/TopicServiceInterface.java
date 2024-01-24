package com.service;

import java.util.List;

import com.model.Topic;

public interface TopicServiceInterface 
{
	public Topic saveTopic(Topic t);//for saving single record
	
	public List<Topic> saveAllTopic(List<Topic> list);//java.util//for saving list of record
	
	public  Topic getOneTopic(int id);
	
	public  List<Topic> getAllTopic();

	public void deleteById(int id);
	
	public Topic updateTopic(Topic t);
}
