package com.ty.home_service.dto;

import org.springframework.stereotype.Component;

import com.ty.home_service.entity.Address;

import lombok.Data;

@Component
@Data
public class VendorDto {
	
	
	private String id;
	private String name;
	private String email;
	private long phone;
	private String role;
	private double costperday;
	private String availability;
	private Address address;
	//private List<ServiceCost>payments;
	

}
