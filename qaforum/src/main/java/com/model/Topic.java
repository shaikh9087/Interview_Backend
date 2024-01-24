package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Topic
{

	@Id

	private int topicId;
	
	private String title;

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(int topicId, String title) {
		super();
		this.topicId = topicId;
		this.title = title;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", title=" + title + "]";
	}
	
	

	
}
