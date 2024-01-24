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

import com.model.SubTopic;
import com.service.SubTopicServiceInterface;


@RestController
public class SubTopicController 
{
	@Autowired
	 SubTopicServiceInterface subTopicService;
	
	@PostMapping("addSubTopic")//method name can be different becuz it calls mapping (" ")
	
	
	public  SubTopic addsubTopic(@RequestBody  SubTopic st)
	{
		subTopicService.saveSubTopic(st);
		return st;
	}
	

	@PostMapping("/addAllSubTopics")
	
	
	//@RequestBody set values in postman
	
	public List< SubTopic> addAllSubTopic(@RequestBody List<SubTopic> list)
	{
		subTopicService.saveAllSubTopic(list);
		return list;
	}
	
	
	@GetMapping("/getoneSubTopicById/{id}")
	
	public SubTopic findOneSubTopic(@PathVariable int id)
	{
		return subTopicService.getOneSubTopic(id);
	}

	@GetMapping("/getAllSubTopics")

	
	public List<SubTopic> findAllSubTopic() 
	{
		return subTopicService.getAllSubTopic();
	}
	
	
	@DeleteMapping("/deleteSubTopicById/{id}")
	
	public void deleteBySubTopicId(@PathVariable int id)
	{
		subTopicService.deleteSubTopicById(id);
	}
	
	@PutMapping("updateSubTopic")
	
	public SubTopic updateUser(@RequestBody SubTopic st) 
	{
		return subTopicService.updateSubTopic(st);
	}


}
