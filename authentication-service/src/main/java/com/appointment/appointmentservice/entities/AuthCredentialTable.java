package com.appointment.appointmentservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AuthCredentialTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sysid;
	private String authType;
	private String authValue;
	private String authSalt;
	private String authStat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getAuthValue() {
		return authValue;
	}
	public void setAuthValue(String authValue) {
		this.authValue = authValue;
	}
	public String getAuthSalt() {
		return authSalt;
	}
	public void setAuthSalt(String authSalt) {
		this.authSalt = authSalt;
	}
	public String getAuthStat() {
		return authStat;
	}
	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}
	
	
	
}
