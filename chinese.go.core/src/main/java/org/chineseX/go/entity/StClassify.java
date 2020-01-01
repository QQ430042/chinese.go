package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_classify database table.
 * 
 */
@Entity
@Table(name="st_classify")
@NamedQuery(name="StClassify.findAll", query="SELECT s FROM StClassify s")
public class StClassify implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLASSIFY_ID")
	private String classifyId;

	@Column(name="CLASSIFY_DESC")
	private String classifyDesc;

	@Column(name="CLASSIFY_NAME")
	private String classifyName;

	@Column(name="CLASSIFY_TYPE")
	private String classifyType;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StClassify() {
	}

	public String getClassifyId() {
		return this.classifyId;
	}

	public void setClassifyId(String classifyId) {
		this.classifyId = classifyId;
	}

	public String getClassifyDesc() {
		return this.classifyDesc;
	}

	public void setClassifyDesc(String classifyDesc) {
		this.classifyDesc = classifyDesc;
	}

	public String getClassifyName() {
		return this.classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public String getClassifyType() {
		return this.classifyType;
	}

	public void setClassifyType(String classifyType) {
		this.classifyType = classifyType;
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