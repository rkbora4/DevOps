package com.boot.main.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.boot.main.topic.Topics;

@Entity
public class Courses {
	@Id
	private String id;
	private String name;
	private String descp;
	
	@ManyToOne
	private Topics topic;
	
	public Courses() {
		
	}
	public Courses(String id, String name, String descp,String topicid) {
		super();
		this.id = id;
		this.name = name;
		this.descp = descp;
		this.topic = new Topics(topicid,"","");
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
	public Topics getTopic() {
		return topic;
	}
	public void setTopic(Topics topic) {
		this.topic = topic;
	}
	


	
	
}
