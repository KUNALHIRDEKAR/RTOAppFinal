package com.example.domain;

import java.util.Date;

public class AddressDomain {

	private int hNo;
	private int ownerID; 
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	private String street_name;
	private String city;
	private String state;
	private String zip_Code;
	private Date create_dt;
	private Date update_dt;
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip_Code() {
		return zip_Code;
	}
	public void setZip_Code(String zip_Code) {
		this.zip_Code = zip_Code;
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
	
}
