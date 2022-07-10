package com.appointment.appointmentservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment.appointmentservice.entities.UserEO;
import com.appointment.appointmentservice.mapper.UserRegistrationMapper;
import com.appointment.appointmentservice.model.UserRegResp;
import com.appointment.appointmentservice.model.UserVO;
import com.appointment.appointmentservice.repo.UserRegistrationRepo;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	UserRegistrationRepo userRegistrationRepo;

	@Override
	public UserRegResp addUser(UserVO req) {
		UserRegistrationMapper mapper = UserRegistrationMapper.instance;
		req.setUserStatus(false);
		UserEO userEO = mapper.fromVO(req);
		String userToken = UUID.randomUUID().toString();
		userEO.setUserRegistrationToken(userToken);
		userRegistrationRepo.save(mapper.fromVO(req));
		return new UserRegResp.UserRegRespBuilder().message(userToken).build();
	}

	@Override
	public UserRegResp findByUserName(UserVO userRegReq) {

		UserEO userEO = userRegistrationRepo.findByUserName(userRegReq.getUserName());
		
		if(userRegReq.getUserRegistrationToken().equals(userEO.getUserRegistrationToken())){
			return new UserRegResp.UserRegRespBuilder().message("User Register").build();
		}
		
		return new UserRegResp.UserRegRespBuilder().message("User did not reqgister!!!").build();
	}

}
