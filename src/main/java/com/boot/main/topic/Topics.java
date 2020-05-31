package com.boot.main.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {
	@Id
	private String id;
	private String name;
	private String descp;
	
	
	public Topics() {
		
	}
	public Topics(String id, String name, String descp) {
		super();
		this.id = id;
		this.name = name;
		this.descp = descp;

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
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	
	
	
}
