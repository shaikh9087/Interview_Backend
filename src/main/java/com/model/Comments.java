package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Comments
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int commentsId;
	
	@Column(name="comments_content")
	private String content;
	
	@Temporal(TemporalType.DATE)
	@Column(name="comments_creation-date")
	private Date creationDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="comments_last-modification-date")
	private Date lastModificationDate;
	
	@ManyToOne
	private Post post;

	@ManyToOne
	private User user;

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comments(int commentsId, String content, Date creationDate, Date lastModificationDate, Post post,
			User user) {
		super();
		this.commentsId = commentsId;
		this.content = content;
		this.creationDate = creationDate;
		this.lastModificationDate = lastModificationDate;
		this.post = post;
		this.user = user;
	}

	public int getCommentsId() {
		return commentsId;
	}

	public void setCommentsId(int commentsId) {
		this.commentsId = commentsId;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
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
		return "Comments [commentsId=" + commentsId + ", content=" + content + ", creationDate=" + creationDate
				+ ", lastModificationDate=" + lastModificationDate + ", post=" + post + ", user=" + user + "]";
	}
	
	
	

}
