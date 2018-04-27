package curd.app.test.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired TopicRepository topicRepository;
	public List<Topic> getAllTopics(){
		
		
		System.out.println("getAll : "+topicRepository.findAll());
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
		
	}
	
	public String addTopic(Topic t){
		
		topicRepository.save(t);
		return "saved";
	}

}
