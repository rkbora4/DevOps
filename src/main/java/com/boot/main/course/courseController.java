package com.boot.main.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.main.topic.Topics;

@RestController
public class courseController {
	@Autowired
	private courseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Courses> getAllcourses(@PathVariable String id) {
	
		return courseService.getAllCourses(id);
		
	}
	@RequestMapping("/topics/{topicid}/courses/{courseid}")
	public Courses getcourses(@PathVariable String courseid) {
		
		return courseService.getCourse(courseid);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicid}/courses")
	public void addcourses(@RequestBody Courses courses, @PathVariable String topicid) {
		courses.setTopic(new Topics(topicid,"",""));
		courseService.addCourse(courses);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicid}/courses/{courseid}")
	public void updatecourses(@RequestBody Courses courses,@PathVariable String topicid) {
		courses.setTopic(new Topics(topicid,"",""));
		courseService.updateCourse(courses);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicid}/courses/{courseid}")
	public void deletecourses(@PathVariable String courseid) {
		
		courseService.deleteCourse(courseid);
	}
}
