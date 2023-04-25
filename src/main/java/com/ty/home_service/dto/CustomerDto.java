package com.ty.home_service.dto;

import org.springframework.stereotype.Controller;

import com.ty.home_service.entity.Address;

import lombok.Data;

@Data
@Controller
public class CustomerDto {

	private String id;
	private String name;
	private String email;
	private long phone;
	private int familycount;
	
	private Address address;


}
