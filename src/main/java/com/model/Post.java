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

@Table(name="posts")
public class Post
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int postId;
	
	@Column(name="post_content")
	private String content;
	
	@Temporal(TemporalType.DATE)
	@Column(name="post_creation-date")
	private Date creationDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="post_last-modification-date")
	private Date lastModificationDate;
	
	@ManyToOne
	private SubTopic subtopic;
	
	@OneToMany(fetch=FetchType.EAGER , cascade=CascadeType.ALL , orphanRemoval=true)
	private List<Comments> comments;
	
	@ManyToOne
	private User user;

	public Post() 
	{
		super();
	}

	public Post(int postId, String content, Date creationDate, Date lastModificationDate, SubTopic subtopic,
			List<Comments> comments, User user) {
		super();
		this.postId = postId;
		this.content = content;
		this.creationDate = creationDate;
		this.lastModificationDate = lastModificationDate;
		this.subtopic = subtopic;
		this.comments = comments;
		this.user = user;
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public SubTopic getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(SubTopic subtopic) {
		this.subtopic = subtopic;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", content=" + content + ", creationDate=" + creationDate
				+ ", lastModificationDate=" + lastModificationDate + ", subtopic=" + subtopic + ", comments=" + comments
				+ ", user=" + user + "]";
	}

	
	
	
	
	
	
	
	
}
