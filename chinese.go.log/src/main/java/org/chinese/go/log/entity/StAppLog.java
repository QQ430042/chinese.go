package org.chinese.go.log.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the st_app_log database table.
 * 
 */
@Entity
@Table(name="st_app_log")
@NamedQuery(name="StAppLog.findAll", query="SELECT s FROM StAppLog s")
public class StAppLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid2")
    @GeneratedValue(generator="idGenerator")
	@Column(name="LOG_ID")
	private String logId;

	@Lob
	private String args;

	@Column(name="CLIENT_IP")
	private String clientIp;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag = "N";

	@Lob
	private String exception;

	@Column(name="METHOD_NAME")
	private String methodName;

	@Column(name="PROC_TIME")
	private int procTime;

	@Column(name="REQ_TIME")
	private Timestamp reqTime;

	@Column(name="RESP_TIME")
	private Timestamp respTime;

	@Lob
	private String result;

	@Column(name="SERVER_INFO")
	private String serverInfo;

	@Column(name="SERVICE_URL")
	private String serviceUrl;

	@Column(name="SESSION_ID")
	private String sessionId;

	@Column(name="SSO_TOKEN")
	private String ssoToken;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StAppLog() {
	}

	public String getLogId() {
		return this.logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getArgs() {
		return this.args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
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

	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public int getProcTime() {
		return this.procTime;
	}

	public void setProcTime(int procTime) {
		this.procTime = procTime;
	}

	public Timestamp getReqTime() {
		return this.reqTime;
	}

	public void setReqTime(Timestamp reqTime) {
		this.reqTime = reqTime;
	}

	public Timestamp getRespTime() {
		return this.respTime;
	}

	public void setRespTime(Timestamp respTime) {
		this.respTime = respTime;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getServerInfo() {
		return this.serverInfo;
	}

	public void setServerInfo(String serverInfo) {
		this.serverInfo = serverInfo;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSsoToken() {
		return this.ssoToken;
	}

	public void setSsoToken(String ssoToken) {
		this.ssoToken = ssoToken;
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