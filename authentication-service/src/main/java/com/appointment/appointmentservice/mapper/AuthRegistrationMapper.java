package com.appointment.appointmentservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.appointment.appointmentservice.entities.AuthRegistrationTable;
import com.appointment.appointmentservice.model.AuthRegistrationVO;

@Mapper
public interface AuthRegistrationMapper {
	
	AuthRegistrationMapper INSTANCE = Mappers.getMapper(AuthRegistrationMapper.class);
	
	AuthRegistrationTable fromVO(AuthRegistrationVO vo);
}
