package com.appointment.appointmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.appointmentservice.model.UserRegResp;
import com.appointment.appointmentservice.model.UserVO;
import com.appointment.appointmentservice.service.UserRegistrationService;

@RestController
@RequestMapping("/user")
public class UserRegistrationController {

	@Autowired
	UserRegistrationService userRegistrationService;
	@PostMapping("/registration")
	public UserRegResp userRegistration(@RequestBody UserVO userRegReq) {
		
		return userRegistrationService.addUser(userRegReq);
		
	}
	
	@PostMapping("/registration/verify")
	public UserRegResp registrationVerify(@RequestBody UserVO userRegReq) {
		
		return userRegistrationService.findByUserName(userRegReq);
		
	}
}
