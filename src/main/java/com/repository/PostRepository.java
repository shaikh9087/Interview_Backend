package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Post;
import com.model.Topic;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer>
{

}