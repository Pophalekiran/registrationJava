package com.appointment.appointmentservice.service;

import com.appointment.appointmentservice.model.AuthRegistrationResp;
import com.appointment.appointmentservice.model.AuthRegistrationVO;

public interface AuthRegistrationService {

	AuthRegistrationResp register(final AuthRegistrationVO registration);
	String validateRegistration(final String token);
}
