package com.user.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.contant.UserServiceErrorCodes;
import com.user.dto.UserInfo;
import com.user.entity.UserInfoEntity;
import com.user.exception.UserException;
import com.user.repository.UserInfoRepo;
import com.user.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepo userInfoRepo;

	@Override
	public UserInfo getUserInfo(Long userId) throws UserException {

		Optional<UserInfoEntity> userInfoEntity = userInfoRepo.findById(userId);

		UserInfo userInfo = null;
		if (userInfoEntity.isPresent()) {
			userInfo = new UserInfo();
			userInfo.setName(userInfoEntity.get().getName());
			userInfo.setAge(userInfoEntity.get().getAge());
			userInfo.setEmail(userInfoEntity.get().getEmail());
		} else {
			throw new UserException(Optional.of(UserServiceErrorCodes.NO_CONTENT.getHttpCode()), UserServiceErrorCodes.NO_CONTENT.getErrorCode(),
					UserServiceErrorCodes.NO_CONTENT.getErrorMessage());
		}

		return userInfo;
	}

}
