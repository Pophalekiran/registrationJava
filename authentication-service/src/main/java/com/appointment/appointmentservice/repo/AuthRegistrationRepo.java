package com.appointment.appointmentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.appointmentservice.entities.AuthRegistrationTable;
@Repository
public interface AuthRegistrationRepo extends JpaRepository<AuthRegistrationTable, Integer>{
	AuthRegistrationTable findByToken(final String token);
}
