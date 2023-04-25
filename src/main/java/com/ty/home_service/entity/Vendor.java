package com.ty.home_service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ty.home_service.util.CustomIdGenerator;

import lombok.Data;
@Entity
@Data
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vendor_seq")
	@GenericGenerator(name = "vendor_seq", strategy = "com.ty.home_service.util.CustomIdGenerator", parameters = {
			@Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "10"),
			@Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "vendor_"),
			@Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String id;
	@NotNull(message = "name cant be null")
	@NotBlank(message =" name cant be blank")
	private String name;
	@NotNull(message = "email cant be null")
	@NotBlank(message =" email cant be blank")
	@Column(unique = true)
	private String email;
	@NotNull(message = "pwd cant be null")
	@NotBlank(message ="pwd cant be blank")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "provide a strong password")
	private String pwd;
	@Min(600000000)
	@Max(9999999999l)
	private long phone;
	@NotNull(message = "role cant be null")
	@NotBlank(message ="role cant be blank")
	private String role;
	@DecimalMin("20")
	private double costperday;
	@NotNull(message = "message cant be null")
	@NotBlank(message ="cant be blank")
	private String availability;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToMany(cascade =  CascadeType.ALL)
	private List<ServiceCost>cost;
	

}
