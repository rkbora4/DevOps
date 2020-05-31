package com.boot.main.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepo TopicRepo; 
/*	private List<Topics> topics = new ArrayList<>(Arrays.asList(new Topics("1", "Rohit Bora", "24", "Male"),
			new Topics("2", "Rohit Bora", "24", "Male"), new Topics("3", "Rohit Bora", "24", "Male"),
			new Topics("4", "Rohit Bora", "24", "Male")));*/

	public List<Topics> getAllTopics() {
		List<Topics> topics1=new ArrayList<>();
		 TopicRepo.findAll().forEach(topics1::add);
		 return topics1;
	}

	public Topics getTopic(String id) {
		
		return TopicRepo.findById(id).get();
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topics topics2) {
		//topics.add(topics2);
		TopicRepo.save(topics2);
	}

	public void updateTopic(Topics topics2, String id) {
		// TODO Auto-generated method stub
		TopicRepo.save(topics2);
		/*for(int i=0;i<topics.size();i++) {
			Topics t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topics2);
				return;
			}
		}*/
		}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		TopicRepo.deleteById(id);
	}


}
