package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bt_meeting database table.
 * 
 */
@Entity
@Table(name="bt_meeting")
@NamedQuery(name="BtMeeting.findAll", query="SELECT b FROM BtMeeting b")
public class BtMeeting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MEETING_ID")
	private String meetingId;

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

	//bi-directional many-to-one association to BtMeetingUser
	@OneToMany(mappedBy="btMeeting")
	private List<BtMeetingUser> btMeetingUsers;

	public BtMeeting() {
	}

	public String getMeetingId() {
		return this.meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
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

	public List<BtMeetingUser> getBtMeetingUsers() {
		return this.btMeetingUsers;
	}

	public void setBtMeetingUsers(List<BtMeetingUser> btMeetingUsers) {
		this.btMeetingUsers = btMeetingUsers;
	}

	public BtMeetingUser addBtMeetingUser(BtMeetingUser btMeetingUser) {
		getBtMeetingUsers().add(btMeetingUser);
		btMeetingUser.setBtMeeting(this);

		return btMeetingUser;
	}

	public BtMeetingUser removeBtMeetingUser(BtMeetingUser btMeetingUser) {
		getBtMeetingUsers().remove(btMeetingUser);
		btMeetingUser.setBtMeeting(null);

		return btMeetingUser;
	}

}