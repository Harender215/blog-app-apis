package com.blog.application.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be mininum of 4 characters")
	private String name;
	
	@Email(message = "Email Address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be min of 3 characters and maximum of 10 characters")
	private String password;
	
	@NotEmpty
	private String about;
	
	
}
