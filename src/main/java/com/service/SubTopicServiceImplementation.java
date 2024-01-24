package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.SubTopic;
import com.repository.SubTopicRepository;

 
@Service

public class SubTopicServiceImplementation implements SubTopicServiceInterface
{
	@Autowired
	SubTopicRepository subTopicRepo;
	
	@Override
	public SubTopic saveSubTopic(SubTopic st)
	{
		subTopicRepo.save(st);
		return st;
	}
	

	@Override
	public List<SubTopic> saveAllSubTopic(List<SubTopic> list)
	{
		subTopicRepo.saveAll(list);
		return list;
	}

	@Override
	public  SubTopic getOneSubTopic(int id)
	{
		return subTopicRepo.findById(id).orElse(null);

	}

	@Override
	public List<SubTopic> getAllSubTopic() 
	{
		return subTopicRepo.findAll();
	}

	@Override
	public void deleteSubTopicById(int id) 
	{

		subTopicRepo.deleteById(id);
	}

	@Override
	public SubTopic updateSubTopic(SubTopic st) 
	{
		
		SubTopic existsSubTopic =subTopicRepo.findById(st.getSubTopicId()).orElse(null);
		existsSubTopic.setContent(st.getContent());
		return subTopicRepo.save(existsSubTopic);
		
	}

	
}


