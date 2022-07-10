package com.appointment.appointmentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.appointmentservice.entities.UserEO;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserEO, Integer>{

	UserEO findByUserName(final String userName);
}
