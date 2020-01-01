package org.chineseX.go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the st_kalendar database table.
 * 
 */
@Entity
@Table(name="st_kalendar")
@NamedQuery(name="StKalendar.findAll", query="SELECT s FROM StKalendar s")
public class StKalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAY_ID")
	private String dayId;

	private String country;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="DELETE_FLAG")
	private String deleteFlag;

	@Column(name="HOLIDAY_DESC")
	private String holidayDesc;

	@Column(name="HOLIDAY_FLAG")
	private String holidayFlag;

	@Column(name="HOLIDAY_TYPE")
	private String holidayType;

	@Temporal(TemporalType.DATE)
	@Column(name="NATURAL_DAY")
	private Date naturalDay;

	@Column(name="SHOW_ORDER")
	private int showOrder;

	@Column(name="UP_DATA_BY")
	private String upDataBy;

	@Column(name="UP_DATA_TIME")
	private Timestamp upDataTime;

	public StKalendar() {
	}

	public String getDayId() {
		return this.dayId;
	}

	public void setDayId(String dayId) {
		this.dayId = dayId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getHolidayDesc() {
		return this.holidayDesc;
	}

	public void setHolidayDesc(String holidayDesc) {
		this.holidayDesc = holidayDesc;
	}

	public String getHolidayFlag() {
		return this.holidayFlag;
	}

	public void setHolidayFlag(String holidayFlag) {
		this.holidayFlag = holidayFlag;
	}

	public String getHolidayType() {
		return this.holidayType;
	}

	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}

	public Date getNaturalDay() {
		return this.naturalDay;
	}

	public void setNaturalDay(Date naturalDay) {
		this.naturalDay = naturalDay;
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

}