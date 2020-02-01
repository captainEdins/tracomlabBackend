package com.Labcom.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "atlas_shipped")
public class Atlas_Shipped {
	
	@Id
	public int id;
	@Column
	public String action;
	@Column
	public String action_status;
	@Column
	public String board_defect;
	@Column
	public String bt_address;
	@Column
	public String creation_on;
	@Column
	public String intrash;
	@Column
	public String mac_id;
	@Column
	public String note;
	@Column
	public String pcba_pn;
	@Column
	public String pcba_sn;
	@Column
	public String pki_version;
	@Column
	public String printer_type;
	@Column
	public String wifi;
	@Column
	public String creation_date;
	@Column
	public String serial_number;
	@Column
	public String shipped_status;
	
	public Atlas_Shipped() {
		
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

	public String getBoard_defect() {
		return board_defect;
	}

	public void setBoard_defect(String board_defect) {
		this.board_defect = board_defect;
	}

	public String getBt_address() {
		return bt_address;
	}

	public void setBt_address(String bt_address) {
		this.bt_address = bt_address;
	}

	public String getCreation_on() {
		return creation_on;
	}

	public void setCreation_on(String creation_on) {
		this.creation_on = creation_on;
	}

	public String getIntrash() {
		return intrash;
	}

	public void setIntrash(String intrash) {
		this.intrash = intrash;
	}

	public String getMac_id() {
		return mac_id;
	}

	public void setMac_id(String mac_id) {
		this.mac_id = mac_id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPcba_pn() {
		return pcba_pn;
	}

	public void setPcba_pn(String pcba_pn) {
		this.pcba_pn = pcba_pn;
	}

	public String getPcba_sn() {
		return pcba_sn;
	}

	public void setPcba_sn(String pcba_sn) {
		this.pcba_sn = pcba_sn;
	}

	public String getPki_version() {
		return pki_version;
	}

	public void setPki_version(String pki_version) {
		this.pki_version = pki_version;
	}

	public String getPrinter_type() {
		return printer_type;
	}

	public void setPrinter_type(String printer_type) {
		this.printer_type = printer_type;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}

	public String getShipped_status() {
		return shipped_status;
	}

	public void setShipped_status(String shipped_status) {
		this.shipped_status = shipped_status;
	}
	


}
