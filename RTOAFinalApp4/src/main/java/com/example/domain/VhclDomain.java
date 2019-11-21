package com.example.domain;

import java.util.Date;

public class VhclDomain {
	private String vhclType;
	private String mfgYear;
	private String vhclBrabd;
	private Date create_dt;
	private Date update_dt;
	private int ownerID; 
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public String getVhclType() {
		return vhclType;
	}
	public void setVhclType(String vhclType) {
		this.vhclType = vhclType;
	}
	public String getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(String mfgYear) {
		this.mfgYear = mfgYear;
	}
	public String getVhclBrabd() {
		return vhclBrabd;
	}
	public void setVhclBrabd(String vhclBrabd) {
		this.vhclBrabd = vhclBrabd;
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
