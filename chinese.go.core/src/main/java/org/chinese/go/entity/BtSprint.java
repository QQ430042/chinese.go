package org.chinese.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bt_sprint database table.
 * 
 */
@Entity
@Table(name="bt_sprint")
@NamedQuery(name="BtSprint.findAll", query="SELECT b FROM BtSprint b")
public class BtSprint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRINT_ID")
	private String sprintId;

	@Temporal(TemporalType.DATE)
	@Column(name="BEGIN_DATE")
	private Date beginDate;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="SPRINT_DESC")
	private String sprintDesc;

	@Column(name="SPRINT_NAME")
	private String sprintName;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtProject
	@ManyToOne
	@JoinColumn(name="PROJECT_ID")
	private BtProject btProject;

	//bi-directional many-to-one association to BtTeam
	@ManyToOne
	@JoinColumn(name="TEAM_ID")
	private BtTeam btTeam;

	//bi-directional many-to-one association to BtSprintPhase
	@OneToMany(mappedBy="btSprint")
	private List<BtSprintPhase> btSprintPhases;

	//bi-directional many-to-one association to BtStory
	@OneToMany(mappedBy="btSprint")
	private List<BtStory> btStories;

	public BtSprint() {
	}

	public String getSprintId() {
		return this.sprintId;
	}

	public void setSprintId(String sprintId) {
		this.sprintId = sprintId;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
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

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getShowOrder() {
		return this.showOrder;
	}

	public void setShowOrder(int showOrder) {
		this.showOrder = showOrder;
	}

	public String getSprintDesc() {
		return this.sprintDesc;
	}

	public void setSprintDesc(String sprintDesc) {
		this.sprintDesc = sprintDesc;
	}

	public String getSprintName() {
		return this.sprintName;
	}

	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
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

	public BtProject getBtProject() {
		return this.btProject;
	}

	public void setBtProject(BtProject btProject) {
		this.btProject = btProject;
	}

	public BtTeam getBtTeam() {
		return this.btTeam;
	}

	public void setBtTeam(BtTeam btTeam) {
		this.btTeam = btTeam;
	}

	public List<BtSprintPhase> getBtSprintPhases() {
		return this.btSprintPhases;
	}

	public void setBtSprintPhases(List<BtSprintPhase> btSprintPhases) {
		this.btSprintPhases = btSprintPhases;
	}

	public BtSprintPhase addBtSprintPhas(BtSprintPhase btSprintPhas) {
		getBtSprintPhases().add(btSprintPhas);
		btSprintPhas.setBtSprint(this);

		return btSprintPhas;
	}

	public BtSprintPhase removeBtSprintPhas(BtSprintPhase btSprintPhas) {
		getBtSprintPhases().remove(btSprintPhas);
		btSprintPhas.setBtSprint(null);

		return btSprintPhas;
	}

	public List<BtStory> getBtStories() {
		return this.btStories;
	}

	public void setBtStories(List<BtStory> btStories) {
		this.btStories = btStories;
	}

	public BtStory addBtStory(BtStory btStory) {
		getBtStories().add(btStory);
		btStory.setBtSprint(this);

		return btStory;
	}

	public BtStory removeBtStory(BtStory btStory) {
		getBtStories().remove(btStory);
		btStory.setBtSprint(null);

		return btStory;
	}

}