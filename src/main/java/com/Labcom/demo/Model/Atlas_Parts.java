package com.Labcom.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "atlas_parts")
public class Atlas_Parts {
	
	@Id
	public int parts_id;
	@Column
	public String action;
	@Column
	public String action_status;
	@Column
	public String created_on;
	@Column
	public String description;
	@Column
	public String intrash;
	@Column
	public String manufacturer_name;
	@Column
	public String part_model;
	@Column
	public String part_name;
	@Column
	public String part_number;
	
	public Atlas_Parts() {
		
	}

	public int getParts_id() {
		return parts_id;
	}

	public void setParts_id(int parts_id) {
		this.parts_id = parts_id;
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

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIntrash() {
		return intrash;
	}

	public void setIntrash(String intrash) {
		this.intrash = intrash;
	}

	public String getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public String getPart_model() {
		return part_model;
	}

	public void setPart_model(String part_model) {
		this.part_model = part_model;
	}

	public String getPart_name() {
		return part_name;
	}

	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	

}
