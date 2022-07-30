package com.eduardofacf.crudmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class User implements Serializable{
	
	private String id;
	private String name;
	private String gender;
	private String email;
	private Date birth;
	private String naturalness;
	private String nationality;
	private String cpf;
	
	public User() {
		
	}

	public User(String id, String name, String gender, String email, Date birth, String naturalness, String nationality,
			String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birth = birth;
		this.naturalness = naturalness;
		this.nationality = nationality;
		this.cpf = cpf;
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

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}
	
	

}
