package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Comments;
import com.model.Topic;

@Repository
public interface CommentsRepository extends JpaRepository<Comments,Integer>
{

}