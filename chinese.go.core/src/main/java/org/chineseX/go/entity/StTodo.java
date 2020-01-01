package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the st_todo database table.
 * 
 */
@Entity
@Table(name="st_todo")
@NamedQuery(name="StTodo.findAll", query="SELECT s FROM StTodo s")
public class StTodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TODO_ID")
	private String todoId;

	@Column(name="APPLY_DATE")
	private Timestamp applyDate;

	@Column(name="APPROVAL_DATE")
	private Timestamp approvalDate;

	@Column(name="APPROVAL_OPINION")
	private String approvalOpinion;

	@Column(name="APPROVAL_RESULT")
	private String approvalResult;

	@Column(name="BUSINESS_ID")
	private String businessId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="EXPIRATION_DATE")
	private Timestamp expirationDate;

	@Column(name="FLOW_ID")
	private String flowId;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="TASK_APPLICANT_ID")
	private String taskApplicantId;

	@Column(name="TASK_APPROVAL_ID")
	private String taskApprovalId;

	@Column(name="TASK_STATE")
	private String taskState;

	@Column(name="TASK_TITLE_CN")
	private String taskTitleCn;

	@Column(name="TASK_TITLE_EN")
	private String taskTitleEn;

	@Column(name="TASK_TYPE")
	private String taskType;

	@Column(name="TASK_URL_APPROVAL")
	private String taskUrlApproval;

	@Column(name="TASK_URL_CANCEL")
	private String taskUrlCancel;

	@Column(name="TASK_URL_DELETE")
	private String taskUrlDelete;

	@Column(name="TASK_URL_VIEW")
	private String taskUrlView;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StTodo() {
	}

	public String getTodoId() {
		return this.todoId;
	}

	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}

	public Timestamp getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}

	public Timestamp getApprovalDate() {
		return this.approvalDate;
	}

	public void setApprovalDate(Timestamp approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getApprovalOpinion() {
		return this.approvalOpinion;
	}

	public void setApprovalOpinion(String approvalOpinion) {
		this.approvalOpinion = approvalOpinion;
	}

	public String getApprovalResult() {
		return this.approvalResult;
	}

	public void setApprovalResult(String approvalResult) {
		this.approvalResult = approvalResult;
	}

	public String getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
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

	public Timestamp getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public int getShowOrder() {
		return this.showOrder;
	}

	public void setShowOrder(int showOrder) {
		this.showOrder = showOrder;
	}

	public String getTaskApplicantId() {
		return this.taskApplicantId;
	}

	public void setTaskApplicantId(String taskApplicantId) {
		this.taskApplicantId = taskApplicantId;
	}

	public String getTaskApprovalId() {
		return this.taskApprovalId;
	}

	public void setTaskApprovalId(String taskApprovalId) {
		this.taskApprovalId = taskApprovalId;
	}

	public String getTaskState() {
		return this.taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public String getTaskTitleCn() {
		return this.taskTitleCn;
	}

	public void setTaskTitleCn(String taskTitleCn) {
		this.taskTitleCn = taskTitleCn;
	}

	public String getTaskTitleEn() {
		return this.taskTitleEn;
	}

	public void setTaskTitleEn(String taskTitleEn) {
		this.taskTitleEn = taskTitleEn;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskUrlApproval() {
		return this.taskUrlApproval;
	}

	public void setTaskUrlApproval(String taskUrlApproval) {
		this.taskUrlApproval = taskUrlApproval;
	}

	public String getTaskUrlCancel() {
		return this.taskUrlCancel;
	}

	public void setTaskUrlCancel(String taskUrlCancel) {
		this.taskUrlCancel = taskUrlCancel;
	}

	public String getTaskUrlDelete() {
		return this.taskUrlDelete;
	}

	public void setTaskUrlDelete(String taskUrlDelete) {
		this.taskUrlDelete = taskUrlDelete;
	}

	public String getTaskUrlView() {
		return this.taskUrlView;
	}

	public void setTaskUrlView(String taskUrlView) {
		this.taskUrlView = taskUrlView;
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