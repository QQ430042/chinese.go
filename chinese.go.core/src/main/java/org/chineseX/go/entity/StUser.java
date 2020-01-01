package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the st_user database table.
 * 
 */
@Entity
@Table(name="st_user")
@NamedQuery(name="StUser.findAll", query="SELECT s FROM StUser s")
public class StUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private String userId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="FIRST_LOGIN_DATE")
	private Timestamp firstLoginDate;

	@Column(name="LAST_LOGIN_DATE")
	private Timestamp lastLoginDate;

	@Column(name="LAST_MODIFIED_PIN_DATE")
	private Timestamp lastModifiedPinDate;

	@Column(name="ORG_ID")
	private String orgId;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	@Column(name="USER_CODE")
	private String userCode;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_GENDER")
	private String userGender;

	@Column(name="USER_NAME_CN")
	private String userNameCn;

	@Column(name="USER_NAME_EN")
	private String userNameEn;

	@Column(name="USER_NICK_NAME")
	private String userNickName;

	@Column(name="USER_PHONE_NUMBER")
	private String userPhoneNumber;

	@Column(name="USER_TITLE")
	private String userTitle;

	//bi-directional many-to-one association to BtTeamUser
	@OneToMany(mappedBy="stUser")
	private List<BtTeamUser> btTeamUsers;

	public StUser() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Timestamp getFirstLoginDate() {
		return this.firstLoginDate;
	}

	public void setFirstLoginDate(Timestamp firstLoginDate) {
		this.firstLoginDate = firstLoginDate;
	}

	public Timestamp getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Timestamp getLastModifiedPinDate() {
		return this.lastModifiedPinDate;
	}

	public void setLastModifiedPinDate(Timestamp lastModifiedPinDate) {
		this.lastModifiedPinDate = lastModifiedPinDate;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
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

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserNameCn() {
		return this.userNameCn;
	}

	public void setUserNameCn(String userNameCn) {
		this.userNameCn = userNameCn;
	}

	public String getUserNameEn() {
		return this.userNameEn;
	}

	public void setUserNameEn(String userNameEn) {
		this.userNameEn = userNameEn;
	}

	public String getUserNickName() {
		return this.userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserPhoneNumber() {
		return this.userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserTitle() {
		return this.userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public List<BtTeamUser> getBtTeamUsers() {
		return this.btTeamUsers;
	}

	public void setBtTeamUsers(List<BtTeamUser> btTeamUsers) {
		this.btTeamUsers = btTeamUsers;
	}

	public BtTeamUser addBtTeamUser(BtTeamUser btTeamUser) {
		getBtTeamUsers().add(btTeamUser);
		btTeamUser.setStUser(this);

		return btTeamUser;
	}

	public BtTeamUser removeBtTeamUser(BtTeamUser btTeamUser) {
		getBtTeamUsers().remove(btTeamUser);
		btTeamUser.setStUser(null);

		return btTeamUser;
	}

}