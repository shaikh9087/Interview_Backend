package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.SubTopic;
import com.model.Topic;

@Repository
public interface SubTopicRepository extends JpaRepository<SubTopic,Integer>
{

}