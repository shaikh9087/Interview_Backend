package com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@Table(name="Topics")
public class Topic
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int topicId;
	
	@Column(name="topic_title")
	private String title;
	
	@Column(name="topic_content")
	private String content;
	
	@Temporal(TemporalType.DATE)
	@Column(name="topic_creation_date")
	private Date creationDate;
	
	@ManyToOne
	private User user;

	@OneToMany(fetch=FetchType.EAGER , cascade=CascadeType.ALL , orphanRemoval=true)

	private List<SubTopic> subTopic;

	public Topic() 
	{
		super();
	}

	public Topic(int topicId, String title, String content, Date creationDate, User user, List<SubTopic> subTopic) {
		super();
		this.topicId = topicId;
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
		this.user = user;
		this.subTopic = subTopic;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<SubTopic> getSubTopic() {
		return subTopic;
	}

	public void setSubTopic(List<SubTopic> subTopic) {
		this.subTopic = subTopic;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", title=" + title + ", content=" + content + ", creationDate="
				+ creationDate + ", user=" + user + ", subTopic=" + subTopic + "]";
	}

	
	
	
	

}
