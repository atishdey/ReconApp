package com.atish.demo.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseAimdbrcnEntity{

	@Column(name = "CREATED_BY", nullable = false, length = 20)
	private String createdBy;

	@Column(name = "CREATION_DATE", nullable = false, insertable = false, updatable = false)
	private Timestamp creationDate;

	@Column(name = "UPDATED_BY", nullable = false, length = 20)
	private String updatedBy;

	@Column(name = "UPDATE_DATE", nullable = false, insertable = false)
	private Timestamp updateDate;

	@Column(name = "APP_REGI_DATE", nullable = false, length = 10)
	private Date appRegiDate;

	@Column(name = "APP_UPD_DATE", nullable = false, length = 10)
	private Date appUpdDate;

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the creationDate
	 */
	public Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the updateDate
	 */
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the appRegiDate
	 */
	public Date getAppRegiDate() {
		return appRegiDate;
	}

	/**
	 * @param appRegiDate the appRegiDate to set
	 */
	public void setAppRegiDate(Date appRegiDate) {
		this.appRegiDate = appRegiDate;
	}

	/**
	 * @return the appUpdDate
	 */
	public Date getAppUpdDate() {
		return appUpdDate;
	}

	/**
	 * @param appUpdDate the appUpdDate to set
	 */
	public void setAppUpdDate(Date appUpdDate) {
		this.appUpdDate = appUpdDate;
	}

}
