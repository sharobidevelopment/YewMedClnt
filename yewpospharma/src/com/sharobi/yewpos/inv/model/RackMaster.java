package com.sharobi.yewpos.inv.model;

import java.io.Serializable;
import java.util.Date;

public class RackMaster implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private int id;

    
    private String name;

    
    private int storeId;

    
    private int companyId;
    private int isDeleted;

    
    private int createdBy;

    
    private Date createdDate;

    
    private int updatedBy;

    
    private Date updatedDate;

    
    private String lang;



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the storeId
	 */
	public int getStoreId() {
		return storeId;
	}



	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}



	/**
	 * @return the companyId
	 */
	public int getCompanyId() {
		return companyId;
	}



	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}



	/**
	 * @return the isDeleted
	 */
	public int getIsDeleted() {
		return isDeleted;
	}



	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}



	/**
	 * @return the createdBy
	 */
	public int getCreatedBy() {
		return createdBy;
	}



	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}



	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}



	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	/**
	 * @return the updatedBy
	 */
	public int getUpdatedBy() {
		return updatedBy;
	}



	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}



	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}



	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}



	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}



	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}



	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "RackMaster [id=" + id + ", name=" + name + ", storeId=" + storeId + ", companyId=" + companyId
				+ ", isDeleted=" + isDeleted + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + ", lang=" + lang + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getStoreId()=" + getStoreId() + ", getCompanyId()="
				+ getCompanyId() + ", getIsDeleted()=" + getIsDeleted() + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedBy()=" + getUpdatedBy()
				+ ", getUpdatedDate()=" + getUpdatedDate() + ", getLang()=" + getLang() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

    
	
}
