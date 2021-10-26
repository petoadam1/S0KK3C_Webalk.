package com.example.demo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;

public class PeopleDto {

	public PeopleDto(People people) {
		// TODO Auto-generated constructor stub
	}
	private Long id;
	@NotEmpty
	private String name;
	@Size(min=18)
	private int age;
}
