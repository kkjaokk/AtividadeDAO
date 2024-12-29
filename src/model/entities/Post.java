package model.entities;

import java.util.Date;

public class Post {
	private int id;
	private String content;
	private Date date;
	private User user_id;
	
	
	
	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Post() {
		this(0);
	}
	
	public Post(int id){
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}
}
