package com.eduardofacf.crudmongo.dto;

import java.io.Serializable;
import java.util.Date;

import com.eduardofacf.crudmongo.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String gender;
	private String email;
	private Date birth;
	private String naturalness;
	private String nationality;
	private String cpf;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		gender = obj.getGender();
		email = obj.getEmail();
		birth = obj.getBirth();
		naturalness = obj.getNaturalness();
		nationality = obj.getNationality();
		cpf = obj.getCpf();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getNaturalness() {
		return naturalness;
	}

	public void setNaturalness(String naturalness) {
		this.naturalness = naturalness;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
