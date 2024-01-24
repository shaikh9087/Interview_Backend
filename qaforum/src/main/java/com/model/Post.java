package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Post
{

	@Id

	private int postId;
	
	private String content;
	
	@OneToMany(cascade = CascadeType.ALL)

	private List<Comments> comments;
	
	

	public Post() 
	{
		super();
	}



	public Post(int postId, String content, List<Comments> comments) {
		super();
		this.postId = postId;
		this.content = content;
		this.comments = comments;
	}



	public int getPostId() {
		return postId;
	}



	public void setPostId(int postId) {
		this.postId = postId;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public List<Comments> getComments() {
		return comments;
	}



	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}



	@Override
	public String toString() {
		return "Post [postId=" + postId + ", content=" + content + ", comments=" + comments + "]";
	}




	

	
}
