package com.webmvc.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	@NotEmpty(message="user name is required")
	private String uName;
	@NotEmpty(message="password is required")
	private String pwd;
	@NotEmpty(message="E-mail is required")
	@Email(message="Enter a valid e-mail")
	@Size(min=8, max=21, message="pass shoul between 8 to 21 characters")
	private String email;
	@NotEmpty(message="phone number is required")
	@Min(value=10, message="phone number is must 10 digist")
	private String phNo;
	
	
	@NotNull(message="age is required")
	@Min( value = 18, message="age must be above 18")
	@Max(value=50, message="age is below 50")
	private Integer age;
}
