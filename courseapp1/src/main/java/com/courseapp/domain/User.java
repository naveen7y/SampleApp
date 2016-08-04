package com.courseapp.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
    
    @ManyToMany(mappedBy = "User")
    private Set<Course> course_table;
    
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
	
}
