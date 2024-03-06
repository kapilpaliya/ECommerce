package com.shop.entities;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Component
public class LoginUsers {
	
	@NotBlank(message = "Email field not blank!") 
	@Pattern(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$") 
	private String email;
	
    @NotBlank(message = "Password field not blank!") 
    @Size(min=8,max=15,message = "password must have 8 to 15 character!") 
    private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginUsers [email=" + email + ", password=" + password + "]";
	}
    
    		


}
