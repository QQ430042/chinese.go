package org.chinese.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the bt_team_user database table.
 * 
 */
@Entity
@Table(name="bt_team_user")
@NamedQuery(name="BtTeamUser.findAll", query="SELECT b FROM BtTeamUser b")
public class BtTeamUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TEAM_USER_ID")
	private String teamUserId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Temporal(TemporalType.DATE)
	private Date date_of_accession;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_departure")
	private Date dateOfDeparture;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	private String resource_type;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	//bi-directional many-to-one association to BtTeam
	@ManyToOne
	@JoinColumn(name="TEAM_ID")
	private BtTeam btTeam;

	//bi-directional many-to-one association to StUser
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private StUser stUser;

	public BtTeamUser() {
	}

	public String getTeamUserId() {
		return this.teamUserId;
	}

	public void setTeamUserId(String teamUserId) {
		this.teamUserId = teamUserId;
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

	public Date getDate_of_accession() {
		return this.date_of_accession;
	}

	public void setDate_of_accession(Date date_of_accession) {
		this.date_of_accession = date_of_accession;
	}

	public Date getDateOfDeparture() {
		return this.dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getResource_type() {
		return this.resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
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

	public BtTeam getBtTeam() {
		return this.btTeam;
	}

	public void setBtTeam(BtTeam btTeam) {
		this.btTeam = btTeam;
	}

	public StUser getStUser() {
		return this.stUser;
	}

	public void setStUser(StUser stUser) {
		this.stUser = stUser;
	}

}