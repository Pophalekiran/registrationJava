package com.appointment.appointmentservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.appointmentservice.entities.AuthRegistrationTable;
import com.appointment.appointmentservice.mapper.AuthRegistrationMapper;
import com.appointment.appointmentservice.model.AuthRegistrationResp;
import com.appointment.appointmentservice.model.AuthRegistrationVO;
import com.appointment.appointmentservice.repo.AuthRegistrationRepo;

@Service
public class AuthRegistrationServiceImpl implements AuthRegistrationService {

	@Autowired
	AuthRegistrationRepo registrationRepo;

	@Override
	public AuthRegistrationResp register(AuthRegistrationVO registration) {
		String token = UUID.randomUUID().toString();
		AuthRegistrationTable registrationEo = AuthRegistrationMapper.INSTANCE.fromVO(registration);
		registrationEo.setToken(token);
		registrationRepo.save(registrationEo);
		return new AuthRegistrationResp("http://localhost:8080/verification?token=" + token);
	}

	@Override
	public String validateRegistration(String token) {
		return registrationRepo.findByToken(token) != null ? "Success" : "Fail";
	}

}
