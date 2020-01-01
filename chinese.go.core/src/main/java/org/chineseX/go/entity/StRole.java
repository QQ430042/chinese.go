package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_role database table.
 * 
 */
@Entity
@Table(name="st_role")
@NamedQuery(name="StRole.findAll", query="SELECT s FROM StRole s")
public class StRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private String roleId;

	@Column(name="AVAILABILITY_DATE")
	private Timestamp availabilityDate;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="EXPIRY_DATE")
	private Timestamp expiryDate;

	@Column(name="ROLE_CODE")
	private String roleCode;

	@Column(name="ROLE_NAME_CN")
	private String roleNameCn;

	@Column(name="ROLE_NAME_EN")
	private String roleNameEn;

	@Column(name="ROLE_STATUS")
	private String roleStatus;

	@Column(name="ROLE_TYPE")
	private String roleType;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StRole() {
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Timestamp getAvailabilityDate() {
		return this.availabilityDate;
	}

	public void setAvailabilityDate(Timestamp availabilityDate) {
		this.availabilityDate = availabilityDate;
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

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleNameCn() {
		return this.roleNameCn;
	}

	public void setRoleNameCn(String roleNameCn) {
		this.roleNameCn = roleNameCn;
	}

	public String getRoleNameEn() {
		return this.roleNameEn;
	}

	public void setRoleNameEn(String roleNameEn) {
		this.roleNameEn = roleNameEn;
	}

	public String getRoleStatus() {
		return this.roleStatus;
	}

	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
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