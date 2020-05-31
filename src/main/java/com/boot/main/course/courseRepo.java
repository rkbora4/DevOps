package com.boot.main.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface courseRepo extends CrudRepository<Courses, String>{
	public List<Courses> findByTopicId(String id);

}
