package com.Labcom.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ufs_authentication")
public class Ufs_Authentication {
	
	@Id
	public int authentication_id;
	@Column
	public int authentication_type;
	@Column
	public String intrash;
	@Column
	public String last_login;
	@Column
	public int login_attempts;
	@Column
	public String password;
	@Column
	public String password_change_date;
	@Column
	public int password_status;
	@Column
	public int user_;
	@Column
	public String username;
	
	public Ufs_Authentication() {
		
	}

	public int getAuthentication_id() {
		return authentication_id;
	}

	public void setAuthentication_id(int authentication_id) {
		this.authentication_id = authentication_id;
	}

	public int getAuthentication_type() {
		return authentication_type;
	}

	public void setAuthentication_type(int authentication_type) {
		this.authentication_type = authentication_type;
	}

	public String getIntrash() {
		return intrash;
	}

	public void setIntrash(String intrash) {
		this.intrash = intrash;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public int getLogin_attempts() {
		return login_attempts;
	}

	public void setLogin_attempts(int login_attempts) {
		this.login_attempts = login_attempts;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_change_date() {
		return password_change_date;
	}

	public void setPassword_change_date(String password_change_date) {
		this.password_change_date = password_change_date;
	}

	public int getPassword_status() {
		return password_status;
	}

	public void setPassword_status(int password_status) {
		this.password_status = password_status;
	}

	public int getUser_() {
		return user_;
	}

	public void setUser_(int user_) {
		this.user_ = user_;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
