package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_sequence database table.
 * 
 */
@Entity
@Table(name="st_sequence")
@NamedQuery(name="StSequence.findAll", query="SELECT s FROM StSequence s")
public class StSequence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEQ_CODE")
	private String seqCode;

	@Column(name="BUFFER_SIZE")
	private int bufferSize;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="CURRENT_VALUE")
	private int currentValue;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="SEQ_NAME")
	private String seqName;

	@Column(name="SEQ_PREFIX")
	private String seqPrefix;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StSequence() {
	}

	public String getSeqCode() {
		return this.seqCode;
	}

	public void setSeqCode(String seqCode) {
		this.seqCode = seqCode;
	}

	public int getBufferSize() {
		return this.bufferSize;
	}

	public void setBufferSize(int bufferSize) {
		this.bufferSize = bufferSize;
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

	public int getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

	public String getSeqPrefix() {
		return this.seqPrefix;
	}

	public void setSeqPrefix(String seqPrefix) {
		this.seqPrefix = seqPrefix;
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