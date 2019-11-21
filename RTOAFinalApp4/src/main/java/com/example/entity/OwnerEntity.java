package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name ="owner_tbl7")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OwnerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ownerID")	
	private int ownerID;
	@Column(name="fName")
	 private String fName;
	@Column(name="lName")
	private String lName;
	@Column(name="gender")
	private String gender;
	@Column(name="email")
	private String email;
	@Column(name="phno")
	private long phno;
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name="dob")
	private Date dob;
	@Column(name="ssn")
	private String ssn;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_dt;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_dt;

	
	
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
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
