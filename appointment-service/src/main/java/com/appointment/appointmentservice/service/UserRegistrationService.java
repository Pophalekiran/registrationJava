package com.appointment.appointmentservice.service;

import com.appointment.appointmentservice.model.UserRegResp;
import com.appointment.appointmentservice.model.UserVO;

public interface UserRegistrationService {

	UserRegResp addUser(UserVO req);
	
	public UserRegResp findByUserName(UserVO userRegReq);
}
