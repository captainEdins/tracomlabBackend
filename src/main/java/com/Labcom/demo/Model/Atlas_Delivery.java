package com.Labcom.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "atlas_delivery")
public class Atlas_Delivery {
	
	@Id
	public int id;
	@Column
	public String action;
	@Column
	public String action_status;
	@Column
	public String creation_on;
	@Column
	public String customers;
	@Column
	public String delivery_status;
	@Column
	public String intrash;
	@Column
	public int week;
	@Column
	public int year;
	@Column
	public String creation_date;
	@Column
	public String delivered_by;
	@Column
	public String location;
	@Column
	public String serial_number;
	
	public Atlas_Delivery() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction_status() {
		return action_status;
	}

	public void setAction_status(String action_status) {
		this.action_status = action_status;
	}

	public String getCreation_on() {
		return creation_on;
	}

	public void setCreation_on(String creation_on) {
		this.creation_on = creation_on;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}

	public String getIntrash() {
		return intrash;
	}

	public void setIntrash(String intrash) {
		this.intrash = intrash;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getDelivered_by() {
		return delivered_by;
	}

	public void setDelivered_by(String delivered_by) {
		this.delivered_by = delivered_by;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	

}
