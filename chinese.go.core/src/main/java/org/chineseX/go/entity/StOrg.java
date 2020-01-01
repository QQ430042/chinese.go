package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_org database table.
 * 
 */
@Entity
@Table(name="st_org")
@NamedQuery(name="StOrg.findAll", query="SELECT s FROM StOrg s")
public class StOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORG_ID")
	private String orgId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="ORG_CODE")
	private String orgCode;

	@Column(name="ORG_LEVEL")
	private String orgLevel;

	@Column(name="ORG_MANAGER_USER_ID")
	private String orgManagerUserId;

	@Column(name="ORG_NAME_CN")
	private String orgNameCn;

	@Column(name="ORG_NAME_EN")
	private String orgNameEn;

	@Column(name="ORG_STATUS")
	private String orgStatus;

	@Column(name="ORG_TYPE")
	private String orgType;

	@Column(name="PARENT_ORG_ID")
	private String parentOrgId;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StOrg() {
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgLevel() {
		return this.orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getOrgManagerUserId() {
		return this.orgManagerUserId;
	}

	public void setOrgManagerUserId(String orgManagerUserId) {
		this.orgManagerUserId = orgManagerUserId;
	}

	public String getOrgNameCn() {
		return this.orgNameCn;
	}

	public void setOrgNameCn(String orgNameCn) {
		this.orgNameCn = orgNameCn;
	}

	public String getOrgNameEn() {
		return this.orgNameEn;
	}

	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}

	public String getOrgStatus() {
		return this.orgStatus;
	}

	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getParentOrgId() {
		return this.parentOrgId;
	}

	public void setParentOrgId(String parentOrgId) {
		this.parentOrgId = parentOrgId;
	}

	public int getShowOrder() {
		return this.showOrder;
	}

	public void setShowOrder(int showOrder) {
		this.showOrder = showOrder;
	}

	public String getUpDataBy() {
		return this.upDataBy;
	}

	public void setUpDataBy(String upDataBy) {
		this.upDataBy = upDataBy;
	}

	public Timestamp getUpDataTime() {
		return this.upDataTime;
	}

	public void setUpDataTime(Timestamp upDataTime) {
		this.upDataTime = upDataTime;
	}

}