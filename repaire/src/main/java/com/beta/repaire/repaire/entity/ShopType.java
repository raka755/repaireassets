package com.beta.repaire.repaire.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoptype")
public class ShopType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shoptypeid")
	private Integer shopTypeId;
	
	@Column(name="shoptypename")
	private String shopTypeName;
	
	@Column(name="shoptypedescription")
	private String shopTypeDescription;
	
	@Column(name="status")
	private Boolean status;

	public Integer getShopTypeId() {
		return shopTypeId;
	}

	public void setShopTypeId(Integer shopTypeId) {
		this.shopTypeId = shopTypeId;
	}

	public String getShopTypeName() {
		return shopTypeName;
	}

	public void setShopTypeName(String shopTypeName) {
		this.shopTypeName = shopTypeName;
	}

	public String getShopTypeDescription() {
		return shopTypeDescription;
	}

	public void setShopTypeDescription(String shopTypeDescription) {
		this.shopTypeDescription = shopTypeDescription;
	}

	public Boolean getStatus() {
		return status;
	}

	

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ShopType [shopTypeId=" + shopTypeId + ", shopTypeName=" + shopTypeName + ", shopTypeDescription="
				+ shopTypeDescription + ", status=" + status + "]";
	}

}
