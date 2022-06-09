package com.appointment.appointmentservice.model;

public class AuthRegistrationResp {

	public AuthRegistrationResp(String redirectionUrl) {
		super();
		this.redirectionUrl = redirectionUrl;
	}

	private String redirectionUrl;

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public void setRedirectionUrl(String redirectionUrl) {
		this.redirectionUrl = redirectionUrl;
	}
	
	
}
