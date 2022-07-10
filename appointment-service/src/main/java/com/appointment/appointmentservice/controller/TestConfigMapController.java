package com.appointment.appointmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.appointmentservice.config.AppConfig;

@RestController
@RequestMapping("/read")
public class TestConfigMapController {

	@Autowired
	AppConfig config;
	
	@GetMapping("/config")
	public String loadConfig() {
		
		return config.getMessage();
	}
	
}
