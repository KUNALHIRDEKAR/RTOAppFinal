package com.example.summary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.entity.AddressEntity;
import com.example.entity.OwnerEntity;
import com.example.entity.VhclEntity;
import com.example.entity.VhclRegEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Summary {

	@XmlElement
	private OwnerEntity ownerEntity;

	@XmlElement
	private AddressEntity addressEntity;
	@XmlElement
	private VhclEntity vhclEntity;
	@XmlElement
	private VhclRegEntity vhclRegEntity;

	public OwnerEntity getOwnerEntity() {
		return ownerEntity;
	}

	public void setOwnerEntity(OwnerEntity ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public VhclEntity getVhclEntity() {
		return vhclEntity;
	}

	public void setVhclEntity(VhclEntity vhclEntity) {
		this.vhclEntity = vhclEntity;
	}

	public VhclRegEntity getVhclRegEntity() {
		return vhclRegEntity;
	}

	public void setVhclRegEntity(VhclRegEntity vhclRegEntity) {
		this.vhclRegEntity = vhclRegEntity;
	}
}
