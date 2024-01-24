package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Topic;
import com.repository.TopicRepository;

@Service

public class TopicImplementation implements TopicServiceInterface
{
	@Autowired
	TopicRepository topicRepo;
	
	@Override
	public Topic saveTopic(Topic t)
	{
		topicRepo.save(t);
		return t;
	}
	

	@Override
	public List<Topic> saveAllTopic(List<Topic> list)
	{
		topicRepo.saveAll(list);
		return list;
	}

	@Override
	public  Topic getOneTopic(int id)
	{
		return topicRepo.findById(id).orElse(null);

	}

	@Override
	public List<Topic> getAllTopic() 
	{
		return topicRepo.findAll();
	}

	@Override
	public void deleteById(int id) 
	{

		topicRepo.deleteById(id);
	}

	@Override
	public Topic updateTopic(Topic t) 
	{
		
		Topic existsTopic =topicRepo.findById(t.getTopicId()).orElse(null);
		existsTopic.setTitle(t.getTitle());
		return topicRepo.save(existsTopic);
		
	}

	
}
