package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Topic;
import com.service.TopicServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TopicController 
{
	@Autowired
	TopicServiceInterface topicService;
	
	@PostMapping("addTopic")//method name can be different becuz it calls mapping (" ")
	
	
	public Topic addTopic(@RequestBody Topic t)
	{
		topicService.saveTopic(t);
		return t;
	}
	

	@PostMapping("/addAllTopics")
	
	
	//@RequestBody set values in postman
	
	public List<Topic> addAllTopic(@RequestBody List<Topic> list)
	{
		topicService.saveAllTopic(list);
		return list;
	}
	
	
	@GetMapping("/getoneTopicById/{id}")
	
	public Topic findOneTopic(@PathVariable int id)
	{
		return topicService.getOneTopic(id);
	}

	@GetMapping("/getAllTopics")

	
	public List<Topic> findAllTopics() 
	{
		return topicService.getAllTopic();
	}
	
	
	@DeleteMapping("/deleteTopicById/{id}")
	
	public void deleteById(@PathVariable int id)
	{
		topicService.deleteById(id);
	}
	
	@PutMapping("updateTopic")
	
	public Topic updateTopic(@RequestBody Topic t) 
	{
		return topicService.updateTopic(t);
	}



}
