package com.app.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter //de ser
@Getter // getting em n pwd
@ToString //only for debugging
//P.L validations 
public class AuthRequestDTO {
	@NotBlank(message ="moviename can't be blank!!!" )
	private String moviename;
}
