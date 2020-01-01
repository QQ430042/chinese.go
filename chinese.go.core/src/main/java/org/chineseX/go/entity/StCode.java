package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_code database table.
 * 
 */
@Entity
@Table(name="st_code")
@NamedQuery(name="StCode.findAll", query="SELECT s FROM StCode s")
public class StCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_ID")
	private String codeId;

	@Column(name="CLASSIFY_ID")
	private String classifyId;

	@Column(name="CODE_DESC")
	private String codeDesc;

	@Column(name="CODE_KEY")
	private String codeKey;

	@Column(name="CODE_NAME")
	private String codeName;

	@Column(name="CODE_STATUS")
	private String codeStatus;

	@Column(name="CODE_VALUE")
	private String codeValue;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="EXTEBDED_ATTRIBUTE_1")
	private String extebdedAttribute1;

	@Column(name="EXTEBDED_ATTRIBUTE_2")
	private String extebdedAttribute2;

	@Column(name="EXTEBDED_ATTRIBUTE_3")
	private String extebdedAttribute3;

	@Column(name="EXTEBDED_ATTRIBUTE_4")
	private String extebdedAttribute4;

	@Column(name="EXTEBDED_ATTRIBUTE_5")
	private String extebdedAttribute5;

	@Column(name="EXTEBDED_ATTRIBUTE_6")
	private String extebdedAttribute6;

	@Column(name="EXTEBDED_ATTRIBUTE_7")
	private String extebdedAttribute7;

	@Column(name="EXTEBDED_ATTRIBUTE_8")
	private String extebdedAttribute8;

	@Column(name="EXTEBDED_ATTRIBUTE_9")
	private String extebdedAttribute9;

	@Column(name="PARENT_CODE_ID")
	private String parentCodeId;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StCode() {
	}

	public String getCodeId() {
		return this.codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getClassifyId() {
		return this.classifyId;
	}

	public void setClassifyId(String classifyId) {
		this.classifyId = classifyId;
	}

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCodeKey() {
		return this.codeKey;
	}

	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeStatus() {
		return this.codeStatus;
	}

	public void setCodeStatus(String codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
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

	public String getExtebdedAttribute1() {
		return this.extebdedAttribute1;
	}

	public void setExtebdedAttribute1(String extebdedAttribute1) {
		this.extebdedAttribute1 = extebdedAttribute1;
	}

	public String getExtebdedAttribute2() {
		return this.extebdedAttribute2;
	}

	public void setExtebdedAttribute2(String extebdedAttribute2) {
		this.extebdedAttribute2 = extebdedAttribute2;
	}

	public String getExtebdedAttribute3() {
		return this.extebdedAttribute3;
	}

	public void setExtebdedAttribute3(String extebdedAttribute3) {
		this.extebdedAttribute3 = extebdedAttribute3;
	}

	public String getExtebdedAttribute4() {
		return this.extebdedAttribute4;
	}

	public void setExtebdedAttribute4(String extebdedAttribute4) {
		this.extebdedAttribute4 = extebdedAttribute4;
	}

	public String getExtebdedAttribute5() {
		return this.extebdedAttribute5;
	}

	public void setExtebdedAttribute5(String extebdedAttribute5) {
		this.extebdedAttribute5 = extebdedAttribute5;
	}

	public String getExtebdedAttribute6() {
		return this.extebdedAttribute6;
	}

	public void setExtebdedAttribute6(String extebdedAttribute6) {
		this.extebdedAttribute6 = extebdedAttribute6;
	}

	public String getExtebdedAttribute7() {
		return this.extebdedAttribute7;
	}

	public void setExtebdedAttribute7(String extebdedAttribute7) {
		this.extebdedAttribute7 = extebdedAttribute7;
	}

	public String getExtebdedAttribute8() {
		return this.extebdedAttribute8;
	}

	public void setExtebdedAttribute8(String extebdedAttribute8) {
		this.extebdedAttribute8 = extebdedAttribute8;
	}

	public String getExtebdedAttribute9() {
		return this.extebdedAttribute9;
	}

	public void setExtebdedAttribute9(String extebdedAttribute9) {
		this.extebdedAttribute9 = extebdedAttribute9;
	}

	public String getParentCodeId() {
		return this.parentCodeId;
	}

	public void setParentCodeId(String parentCodeId) {
		this.parentCodeId = parentCodeId;
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