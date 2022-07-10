package com.appointment.appointmentservice.model;

public class UserRegResp {
	
	private String referenceID;
	private boolean status;
	private String message;
	
	private UserRegResp(UserRegRespBuilder builder) {
		this.referenceID = builder.referenceID;
		this.status = builder.status;
		this.message = builder.message;
		
	}
	
	public String getReferenceID() {
		return referenceID;
	}
		
	public boolean isStatus() {
		return status;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	
	
	public static class UserRegRespBuilder{
		
		private String referenceID;
		private boolean status;
		private String message;
		
		public UserRegRespBuilder referenceID(String ref) {
			this.referenceID = ref;
			return this; 
		}
		
		public UserRegRespBuilder status(boolean status) {
			this.status = status;
			return this;
		}
		
		public UserRegRespBuilder message(String message) {
			this.message = message;
			return this;
		}
		
		public UserRegResp build() {
			
			UserRegResp registration = new UserRegResp(this);
			return registration;
		}
		
	}
	
}
