package org.chinese.go.i18n.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;


/**
 * The persistent class for the st_i18n database table.
 * 
 */
@Entity
@Table(name="st_i18n")
@NamedQuery(name="StI18n.findAll", query="SELECT s FROM StI18n s")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class StI18n implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid2")
    @GeneratedValue(generator="idGenerator")
	@Column(name="MSG_ID")
	private String msgId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="MSG_KEY")
	private String msgKey;

	@Column(name="MSG_LANGUAGE")
	private String msgLanguage;

	@Column(name="MSG_TYPE")
	private String msgType;

	@Column(name="MSG_VALUE")
	private String msgValue;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StI18n() {
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
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

	public String getMsgKey() {
		return this.msgKey;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}

	public String getMsgLanguage() {
		return this.msgLanguage;
	}

	public void setMsgLanguage(String msgLanguage) {
		this.msgLanguage = msgLanguage;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgValue() {
		return this.msgValue;
	}

	public void setMsgValue(String msgValue) {
		this.msgValue = msgValue;
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