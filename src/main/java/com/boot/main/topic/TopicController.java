package com.boot.main.topic;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	Logger logger = LoggerFactory.getLogger(TopicController.class);
	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		 logger.trace("A TRACE Message");
	        logger.debug("A DEBUG Message");
	        logger.info("An INFO Message");
	        logger.warn("A WARN Message");
	        logger.error("An ERROR Message");
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topics getTopics(@PathVariable String id) {
		
		return topicService.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopics(@RequestBody Topics topics) {
		
		topicService.addTopic(topics);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopics(@RequestBody Topics topics,@PathVariable String id) {
		
		topicService.updateTopic(topics,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopics(@PathVariable String id) {
		
		topicService.deleteTopic(id);
	}
}
