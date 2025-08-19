package com.tutorial.mvc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	@Column(name="a_id")
	private int aId;
	@Column(name = "a_name")
	private String aName;
	
	
	public Alien() {
		
	}
	
	
	public Alien(int aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}


	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}
	
	
	
}
