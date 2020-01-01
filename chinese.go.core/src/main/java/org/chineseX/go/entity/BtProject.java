package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bt_project database table.
 * 
 */
@Entity
@Table(name="bt_project")
@NamedQuery(name="BtProject.findAll", query="SELECT b FROM BtProject b")
public class BtProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROJECT_ID")
	private String projectId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="person_liable_id")
	private String personLiableId;

	@Column(name="PROJECT_NAME")
	private String projectName;

	@Column(name="PROJECT_TYPE")
	private String projectType;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtSprint
	@OneToMany(mappedBy="btProject")
	private List<BtSprint> btSprints;

	public BtProject() {
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
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

	public String getPersonLiableId() {
		return this.personLiableId;
	}

	public void setPersonLiableId(String personLiableId) {
		this.personLiableId = personLiableId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
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

	public List<BtSprint> getBtSprints() {
		return this.btSprints;
	}

	public void setBtSprints(List<BtSprint> btSprints) {
		this.btSprints = btSprints;
	}

	public BtSprint addBtSprint(BtSprint btSprint) {
		getBtSprints().add(btSprint);
		btSprint.setBtProject(this);

		return btSprint;
	}

	public BtSprint removeBtSprint(BtSprint btSprint) {
		getBtSprints().remove(btSprint);
		btSprint.setBtProject(null);

		return btSprint;
	}

}