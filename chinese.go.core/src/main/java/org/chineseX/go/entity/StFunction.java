package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_function database table.
 * 
 */
@Entity
@Table(name="st_function")
@NamedQuery(name="StFunction.findAll", query="SELECT s FROM StFunction s")
public class StFunction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FUNCTION_ID")
	private String functionId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="FUNCTION_CODE")
	private String functionCode;

	@Column(name="FUNCTION_EXPLAIN")
	private String functionExplain;

	@Column(name="FUNCTION_NAME_CN")
	private String functionNameCn;

	@Column(name="FUNCTION_NAME_EN")
	private String functionNameEn;

	@Column(name="FUNCTION_SCRIPT")
	private String functionScript;

	@Column(name="FUNCTION_STATUS")
	private String functionStatus;

	@Column(name="FUNCTION_TYPE")
	private String functionType;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StFunction() {
	}

	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
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

	public String getFunctionCode() {
		return this.functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionExplain() {
		return this.functionExplain;
	}

	public void setFunctionExplain(String functionExplain) {
		this.functionExplain = functionExplain;
	}

	public String getFunctionNameCn() {
		return this.functionNameCn;
	}

	public void setFunctionNameCn(String functionNameCn) {
		this.functionNameCn = functionNameCn;
	}

	public String getFunctionNameEn() {
		return this.functionNameEn;
	}

	public void setFunctionNameEn(String functionNameEn) {
		this.functionNameEn = functionNameEn;
	}

	public String getFunctionScript() {
		return this.functionScript;
	}

	public void setFunctionScript(String functionScript) {
		this.functionScript = functionScript;
	}

	public String getFunctionStatus() {
		return this.functionStatus;
	}

	public void setFunctionStatus(String functionStatus) {
		this.functionStatus = functionStatus;
	}

	public String getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
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