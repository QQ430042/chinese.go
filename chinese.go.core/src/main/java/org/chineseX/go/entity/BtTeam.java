package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the bt_team database table.
 * 
 */
@Entity
@Table(name="bt_team")
@NamedQuery(name="BtTeam.findAll", query="SELECT b FROM BtTeam b")
public class BtTeam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TEAM_ID")
	private String teamId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="TEAM_DESC")
	private String teamDesc;

	@Column(name="TEAM_NAME")
	private String teamName;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtSprint
	@OneToMany(mappedBy="btTeam")
	private List<BtSprint> btSprints;

	//bi-directional many-to-one association to BtTeamUser
	@OneToMany(mappedBy="btTeam")
	private List<BtTeamUser> btTeamUsers;

	public BtTeam() {
	}

	public String getTeamId() {
		return this.teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
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

	public String getTeamDesc() {
		return this.teamDesc;
	}

	public void setTeamDesc(String teamDesc) {
		this.teamDesc = teamDesc;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
		btSprint.setBtTeam(this);

		return btSprint;
	}

	public BtSprint removeBtSprint(BtSprint btSprint) {
		getBtSprints().remove(btSprint);
		btSprint.setBtTeam(null);

		return btSprint;
	}

	public List<BtTeamUser> getBtTeamUsers() {
		return this.btTeamUsers;
	}

	public void setBtTeamUsers(List<BtTeamUser> btTeamUsers) {
		this.btTeamUsers = btTeamUsers;
	}

	public BtTeamUser addBtTeamUser(BtTeamUser btTeamUser) {
		getBtTeamUsers().add(btTeamUser);
		btTeamUser.setBtTeam(this);

		return btTeamUser;
	}

	public BtTeamUser removeBtTeamUser(BtTeamUser btTeamUser) {
		getBtTeamUsers().remove(btTeamUser);
		btTeamUser.setBtTeam(null);

		return btTeamUser;
	}

}