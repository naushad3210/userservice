package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.UserInfoEntity;

@Repository
public interface UserInfoRepo  extends JpaRepository<UserInfoEntity, Long>{

}
