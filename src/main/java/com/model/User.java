package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	private String email;
	private String password;
	private long contact;
	
	@OneToMany(fetch=FetchType.EAGER , cascade=CascadeType.ALL , orphanRemoval=true)
	private List<Topic> topic;

	
	public User() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String email, String password, long contact, List<Topic> topic) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.topic = topic;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<Topic> getTopic() {
		return topic;
	}

	public void setTopic(List<Topic> topic) {
		this.topic = topic;
	}
	
	
	}