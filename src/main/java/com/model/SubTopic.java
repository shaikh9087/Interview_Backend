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

@Table(name="sub-topics")
public class SubTopic 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int SubTopicId;
	
	@Column(name="sub-topic_title")
	private String title;
	
	@Column(name="sub-topic_content")
	private String content;
	
	@Temporal(TemporalType.DATE)
	@Column(name="sub-topic_creation-date")
	private Date creationDate;
	
	@ManyToOne
	private Topic topic;

	@OneToMany(fetch=FetchType.EAGER , cascade=CascadeType.ALL , orphanRemoval=true)
	private List<Post> post;
	
	@ManyToOne
	private User user;

	public SubTopic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubTopic(int subTopicId, String title, String content, Date creationDate, Topic topic, List<Post> post,
			User user) {
		super();
		SubTopicId = subTopicId;
		this.title = title;
		this.content = content;
		this.creationDate = creationDate;
		this.topic = topic;
		this.post = post;
		this.user = user;
	}

	public int getSubTopicId() {
		return SubTopicId;
	}

	public void setSubTopicId(int subTopicId) {
		SubTopicId = subTopicId;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SubTopic [SubTopicId=" + SubTopicId + ", title=" + title + ", content=" + content + ", creationDate="
				+ creationDate + ", topic=" + topic + ", post=" + post + ", user=" + user + "]";
	}
	
	
	
	
	 
	
	
}
