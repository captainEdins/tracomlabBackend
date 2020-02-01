package com.Labcom.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ufs_otp")
public class Ufs_Otp {

	@Id
	public int otp_id;
	@Column
	public Date creation_date;
	@Column
	public String otp;
	@Column
	public String user_id;
	@Column
	public int otp_category;
	
	public Ufs_Otp() {
		
	}

	public int getOtp_id() {
		return otp_id;
	}

	public void setOtp_id(int otp_id) {
		this.otp_id = otp_id;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getOtp_category() {
		return otp_category;
	}

	public void setOtp_category(int otp_category) {
		this.otp_category = otp_category;
	}
	
	
}
