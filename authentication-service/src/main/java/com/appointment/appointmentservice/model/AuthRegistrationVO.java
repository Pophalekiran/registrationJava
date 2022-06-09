package com.appointment.appointmentservice.model;

public class AuthRegistrationVO {

	
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNo;
	private boolean mfa;
	private String authTypeOne;
	private String authTypeTwo;
	private String authTypeThree;

	
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
	
	
	
	
	
}
