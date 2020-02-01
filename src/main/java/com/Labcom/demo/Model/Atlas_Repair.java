package com.Labcom.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "atlas_repair")
public class Atlas_Repair {

	@Id
	public int id;
	@Column
	public String action;
	@Column
	public String action_status;
	@Column
	public String batch_number;
	@Column
	public String comments;
	@Column
	public String created_on;
	@Column
	public String customers;
	@Column
	public String date_user_added;
	@Column
	public String failure_found;
	@Column
	public String intrash;
	@Column
	public String qa_test_status;
	@Column
	public String date_test_passed;
	@Column
	public String repair_centre;
	@Column
	public String repair_status;
	@Column
	public String reported_defects;
	@Column
	public String createdon;
	@Column
	public String search_date;
	@Column
	public String qa_done_by;
	@Column
	public String received_by;
	@Column
	public String received_from;
	@Column
	public String screened_by;
	@Column
	public String serial_number;
	@Column
	public String levels;
	@Column
	public String date_parts_added;
	@Column
	public Integer current_user;
	
	public Atlas_Repair() {
		
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

	public String getBatch_number() {
		return batch_number;
	}

	public void setBatch_number(String batch_number) {
		this.batch_number = batch_number;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getDate_user_added() {
		return date_user_added;
	}

	public void setDate_user_added(String date_user_added) {
		this.date_user_added = date_user_added;
	}

	public String getFailure_found() {
		return failure_found;
	}

	public void setFailure_found(String failure_found) {
		this.failure_found = failure_found;
	}

	public String getIntrash() {
		return intrash;
	}

	public void setIntrash(String intrash) {
		this.intrash = intrash;
	}

	public String getQa_test_status() {
		return qa_test_status;
	}

	public void setQa_test_status(String qa_test_status) {
		this.qa_test_status = qa_test_status;
	}

	public String getDate_test_passed() {
		return date_test_passed;
	}

	public void setDate_test_passed(String date_test_passed) {
		this.date_test_passed = date_test_passed;
	}

	public String getRepair_centre() {
		return repair_centre;
	}

	public void setRepair_centre(String repair_centre) {
		this.repair_centre = repair_centre;
	}

	public String getRepair_status() {
		return repair_status;
	}

	public void setRepair_status(String repair_status) {
		this.repair_status = repair_status;
	}

	public String getReported_defects() {
		return reported_defects;
	}

	public void setReported_defects(String reported_defects) {
		this.reported_defects = reported_defects;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public String getSearch_date() {
		return search_date;
	}

	public void setSearch_date(String search_date) {
		this.search_date = search_date;
	}

	public String getQa_done_by() {
		return qa_done_by;
	}

	public void setQa_done_by(String qa_done_by) {
		this.qa_done_by = qa_done_by;
	}

	public String getReceived_by() {
		return received_by;
	}

	public void setReceived_by(String received_by) {
		this.received_by = received_by;
	}

	public String getReceived_from() {
		return received_from;
	}

	public void setReceived_from(String received_from) {
		this.received_from = received_from;
	}

	public String getScreened_by() {
		return screened_by;
	}

	public void setScreened_by(String screened_by) {
		this.screened_by = screened_by;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public String getDate_parts_added() {
		return date_parts_added;
	}

	public void setDate_parts_added(String date_parts_added) {
		this.date_parts_added = date_parts_added;
	}

	public Integer getCurrent_user() {
		return current_user;
	}

	public void setCurrent_user(Integer current_user) {
		this.current_user = current_user;
	}
	
	
}
