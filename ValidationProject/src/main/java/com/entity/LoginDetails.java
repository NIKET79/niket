package com.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoginDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String user_name;
	private String user_password;
	@OneToOne(cascade = CascadeType.ALL)
	private	UserInfo user_info;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public UserInfo getUser_info() {
		return user_info;
	}
	public void setUser_info(UserInfo user_info) {
		this.user_info = user_info;
	}
	public LoginDetails(String user_name, String user_password, UserInfo user_info) {
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_info = user_info;
	}
	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
