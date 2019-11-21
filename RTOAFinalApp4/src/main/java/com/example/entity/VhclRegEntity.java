package com.example.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "vhclReg_tbl11")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VhclRegEntity {
	@OneToOne(targetEntity=OwnerEntity.class)
	@JoinColumn(name="ownerID")
	 @JsonIgnore
	 @XmlTransient
	private OwnerEntity detail;
	
	public OwnerEntity getDetail() {
		return detail;
	}
	public void setDetail(OwnerEntity detail) {
		this.detail = detail;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vhclRegId")
	private int vhclRegId;
	@Column(name="regDate")
	private Date regDate;
	@Column(name="regcenter")
	private String regcenter;
	
	
	@CreationTimestamp
	private Date create_dt;
	
	@UpdateTimestamp
	private Date update_dt;
	@Column(name = "regNumber")
	private String regNumber;
	public int getVhclRegId() {
		return vhclRegId;
	}
	public void setVhclRegId(int vhclRegId) {
		this.vhclRegId = vhclRegId;
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
