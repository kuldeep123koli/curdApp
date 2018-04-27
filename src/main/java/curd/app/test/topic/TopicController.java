package curd.app.test.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired TopicService topicService;
	
	@RequestMapping("/name")
	public List<Topic> getAll(){
		
		return topicService.getAllTopics();
		
	}
	
	
	/*
	 * data structure
	 {
    "id": "four",
    "name": "history",
    "des": "Spring boot upgradation"
	}
	 */
	@RequestMapping(value="/addTopic", method=RequestMethod.POST)       
	public String saveTopic(@RequestBody Topic data){
		
		System.out.println("saveTopic in TopicController : "+data);
	return	topicService.addTopic(data);
	
		//return topicService.addTopic();
	}

}
