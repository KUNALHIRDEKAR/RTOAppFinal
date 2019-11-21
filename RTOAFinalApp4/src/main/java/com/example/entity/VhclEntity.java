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
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Vhcl_tbl7")
public class VhclEntity {

	@OneToOne(targetEntity=OwnerEntity.class)
	@JoinColumn(name="ownerID")
	private OwnerEntity detail;
	


	

	public OwnerEntity getDetail() {
		return detail;
	}

	public void setDetail(OwnerEntity detail) {
		this.detail = detail;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vhclId")
	private int vhclId;
	
	@Column(name="vhclType")
	private String vhclType;
	
	@Column(name="mfgYear")
	private String mfgYear;
	
	@Column(name="vhclBrabd")
	private String vhclBrabd;
	
	@CreationTimestamp
	private Date create_dt;
	
	@UpdateTimestamp
	private Date update_dt;
	
	
	public int getVhclId() {
		return vhclId;
	}

	public void setVhclId(int vhclId) {
		this.vhclId = vhclId;
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
