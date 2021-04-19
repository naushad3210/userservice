package com.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="USER_DETAILS", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
@Getter 
@Setter
public class UserInfoEntity{
	
	private static final long serialVersionUID = 6337667652250745029L;
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="NAME",unique=true)
	private String name;
	
	@Column(name="AGE")
	private Integer age;
	
	@Column(name="EMAIL")
	private String email;

}
