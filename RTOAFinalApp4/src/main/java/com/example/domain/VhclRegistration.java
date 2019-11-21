package com.example.domain;

import java.util.Date;

public class VhclRegistration {
	private Date regDate;
	private String regcenter; 
	private Date create_dt;
	private Date update_dt;
	private String regNumber;
	private int ownerID; 
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getRegcenter() {
		return regcenter;
	}
	public void setRegcenter(String regcenter) {
		this.regcenter = regcenter;
	}
	public Date getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}
	public Date getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(Date update_dt) {
		this.update_dt = update_dt;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

}
