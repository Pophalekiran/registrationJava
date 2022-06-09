package com.appointment.appointmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.appointmentservice.model.AuthRegistrationResp;
import com.appointment.appointmentservice.model.AuthRegistrationVO;
import com.appointment.appointmentservice.model.LoginRequest;
import com.appointment.appointmentservice.model.LoginResponse;
import com.appointment.appointmentservice.service.AuthRegistrationService;

@RestController
@CrossOrigin("*")
public class AuthenticationController {

	@Autowired
	AuthRegistrationService authRegisterService;
	
	@PostMapping("/idp/login")
	public LoginResponse login(@RequestBody LoginRequest request) {
		LoginResponse response = new LoginResponse();
		if(request.getUserid().equals("admin") && request.getUserpass().equals("admin")) {
			response.setToken("Success");
		}else {
			response.setToken("Failed");
		}
		return response;
	}
	
	@PostMapping("/idp/registration")
	public AuthRegistrationResp register(@RequestBody AuthRegistrationVO request) {
		return authRegisterService.register(request);
	}
	
	@PostMapping("/idp/verification")
	public String register(@RequestParam String token) {
		return authRegisterService.validateRegistration(token);
	}
	
}
