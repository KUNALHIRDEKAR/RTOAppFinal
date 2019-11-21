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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "address_Dtls_tbl7")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressEntity {
	

	@OneToOne(targetEntity=OwnerEntity.class)
	@JoinColumn(name="ownerID")
	private OwnerEntity detail;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="addressId")
	private int addressId;
	
	@Column(name="hNo")
	private int hNo;
	
	
	@Column(name="street_name")
	private String street_name;
	




	public OwnerEntity getDetail() {
		return detail;
	}
	public void setDetail(OwnerEntity detail) {
		this.detail = detail;
	}
	

	@Column(name="city")
	private String city;
	@Column(name = "state")
	private String state;
	
	
	public int getAddressId() {
		return addressId;
	}
	

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

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

	@Column(name="zip_Codel")
	private String zip_Code;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_dt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date update_dt;

}
