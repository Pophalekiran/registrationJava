package com.appointment.appointmentservice.model;

public class UserVO {

	private int userId;

	private String userName;

	private String userPass;

	private boolean userStatus;
	
	private String userRegistrationToken;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public boolean isUserStatus() {
		return userStatus;
	}

	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserRegistrationToken() {
		return userRegistrationToken;
	}

	public void setUserRegistrationToken(String userRegistrationToken) {
		this.userRegistrationToken = userRegistrationToken;
	}
	
	

}
