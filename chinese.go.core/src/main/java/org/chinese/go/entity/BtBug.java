package org.chinese.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bt_bug database table.
 * 
 */
@Entity
@Table(name="bt_bug")
@NamedQuery(name="BtBug.findAll", query="SELECT b FROM BtBug b")
public class BtBug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUG_ID")
	private String bugId;

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

	//bi-directional many-to-one association to BtStory
	@ManyToOne
	@JoinColumn(name="STORY_ID")
	private BtStory btStory;

	public BtBug() {
	}

	public String getBugId() {
		return this.bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
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

	public BtStory getBtStory() {
		return this.btStory;
	}

	public void setBtStory(BtStory btStory) {
		this.btStory = btStory;
	}

}