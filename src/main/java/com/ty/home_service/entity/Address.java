package com.ty.home_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ty.home_service.util.CustomIdGenerator;

import lombok.Data;

@Entity
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
	@GenericGenerator(name = "address_seq", strategy = "com.ty.home_service.util.CustomIdGenerator", parameters = {
			@Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "10"),
			@Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "Ads_"),
			@Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String id;
	@NotNull(message = "d/no cant be null")
	@NotBlank(message ="d/no cant be blank")
	private String d_no;
	private String street;
	@NotNull(message = "lanmark cant be null")
	@NotBlank(message ="landmark cant be blank")
	private String landmark;
	@NotNull(message = "district cant be null")
	@NotBlank(message ="district cant be blank")
	private String district;
	@NotNull(message = "state cant be null")
	@NotBlank(message ="state cant be blank")
	private String state;
	@Min(100000)
	@Max(999999)
	private int pincode;

}
