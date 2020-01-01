package org.chinese.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bt_sprint_phase database table.
 * 
 */
@Entity
@Table(name="bt_sprint_phase")
@NamedQuery(name="BtSprintPhase.findAll", query="SELECT b FROM BtSprintPhase b")
public class BtSprintPhase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRINT_PHASE_ID")
	private String sprintPhaseId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="PHASE_CODE")
	private String phaseCode;

	@Column(name="PHASE_NAME")
	private String phaseName;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtSprint
	@ManyToOne
	@JoinColumn(name="SPRINT_ID")
	private BtSprint btSprint;

	public BtSprintPhase() {
	}

	public String getSprintPhaseId() {
		return this.sprintPhaseId;
	}

	public void setSprintPhaseId(String sprintPhaseId) {
		this.sprintPhaseId = sprintPhaseId;
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

	public String getPhaseCode() {
		return this.phaseCode;
	}

	public void setPhaseCode(String phaseCode) {
		this.phaseCode = phaseCode;
	}

	public String getPhaseName() {
		return this.phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
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

	public BtSprint getBtSprint() {
		return this.btSprint;
	}

	public void setBtSprint(BtSprint btSprint) {
		this.btSprint = btSprint;
	}

}