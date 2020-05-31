package com.boot.main.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.main.course.Courses;
public interface TopicRepo extends CrudRepository<Topics, String>{
	
	
}
