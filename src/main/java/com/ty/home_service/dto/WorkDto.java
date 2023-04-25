package com.ty.home_service.dto;

import java.sql.Date;



import org.springframework.stereotype.Component;

import com.ty.home_service.entity.Address;

import lombok.Data;

@Component
@Data
public class WorkDto {
	private String id;
	private String type;
	private Date startDate;
	private Date endDate;
	private Address address;
	

}
