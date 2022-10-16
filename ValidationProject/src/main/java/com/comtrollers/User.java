package com.comtrollers;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.Annotation.Address;
import com.Annotation.MobileNumber;
public class User {
	@NotBlank(message="*mandatory field")
	@Size(min=3, max=8, message = "*username must be in range between 3 to 8")
	@Pattern(regexp = "^[a-z]+[-]+[a-zA-Z0-9]*$", message = "*Start name with lowercase character and must include - ")
	private String user_name;
	@NotBlank(message="*mandatory field")
	private String user_lastname;
	@NotBlank(message="*mandatory field")
	private String user_email;
	@NotBlank(message="*mandatory field")
	@Address
	private String user_address;
	@MobileNumber 
	@NotBlank(message="*mandatory field")
	private String user_number;
	@NotBlank(message="*mandatory field")
	private String user_password;
	private CommonsMultipartFile filename;
	public String getUser_name() {
		return user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_lastname() {
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_number() {
		return user_number;
	}
	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}
	
	
	public CommonsMultipartFile getFilename() {
		return filename;
	}
	public void setFilename(CommonsMultipartFile filename) {
		this.filename = filename;
	}
	public User() {
		super();
	}
//	@Override
//	public String toString() {
//		return "User [user_name=" + user_name + ", user_lastname=" + user_lastname + ", user_email=" + user_email
//				+ ", user_address=" + user_address + ", user_number=" + user_number + ", filename=" + filename + "]";
//	}
	
}
