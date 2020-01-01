package org.chinese.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bt_task database table.
 * 
 */
@Entity
@Table(name="bt_task")
@NamedQuery(name="BtTask.findAll", query="SELECT b FROM BtTask b")
public class BtTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TASK_ID")
	private String taskId;

	private int completion_work;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	private int estimated_work;

	@Column(name="person_liable_id")
	private String personLiableId;

	@Column(name="PHASE_CODE")
	private String phaseCode;

	private int residual_work;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="TASK_DESC")
	private String taskDesc;

	@Column(name="TASK_NAME")
	private String taskName;

	@Column(name="TASK_TYPE")
	private String taskType;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtStory
	@ManyToOne
	@JoinColumn(name="STORY_ID")
	private BtStory btStory;

	public BtTask() {
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public int getCompletion_work() {
		return this.completion_work;
	}

	public void setCompletion_work(int completion_work) {
		this.completion_work = completion_work;
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

	public int getEstimated_work() {
		return this.estimated_work;
	}

	public void setEstimated_work(int estimated_work) {
		this.estimated_work = estimated_work;
	}

	public String getPersonLiableId() {
		return this.personLiableId;
	}

	public void setPersonLiableId(String personLiableId) {
		this.personLiableId = personLiableId;
	}

	public String getPhaseCode() {
		return this.phaseCode;
	}

	public void setPhaseCode(String phaseCode) {
		this.phaseCode = phaseCode;
	}

	public int getResidual_work() {
		return this.residual_work;
	}

	public void setResidual_work(int residual_work) {
		this.residual_work = residual_work;
	}

	public int getShowOrder() {
		return this.showOrder;
	}

	public void setShowOrder(int showOrder) {
		this.showOrder = showOrder;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
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