package com.appointment.appointmentservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_USER_TBL")
public class AuthUserTable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sysId;
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNo;
	private boolean mfa;
	private String authTypeOne;
	private String authTypeTwo;
	private String authTypeThree;
	private Date lastSuccessLogin;
	private Date lastFailedAttempt;
	private Date lastFailedAttemptCount;

	

	public int getSysId() {
		return sysId;
	}

	public void setSysId(int sysId) {
		this.sysId = sysId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public boolean isMfa() {
		return mfa;
	}

	public void setMfa(boolean mfa) {
		this.mfa = mfa;
	}

	public String getAuthTypeOne() {
		return authTypeOne;
	}

	public void setAuthTypeOne(String authTypeOne) {
		this.authTypeOne = authTypeOne;
	}

	public String getAuthTypeTwo() {
		return authTypeTwo;
	}

	public void setAuthTypeTwo(String authTypeTwo) {
		this.authTypeTwo = authTypeTwo;
	}

	public String getAuthTypeThree() {
		return authTypeThree;
	}

	public void setAuthTypeThree(String authTypeThree) {
		this.authTypeThree = authTypeThree;
	}

	public Date getLastSuccessLogin() {
		return lastSuccessLogin;
	}

	public void setLastSuccessLogin(Date lastSuccessLogin) {
		this.lastSuccessLogin = lastSuccessLogin;
	}

	public Date getLastFailedAttempt() {
		return lastFailedAttempt;
	}

	public void setLastFailedAttempt(Date lastFailedAttempt) {
		this.lastFailedAttempt = lastFailedAttempt;
	}

	public Date getLastFailedAttemptCount() {
		return lastFailedAttemptCount;
	}

	public void setLastFailedAttemptCount(Date lastFailedAttemptCount) {
		this.lastFailedAttemptCount = lastFailedAttemptCount;
	}

}
