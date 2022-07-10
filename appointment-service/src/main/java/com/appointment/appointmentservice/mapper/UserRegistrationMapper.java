package com.appointment.appointmentservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.appointment.appointmentservice.entities.UserEO;
import com.appointment.appointmentservice.model.UserVO;

@Mapper
public interface UserRegistrationMapper {

	UserRegistrationMapper instance = Mappers.getMapper(UserRegistrationMapper.class);
	
	UserEO fromVO(UserVO user);
	UserVO fromEO(UserEO user);
}
