package com.ty.home_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ty.home_service.util.CustomIdGenerator;

import lombok.Data;

@Entity
@Data
public class ServiceCost {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cost_seq")
	@GenericGenerator(name = "cost_seq", strategy = "com.ty.home_service.util.CustomIdGenerator", parameters = {
			@Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "10"),
			@Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "cost_"),
			@Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String id;
	@NotNull(message = "mode cant be null")
	@NotBlank(message ="mode cant be blank")
	private String mode;
	private double totalamount;
	@Min(1)
	private int days;
	
	

	

}
