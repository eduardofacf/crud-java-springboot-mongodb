package com.eduardofacf.crudmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.eduardofacf.crudmongo.dto.ClientDTO;

@Document
public class Register implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private ClientDTO client;
	private Date date;
	
	public Register() {
		
	}

	public Register(String id, ClientDTO client, Date date) {
		super();
		this.id = id;
		this.client = client;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ClientDTO getClient() {
		return client;
	}

	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		return Objects.equals(id, other.id);
	}
}
