package org.chinese.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bt_story database table.
 * 
 */
@Entity
@Table(name="bt_story")
@NamedQuery(name="BtStory.findAll", query="SELECT b FROM BtStory b")
public class BtStory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STORY_ID")
	private String storyId;

	@Temporal(TemporalType.DATE)
	private Date actual_BEGIN_DATE;

	@Temporal(TemporalType.DATE)
	private Date actual_END_DATE;

	@Column(name="AS_A")
	private String asA;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="I_WANT_TO")
	private String iWantTo;

	@Column(name="person_liable_id")
	private String personLiableId;

	@Column(name="PHASE_CODE")
	private String phaseCode;

	@Temporal(TemporalType.DATE)
	@Column(name="PLAN_BEGIN_DATE")
	private Date planBeginDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PLAN_END_DATE")
	private Date planEndDate;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="SO_THAT_I_CAN")
	private String soThatICan;

	@Column(name="STORY_NAME")
	private String storyName;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtBug
	@OneToMany(mappedBy="btStory")
	private List<BtBug> btBugs;

	//bi-directional many-to-one association to BtMeeting
	@OneToMany(mappedBy="btStory")
	private List<BtMeeting> btMeetings;

	//bi-directional many-to-one association to BtSprint
	@ManyToOne
	@JoinColumn(name="SPRINT_ID")
	private BtSprint btSprint;

	//bi-directional many-to-one association to BtTask
	@OneToMany(mappedBy="btStory")
	private List<BtTask> btTasks;

	public BtStory() {
	}

	public String getStoryId() {
		return this.storyId;
	}

	public void setStoryId(String storyId) {
		this.storyId = storyId;
	}

	public Date getActual_BEGIN_DATE() {
		return this.actual_BEGIN_DATE;
	}

	public void setActual_BEGIN_DATE(Date actual_BEGIN_DATE) {
		this.actual_BEGIN_DATE = actual_BEGIN_DATE;
	}

	public Date getActual_END_DATE() {
		return this.actual_END_DATE;
	}

	public void setActual_END_DATE(Date actual_END_DATE) {
		this.actual_END_DATE = actual_END_DATE;
	}

	public String getAsA() {
		return this.asA;
	}

	public void setAsA(String asA) {
		this.asA = asA;
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

	public String getIWantTo() {
		return this.iWantTo;
	}

	public void setIWantTo(String iWantTo) {
		this.iWantTo = iWantTo;
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

	public Date getPlanBeginDate() {
		return this.planBeginDate;
	}

	public void setPlanBeginDate(Date planBeginDate) {
		this.planBeginDate = planBeginDate;
	}

	public Date getPlanEndDate() {
		return this.planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public int getShowOrder() {
		return this.showOrder;
	}

	public void setShowOrder(int showOrder) {
		this.showOrder = showOrder;
	}

	public String getSoThatICan() {
		return this.soThatICan;
	}

	public void setSoThatICan(String soThatICan) {
		this.soThatICan = soThatICan;
	}

	public String getStoryName() {
		return this.storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
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

	public List<BtBug> getBtBugs() {
		return this.btBugs;
	}

	public void setBtBugs(List<BtBug> btBugs) {
		this.btBugs = btBugs;
	}

	public BtBug addBtBug(BtBug btBug) {
		getBtBugs().add(btBug);
		btBug.setBtStory(this);

		return btBug;
	}

	public BtBug removeBtBug(BtBug btBug) {
		getBtBugs().remove(btBug);
		btBug.setBtStory(null);

		return btBug;
	}

	public List<BtMeeting> getBtMeetings() {
		return this.btMeetings;
	}

	public void setBtMeetings(List<BtMeeting> btMeetings) {
		this.btMeetings = btMeetings;
	}

	public BtMeeting addBtMeeting(BtMeeting btMeeting) {
		getBtMeetings().add(btMeeting);
		btMeeting.setBtStory(this);

		return btMeeting;
	}

	public BtMeeting removeBtMeeting(BtMeeting btMeeting) {
		getBtMeetings().remove(btMeeting);
		btMeeting.setBtStory(null);

		return btMeeting;
	}

	public BtSprint getBtSprint() {
		return this.btSprint;
	}

	public void setBtSprint(BtSprint btSprint) {
		this.btSprint = btSprint;
	}

	public List<BtTask> getBtTasks() {
		return this.btTasks;
	}

	public void setBtTasks(List<BtTask> btTasks) {
		this.btTasks = btTasks;
	}

	public BtTask addBtTask(BtTask btTask) {
		getBtTasks().add(btTask);
		btTask.setBtStory(this);

		return btTask;
	}

	public BtTask removeBtTask(BtTask btTask) {
		getBtTasks().remove(btTask);
		btTask.setBtStory(null);

		return btTask;
	}

}