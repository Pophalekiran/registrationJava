package com.appointment.appointmentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.appointmentservice.entities.AuthUserTable;
@Repository
public interface AuthUserRepo extends JpaRepository<AuthUserTable, Integer> {

}
