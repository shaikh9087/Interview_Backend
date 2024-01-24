package com.service;

import java.util.List;

import com.model.SubTopic;


public interface SubTopicServiceInterface 
{
	public SubTopic saveSubTopic(SubTopic st);//for saving single record
	
	public List<SubTopic> saveAllSubTopic(List<SubTopic> list);//java.util//for saving list of record
	
	public  SubTopic getOneSubTopic(int id);
	
	public  List<SubTopic> getAllSubTopic();

	public void deleteSubTopicById(int id);
	
	public SubTopic updateSubTopic(SubTopic st);
}
