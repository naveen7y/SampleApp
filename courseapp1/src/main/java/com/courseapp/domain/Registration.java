package com.courseapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "registration")

public class Registration implements Serializable {

	private static final long serialVersionUID = 1L;
	private String user_id;
	private String username;
	private String password;
	private int age;
	private String firstname;
	private String middlename;
	private String lastname;
	private String company_name;
	private LocalDateTime create_time;
	
	public Registration(String user_id, String username, String password, int age, String firstname, String middlename,
			String lastname, String company_name, LocalDateTime create_time) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.company_name = company_name;
		this.create_time = create_time;
	}


	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public LocalDateTime getCreate_time() {
		return create_time;
	}

	public void setCreate_time(LocalDateTime create_time) {
		this.create_time = create_time;
	}

	public enum gender {
		male, female;
	}

}
