package com.boot.main.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseService {
	@Autowired
	private courseRepo CourseRepo; 
/*	private List<Courses> Courses = new ArrayList<>(Arrays.asList(new Courses("1", "Rohit Bora", "24", "Male"),
			new Courses("2", "Rohit Bora", "24", "Male"), new Courses("3", "Rohit Bora", "24", "Male"),
			new Courses("4", "Rohit Bora", "24", "Male")));*/

	public List<Courses> getAllCourses(String topicid) {
		List<Courses> Courses1=new ArrayList<>();
		 CourseRepo.findByTopicId(topicid).forEach(Courses1::add);
		 return Courses1;
	}

	public Courses getCourse(String id) {
		
		return CourseRepo.findById(id).get();
		//return Courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addCourse(Courses Courses2) {
		//Courses.add(Courses2);
		CourseRepo.save(Courses2);
	}

	public void updateCourse(Courses Courses2) {
		// TODO Auto-generated method stub
		CourseRepo.save(Courses2);
		/*for(int i=0;i<Courses.size();i++) {
			Courses t=Courses.get(i);
			if(t.getId().equals(id)) {
				Courses.set(i, Courses2);
				return;
			}
		}*/
		}

	public void deleteCourse(String id) {
		//Courses.removeIf(t -> t.getId().equals(id));
		CourseRepo.deleteById(id);
	}


}
